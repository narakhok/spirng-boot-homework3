package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.model.Book;
import com.boot.service.BookService;
@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public String index(Model model) {
		List<Book> bookList = bookService.findAll();
		model.addAttribute("bookList", bookList);
		return "index";
	}
	
	
	@RequestMapping(value="/book/{id}")
	public String bookDetail(@PathVariable("id") Integer id, Model model){
		Book book = bookService.findById(id);
		model.addAttribute("bookdetail", book);
		return "bookdetail";
	}
	
}
