package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Role;
import com.app.entities.User;
import com.app.service.UserAuthenticationService;

@RestController
@RequestMapping("login")
public class UserLoginController {
	
	@Autowired
	private UserAuthenticationService userAuthService;
	
	@GetMapping("/loginUser{email}{password}{role}")
	public User loginCustomer(String email,String password,Role role) {
		return userAuthService.FindUserByEmailByPasswordByRole(email, password, role);
	}

}
