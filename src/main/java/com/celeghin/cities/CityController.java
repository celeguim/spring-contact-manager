package com.celeghin.cities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cities")
public class CityController {

	@Autowired
	private CityService service;

	@GetMapping
	public String viewHomePage(Model model) {
		List<City> cityList = service.getAll();
		model.addAttribute("cityList", cityList);
		return "cities";
	}

}
