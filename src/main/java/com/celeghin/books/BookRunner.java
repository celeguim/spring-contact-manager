package com.celeghin.books;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(BookRunner.class);

	@Autowired
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {

		logger.info("Saving books");

		bookRepository.save(new Book("Nenhum de nos", "Agata Triste", "Desesperados"));
		bookRepository.save(new Book("Perdido em algum lugar", "Michael Jefferson", "Aliens"));
	}

}
