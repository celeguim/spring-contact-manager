package com.celeghin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.celeghin.contacts.Contact;
import com.celeghin.contacts.ContactRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner sampleData(ContactRepository repo) {
		return (args) -> {
			Contact contact1 = new Contact();
			contact1.setAddress("Jacques Georgin, 30");
			contact1.setCountry("Belgium");
			contact1.setName("Luiz Celeghin");
			contact1.setPhone("+32444997788");
			repo.save(contact1);
		};
	}

}
