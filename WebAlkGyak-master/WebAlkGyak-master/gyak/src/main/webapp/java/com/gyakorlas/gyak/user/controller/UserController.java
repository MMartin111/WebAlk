package com.gyakorlas.gyak.user.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gyakorlas.gyak.user.DAO.repo.UserRepository;
import com.gyakorlas.gyak.user.businessLogic.entity.UserEntity;
import com.gyakorlas.gyak.user.businessLogic.service.UserService;

@Controller
public class UserController {
	
	private UserService service;
	//private UUID id;

	public UserController(UserService service) {
		//this.id = id;
		this.service = service;
	}
	
	@RequestMapping("/showRegistration")
	public String showregistration() {
		return "/registerUser";
	}
	
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user")UserEntity user) {
		
		//user.setUserId(id.randomUUID().toString());
		service.createUser(user);
		
		return "/showlogin";
	}
	
	@RequestMapping("/showlogin")
	public String showLogin() {
		return "/login";
	}
	
	@RequestMapping(value = "/login")
	public String findByID(@RequestParam("ID") String ID, ModelMap modelMap) {
		
		
		UserEntity user = service.findUser(ID);
		
		modelMap.addAttribute("user", user);
		return "/login";
	}
}
