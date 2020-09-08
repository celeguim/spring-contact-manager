package com.celeghin.contacts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping(value = "/contacts", produces = MediaType.APPLICATION_JSON_VALUE)
	public Iterable<Contact> getContacts() {
		return service.getAll();
	}

	public List<Contact> getAll() {
		return (service.getAll());
	}

	public void save(Contact product) {
		service.save(product);
	}

	public Contact get(long id) {
		return service.get(id);
	}

	public void delete(long id) {
		service.delete(id);
	}

}
