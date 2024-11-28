package com.example.users.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "books")
@Data
public class Book {
    @Id
    private String id;
    private String name;
    private String description;
    private double price;

    // Getters and Setters
}
