package com.evanjkish.books.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.evanjkish.books.models.Book;
import com.evanjkish.books.services.BookService;
@RestController
public class BooksApi {
 private final BookService bookService;
 public BooksApi(BookService bookService){
     this.bookService = bookService;
 }
 @RequestMapping("/api/books")
 public List<Book> index() {
     return bookService.allBooks();
 }
 
 @PostMapping("/api/books")
 public Book create(@RequestParam("title") String title, @RequestParam("description") String desc, @RequestParam("language") String lang, @RequestParam("pages") Integer numOfPages) {
     Book book = new Book(title, desc, lang, numOfPages);
     return bookService.createBook(book);
 }
 
 @RequestMapping("/api/books/{id}")
 public Book show(@PathVariable("id") Long id) {
     Book book = bookService.findBook(id);
     return book;
 }
 

 @PutMapping("/api/books/{id}")
 public Book update(
 		@PathVariable("id") Long id, 
 		@RequestParam(value="title") String title, 
 		@RequestParam(value="description") String desc, 
 		@RequestParam(value="language") String lang,
 		@RequestParam(value="pages") Integer numOfPages) {
	 Book book = new Book(title, desc, lang, numOfPages);
 	
 	
     book = bookService.updateBook(book);
     
     return book;

 }
 
 @DeleteMapping("/api/books/{id}")
 public void destroy(@PathVariable("id") Long id) {
     bookService.deleteBook(id);
 }
}