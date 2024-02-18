package com.example.demo.repository;

import com.example.demo.document.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author
 */
public interface UserRepository extends ElasticsearchRepository<User, String> {
}
