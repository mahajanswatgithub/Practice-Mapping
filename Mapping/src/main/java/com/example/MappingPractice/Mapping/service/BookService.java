package com.example.MappingPractice.Mapping.service;

import com.example.MappingPractice.Mapping.model.Book;
import com.example.MappingPractice.Mapping.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo;

    public void addBook(Book book) {
        bookRepo.save(book);
    }

    public Iterable<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public void updateBookByBookPrice(String id, String price) {
        bookRepo.updateBookByBookPrice(id,price);
    }

    public void deleteBookById(String id) {
        bookRepo.deleteById(id);
    }
}
