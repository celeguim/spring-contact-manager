package com.celeghin.books;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookRestController {

	@Autowired
	private BookService service;

	@GetMapping
	public List<Book> books() {
		return service.getAll();
	}

	@GetMapping("/find/{id}")
	public Optional<Book> findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
}
