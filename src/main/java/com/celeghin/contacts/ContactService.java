package com.celeghin.contacts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ContactService {

	@Autowired
	private ContactRepository repo;

	public List<Contact> getAll() {
		return repo.findAll();
	}

	public void save(Contact product) {
		repo.save(product);
	}

	public Contact get(long id) {
		return repo.findById(id).get();
	}

	public void delete(long id) {
		repo.deleteById(id);
	}

}
