package de.camperapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import de.camperapi.entity.Campsite;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/campsite")
	public Campsite greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		//return new Test Object
		return null;
}

}
