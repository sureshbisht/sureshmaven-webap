package com.greatlearning.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
@RequestMapping("/")
public String giveWelcomeMassage(ModelMap model) {
	
	model.addAttribute("message","Spring MVC thymeleaf hello woeld");
	return "welcom";
}
}
