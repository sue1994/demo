package com.example.demo.controller;

import com.example.demo.document.Book;
import com.example.demo.enums.CodeEnum;
import com.example.demo.repository.BookRepository;
import com.example.demo.vo.BookVo;
import com.example.demo.vo.ResponseVo;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Resource
    BookRepository bookRepository;

    /**
     * 查询全部
     *
     * @return /
     */
    @GetMapping("/findAll")
    public ResponseVo<Iterable<Book>> findAll() {
        Iterable<Book> books = bookRepository.findAll();
        return new ResponseVo<>(books);
    }

    /**
     * 向es中增加book
     *
     * @param book /
     * @return /
     */
    @PostMapping("/add")
    public ResponseVo<Book> addBook(@RequestBody Book book) {
        Book save = bookRepository.save(book);
        return new ResponseVo<>(save);
    }

    /**
     * 根据id查询
     *
     * @param id /
     * @return /
     */
    @GetMapping("/findById")
    public ResponseVo<Optional<Book>> findById(@RequestParam("id") Long id) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        return new ResponseVo<>(bookOptional);

    }

    /**
     * 通过传入实体删除
     *
     * @param book /
     * @return /
     */
    @PostMapping("/delete")
    public ResponseVo<Boolean> delete(@RequestBody Book book) {
        bookRepository.delete(book);
        return new ResponseVo<>(true);
    }

    /**
     * 通过id删除
     *
     * @param id /
     * @return /
     */
    @GetMapping("/deleteById")
    public ResponseVo<Boolean> delete(@RequestParam("id") Long id) {
        bookRepository.deleteById(id);
        return new ResponseVo<>(true);
    }

    /**
     * 更新某个属性值(如：name)
     * @param bookVo /
     */
    /*@PostMapping("/update")
    public ResponseVo<Book> update(@RequestBody BookVo bookVo) {
        //获取需要更新的文档id
        Long id = bookVo.getId();
        Optional<Book> option = bookRepository.findById(id);
        if (option.isPresent()) {
            Book book = option.get();
            if (StringUtils.isNotEmpty(bookVo.getName())) {
                book.setName(bookVo.getName());
            }
            Book save = bookRepository.save(book);
            return new ResponseVo<>(book);
        }
        return new ResponseVo<>(CodeEnum.code, "更新失败！");
    }*/

    /**
     * 统计数量
     *
     * @return /
     */
    @GetMapping("/count")
    public ResponseVo<Long> count() {
        long count = bookRepository.count();
        return new ResponseVo<>(count);
    }

    /**
     * 查看id是否存在
     * @param id /
     * @return /
     */
    @GetMapping("/existsById")
    public ResponseVo<Boolean> update(@RequestParam("id") Long id) {
        boolean exists = bookRepository.existsById(id);
        return new ResponseVo<>(exists);
    }

    /**
     * 根据name和price查询
     * @param name /
     * @param price /
     * @return /
     */
   /* @GetMapping("/findByNameAndPrice")
    public ResponseVo<List<Book>> findByNameAndPrice(@RequestParam("name") String name, @RequestParam("price") Double price) {
        List<Book> books = bookRepository.findByNameAndPrice(name, price);
        return new ResponseVo<>(books);
    }*/

    /**
     * 根据summary和parent查询
     * @param summary /
     * @param parent /
     * @return /
     */
    /*@GetMapping("/findBySummaryAndParent")
    public ResponseVo<List<Book>> findBySummaryAndParent(@RequestParam("summary") String summary, @RequestParam("parent") String parent) {
        List<Book> books = bookRepository.findBySummaryAndParent(summary, parent);
        return new ResponseVo<>(books);
    }*/
}
