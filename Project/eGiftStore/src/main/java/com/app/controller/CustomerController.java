package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Gifts;
import com.app.service.UserService;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private UserService userService;
	
	//--------------------------------------------------------------------------------------
	@GetMapping("/allGifts")
	public List<Gifts> findAllGifts(){
		return userService.findAllGifts();
	}
	
	@PutMapping("/updateFirstname{id}{firstname}")
	public void updatFirstName(Long id,String fname) {
		userService.updateFirstNameById(id, fname);
	}
	@PutMapping("/updateLastname{id}{lastname}")
	public void updateLastName(Long id,String lname) {
		userService.updateLastNameById(id, lname);
	}
	@PutMapping("/updateMobile{id}{mobile}")
	public void updateMobile(Long id,String mobile) {
		userService.updateMobileById(id, mobile);
	}
	@PutMapping("/updatePassowrd{id}{password}")
	public void updatePassword(Long id,String password) {
		userService.updateMobileById(id, password);
	}
}
