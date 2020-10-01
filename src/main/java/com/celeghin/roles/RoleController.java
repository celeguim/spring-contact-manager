package com.celeghin.roles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("roles")
public class RoleController {

	@Autowired
	private RoleService service;

	@GetMapping
	public String viewHomePage(Model model) {
		List<Role> rolesList = service.getAll();
		model.addAttribute("rolesList", rolesList);
		return "roles";
	}

	@GetMapping(path = "new")
	public String newRole(Model mode) {

		return "roles_new";
	}

	@RequestMapping(path = "save", method = RequestMethod.POST)
	public String saveRole(@RequestParam String roleName, Model model) {
		Role newRole = new Role(roleName);
		service.save(newRole);
		return viewHomePage(model);
	}

}
