package com.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.model.Book;

@Service
public class BookService {

	private List<Book> bookList = new ArrayList<>();

	public BookService() {
		bookList.add(new Book(1, "Spring in Action: Covers Spring 4", "2016", "Craig Walls", 690,
				"https://images-na.ssl-images-amazon.com/images/I/51gHy16h5TL._SX397_BO1,204,203,200_.jpg"));
		bookList.add(new Book(2, "Spring in Action: Covers Spring 4", "2016", "Craig Walls", 690,
				"https://images-na.ssl-images-amazon.com/images/I/41H1hqdk0qL._SX348_BO1,204,203,200_.jpg"));
		bookList.add(new Book(3, "Spring in Action: Covers Spring 4", "2016", "Craig Walls", 690,
				"https://images-na.ssl-images-amazon.com/images/I/51XDLVLQOOL._SX396_BO1,204,203,200_.jpg"));
		bookList.add(new Book(4, "Spring in Action: Covers Spring 4", "2016", "Craig Walls", 690,
				"https://images-na.ssl-images-amazon.com/images/I/41QH0II9EIL._SX348_BO1,204,203,200_.jpg"));
		bookList.add(new Book(5, "Spring in Action: Covers Spring 4", "2016", "Craig Walls", 690,
				"https://images-na.ssl-images-amazon.com/images/I/513NSlmxTuL._SX404_BO1,204,203,200_.jpg"));
		bookList.add(new Book(6, "Spring in Action: Covers Spring 4", "2016", "Craig Walls", 690,
				"https://images-na.ssl-images-amazon.com/images/I/41hViYEq-FL._SX349_BO1,204,203,200_.jpg"));
		bookList.add(new Book(7, "Spring in Action: Covers Spring 4", "2016", "Craig Walls", 690,
				"https://images-na.ssl-images-amazon.com/images/I/41cN4WKDkgL._SX348_BO1,204,203,200_.jpg"));
		bookList.add(new Book(8, "Spring in Action: Covers Spring 4", "2016", "Craig Walls", 690,
				"https://images-na.ssl-images-amazon.com/images/I/41cN4WKDkgL._SX348_BO1,204,203,200_.jpg"));
		bookList.add(new Book(9,"Spring in Action: Covers Spring 4", "2016", "Craig Walls", 690,
				"https://images-na.ssl-images-amazon.com/images/I/41cN4WKDkgL._SX348_BO1,204,203,200_.jpg"));
		bookList.add(new Book(10, "Spring in Action: Covers Spring 4", "2016", "Craig Walls", 690,
				"https://images-na.ssl-images-amazon.com/images/I/41xhtBInAML._SX331_BO1,204,203,200_.jpg"));
		bookList.add(new Book(11,"Spring in Action: Covers Spring 4", "2016", "Craig Walls", 690,
				"https://images-na.ssl-images-amazon.com/images/I/51xSnBuFyEL._SX404_BO1,204,203,200_.jpg"));
		bookList.add(new Book(12, "Spring in Action: Covers Spring 4", "2016", "Craig Walls", 690,
				"https://images-na.ssl-images-amazon.com/images/I/51Hn3FNiFHL._SX404_BO1,204,203,200_.jpg"));
	}

	public List<Book> findAll() {
		return bookList;
	}

	public Book findById(Integer id) {
		for (Book book : bookList) {
			if (book.getId() == id)
				return book;
		}
		return null;
	}
}
