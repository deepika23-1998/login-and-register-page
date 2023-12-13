package com.ty.employee.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ty.employee.service.UserService;
import com.ty.employee.web.dto.UserRegisterationDto;

 

@Controller
//@RequestMapping("/register")
public class UserRegisterController {
	
	private UserService userService;
	 

	public UserRegisterController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")//this object is passing html
	public UserRegisterationDto userRegisteration() {
		return new UserRegisterationDto();
	}
	
	@GetMapping("/register")
	public String showRegisterationForm() {
		return "register";//register.html
	}
//	//or	
//	@GetMapping("/register")
//	public String showRegisterationForm(Model  model) {
//		model.addAttribute("user", model);
//		return "register";//register.html
//	}
	
	@PostMapping("/register")
	public String registerUserAccount(@ModelAttribute("user") UserRegisterationDto userRegisteration) {
		userService.save(userRegisteration);
		return "redirect:/register?success";//success is a msg
	}
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}

	   
	 
}
