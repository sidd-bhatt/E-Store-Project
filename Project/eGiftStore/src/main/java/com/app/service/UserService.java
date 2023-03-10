package com.app.service;

import java.util.List;

import com.app.entities.Gifts;

public interface UserService {	
	public void deleteUserById(Long id);
	public List<Gifts> findAllGifts();
	public void updateFirstNameById(Long id,String fname);
	public void updateLastNameById(Long id,String lname);
	public void updateMobileById(Long id,String mobile);
	public void updatePasswordById(Long id,String password);

}
