package com.example.users.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.users.models.Book;
import com.example.users.repositories.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Optional<Book> getBookById(String id) {
        return repository.findById(id);
    }

    public Book createBook(Book book) {
        return repository.save(book);
    }

    public Book updateBook(String id, Book book) {
        return repository.findById(id).map(existing -> {
            existing.setName(book.getName());
            existing.setDescription(book.getDescription());
            existing.setPrice(book.getPrice());
            return repository.save(existing);
        }).orElseThrow(() -> new RuntimeException("Livro não encontrado"));
    }

    public void deleteBook(String id) {
        repository.deleteById(id);
    }
}
