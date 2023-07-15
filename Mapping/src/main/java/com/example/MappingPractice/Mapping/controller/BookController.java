package com.example.MappingPractice.Mapping.controller;

import com.example.MappingPractice.Mapping.model.Book;
import com.example.MappingPractice.Mapping.model.Student;
import com.example.MappingPractice.Mapping.service.BookService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    // add book Info
    @PostMapping("book")
    public void addBook(@RequestBody @Valid Book book)
    {
        bookService.addBook(book);
    }

    //get all books
    @GetMapping("books")
    public Iterable<Book> getAllBooks()
    {
       return bookService.getAllBooks();
    }

    //update book by price using bookId
    @PutMapping("book/{id}/{price}")
    public void updateBookByBookPrice(@PathVariable String id,@PathVariable String price)
    {
        bookService.updateBookByBookPrice(id,price);
    }

    //delete book using bookId
    @DeleteMapping("book/{id}")
    public void deleteBookById(@PathVariable String id)
    {
        bookService.deleteBookById(id);
    }

}
