package com.app.repository;

public interface UserJPQLRepository {
	
	public void updateFirstNameById(Long id,String fname);
	public void updateLastNameById(Long id,String lname);
	public void updateMobileById(Long id,String mobile);
	public void updatePasswordById(Long id,String password);
}
