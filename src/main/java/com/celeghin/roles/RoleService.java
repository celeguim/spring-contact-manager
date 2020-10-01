package com.celeghin.roles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleService {
	@Autowired
	RoleRepository repo;

	public List<Role> getAll() {
		return repo.findAll();
	}

	public void save(Role role) {
		repo.save(role);
		
	}
}
