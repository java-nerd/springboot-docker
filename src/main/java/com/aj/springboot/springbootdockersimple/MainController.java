package com.aj.springboot.springbootdockersimple;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("title", "Spring + Docker Example");
		model.addAttribute("msg", "Hurray! You have made it.");
		return "index";
	}
}
