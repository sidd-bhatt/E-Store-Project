package com.app.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Gifts;
import com.app.entities.User;
import com.app.repository.GiftsRepository;
import com.app.repository.UserJPQLRepository;
import com.app.repository.UserRepository;
import com.app.service.UserService;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private GiftsRepository giftsRepository;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private UserJPQLRepository userJpqlRepo;
	
	
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public List<Gifts> findAllGifts() {
		return giftsRepository.findAll();
	}

	@Override
	public void updateFirstNameById(Long id, String fname) {
		userJpqlRepo.updateFirstNameById(id, fname);
	}

	@Override
	public void updateLastNameById(Long id, String lname) {
		userJpqlRepo.updateLastNameById(id, lname);
	}

	@Override
	public void updateMobileById(Long id, String mobile) {
		userJpqlRepo.updateMobileById(id, mobile);
	}

	@Override
	public void updatePasswordById(Long id, String password) {
		userJpqlRepo.updatePasswordById(id, password);
	}
}
