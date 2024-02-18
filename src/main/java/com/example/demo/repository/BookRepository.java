package com.example.demo.repository;

import com.example.demo.document.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author
 */
public interface BookRepository extends ElasticsearchRepository<Book, Long> {
}
