package com.celeghin.roles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RoleRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(RoleRunner.class);

	@Autowired
	private RoleRepository repo;

	@Override
	public void run(String... args) throws Exception {
		logger.info("Saving roles");

		repo.save(new Role("ADMIN"));
		repo.save(new Role("USER"));
	}

}
