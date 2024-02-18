package com.example.demo.controller;

import cn.hutool.json.JSONUtil;
import com.example.demo.document.User;
import com.example.demo.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    /**
     * 添加
     */
    @RequestMapping("/insert")
    public String insert() {
        User user = new User();
        user.setId("1");
        user.setName("徐一杰");
        user.setSex("男");
        user.setAge(22);
        userRepository.save(user);
        return "success";
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public String delete() {
        User user = userRepository.findById("1").get();
        userRepository.delete(user);
        return "success";
    }

    /**
     * 局部更新
     */
    @RequestMapping("/update")
    public String update() {
        User user = userRepository.findById("1").get();
        user.setName("泡泡");
        userRepository.save(user);
        return "success";
    }
    /**
     * 查询
     */
    @RequestMapping("/get")
    public User get() {
        User user = userRepository.findById("1").get();
        System.out.println(user);
        return user;
    }

    @RequestMapping("/getAll")
    public Page<User> getAll() {
        Pageable pageable = PageRequest.of(1,20);
        Page<User> user = userRepository.findAll(pageable);
        System.out.println(JSONUtil.toJsonStr(user));
        return user;
    }
    /*@RequestMapping("/findByQuery")
    public Page<User> findByQuery() {
        Pageable pageable = PageRequest.of(1,20, Sort.by(new Sort.Order(Sort.Direction.ASC, "age")));
        Page<User> userList = userRepository.findByName("1", pageable);
        System.out.println(userList);
        return userList;
    }*/
}
