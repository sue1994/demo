package com.example.demo.controller;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.SortOrder;
import co.elastic.clients.elasticsearch.core.*;
import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import com.example.demo.document.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author baseus
 */
@RestController
@RequestMapping("/documentTest")
public class DocumentTestController {
   /* @Resource
    private ElasticsearchClient elasticsearchClient;

    @RequestMapping("/insert")
    public void insert() throws IOException {
        User user = new User("1", "user1", "男", 18);
        IndexResponse indexResponse = elasticsearchClient.index(i -> i
                .index("user")
                //设置id
                .id("1")
                //传入user对象
                .document(user));
        System.out.println(indexResponse);
    }

    @RequestMapping("/update")
    public void update() throws IOException {
        UpdateResponse<User> updateResponse = elasticsearchClient.update(u -> u
                        .index("user")
                        .id("1")
                        .doc(new User("1", "user2", "男", 19))
                , User.class);
        System.out.println(updateResponse);
    }

    @RequestMapping("/isExists")
    public void isExists() throws IOException {
        BooleanResponse indexResponse = elasticsearchClient.exists(e -> e.index("user").id("1"));
        System.out.println(indexResponse.value());
    }

    @RequestMapping("/get")
    public void get() throws IOException {
        GetResponse<User> getResponse = elasticsearchClient.get(g -> g
                        .index("user")
                        .id("1")
                , User.class
        );
        System.out.println(getResponse.source());
    }

    @RequestMapping("/delete")
    public void delete() throws IOException {
        DeleteResponse deleteResponse = elasticsearchClient.delete(d -> d
                .index("user")
                .id("1")
        );
        System.out.println(deleteResponse.id());
    }

    @RequestMapping("/insertMultiple")
    public void insertMultiple() throws IOException {
        List<User> userList = new ArrayList<>();
        userList.add(new User("10", "user1", "男", 18));
        userList.add(new User("11", "user2", "男",19));
        userList.add(new User("12", "user3", "女",20));
        userList.add(new User("13", "user4", "女",21));
        userList.add(new User("14", "user5", "女",22));
        List<BulkOperation> bulkOperationArrayList = new ArrayList<>();
        //遍历添加到bulk中
        for(User user : userList){
            bulkOperationArrayList.add(BulkOperation.of(o->o.index(i->i.id(user.getId()).document(user))));
        }
        BulkResponse bulkResponse = elasticsearchClient.bulk(b -> b.index("user")
                .operations(bulkOperationArrayList));
        System.out.println(bulkResponse);
    }

    @RequestMapping("/getComplex")
    public void getComplex() throws IOException {
        SearchResponse<User> search = elasticsearchClient.search(s -> s
                .index("user")
                //查询name字段包含hello的document(不使用分词器精确查找)
                .query(q -> q
                        .term(t -> t
                                .field("name")
                                .value(v -> v.stringValue("hello"))
                        ))
                //分页查询，从第0页开始查询3个document
                .from(0)
                .size(3)
                //按age降序排序
                .sort(f->f.field(o->o.field("age").order(SortOrder.Desc))),User.class
        );
        for (Hit<User> hit : search.hits().hits()) {
            System.out.println(hit.source());
        }
    }*/
}
