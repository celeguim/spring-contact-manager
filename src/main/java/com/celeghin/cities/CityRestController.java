package com.celeghin.cities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cities")
public class CityRestController {

	@Autowired
	private CityService service;

	@GetMapping
	public List<City> cities() {
		return service.getAll();
	}

}
