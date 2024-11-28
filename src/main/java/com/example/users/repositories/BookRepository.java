package com.example.users.repositories;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.users.models.Book;


public interface BookRepository extends MongoRepository<Book, String> {
}
