package com.app.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserAdd;
import com.app.entities.GiftCategory;
import com.app.entities.User;
import com.app.service.UserRegisterService;

@RestController
@RequestMapping("register")
public class UserRegistrationController {
	
	@Autowired
	UserRegisterService userRegService;
	@Autowired
	private ModelMapper mapper;
	
	@PostMapping("/addUser")
	public User registerCustomer(@RequestBody UserAdd newUser) {
		User user=mapper.map(newUser, User.class);
		return userRegService.addUser(user);
	}

}
