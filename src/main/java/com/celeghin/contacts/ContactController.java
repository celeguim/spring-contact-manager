package com.celeghin.contacts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

	@Autowired
	private ContactService service;

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Contact> contactList = service.getAll();
		model.addAttribute("contactList", contactList);
		return "index";
	}

	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") long id) {
		ModelAndView mav = new ModelAndView("edit_contact");
		Contact contact = service.get(id);
		mav.addObject("contact", contact);

		return mav;
	}

}
