/**
 * 
 */
package com.evanjkish.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.evanjkish.books.models.Book;
import com.evanjkish.books.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	
	@GetMapping("/show/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		
		return "show.jsp";
	}
 
}
