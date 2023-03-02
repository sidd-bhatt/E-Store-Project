package com.app.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repository.UserRepository;
import com.app.service.UserService;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}


}
