package com.qspider.Bookapi.Service;

import com.qspider.Bookapi.Model.Book;
import com.qspider.Bookapi.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository repository;
    public List<Book> getBooks(){
        List<Book>bookList=repository.findAll();
        return bookList;
    }
    public Book getBooksByID(int id){
        Book b= repository.findById(id).orElse(null);
        return b;
    }
    public  void addBooks(Book b){
        repository.save(b);
    }
    public void updateBook(Book b){
        repository.save(b);
    }
    public void deleteBook(int id){
        repository.deleteById(id);
    }

}
