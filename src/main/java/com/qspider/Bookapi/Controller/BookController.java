package com.qspider.Bookapi.Controller;

import com.qspider.Bookapi.Model.Book;

import com.qspider.Bookapi.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService service;
    @GetMapping("/books")
    public List<Book> getbook(){
        return service.getBooks();
    }
    @GetMapping("/books/{id}")
    public Book getBooksById(@PathVariable int id){
        return service.getBooksByID(id);
    }
    @PostMapping("/books")
    public void getAddBook(@RequestBody Book b){
        service.addBooks(b);}
    @PutMapping("/books")
    public void updateBook(@RequestBody Book b){
        service.updateBook(b);
    }
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable int id){
        service.deleteBook(id);
        }


}
