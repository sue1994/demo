package com.example.demo.controller;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.indices.CreateIndexResponse;
import co.elastic.clients.elasticsearch.indices.DeleteIndexResponse;
import co.elastic.clients.elasticsearch.indices.GetIndexResponse;
import co.elastic.clients.transport.endpoints.BooleanResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/indexTest")
public class IndexTestController {
    /*private final ElasticsearchClient elasticsearchClient;

    public IndexTestController(ElasticsearchClient elasticsearchClient){
        this.elasticsearchClient = elasticsearchClient;
    }

    @GetMapping("/insert")
    public void insert() throws IOException {
        CreateIndexResponse createIndexResponse = elasticsearchClient.indices().create(c -> c.index("user"));
        System.out.println(createIndexResponse);
    }

    @GetMapping("/get")
    public void get() throws IOException {
        GetIndexResponse getIndexResponse = elasticsearchClient.indices().get(c -> c.index("user"));
        System.out.println(getIndexResponse);
    }

    @GetMapping("/delete")
    public void delete() throws IOException {
        DeleteIndexResponse deleteIndexResponse = elasticsearchClient.indices().delete(c -> c.index("user"));
        System.out.println(deleteIndexResponse.acknowledged());
    }

    @GetMapping("/isExists")
    public void isExists() throws IOException {
        BooleanResponse booleanResponse = elasticsearchClient.indices().exists(c -> c.index("user"));
        System.out.println(booleanResponse.value());
    }*/
}
