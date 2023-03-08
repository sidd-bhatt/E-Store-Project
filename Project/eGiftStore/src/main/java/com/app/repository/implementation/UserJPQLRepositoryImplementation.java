package com.app.repository.implementation;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entities.User;
import com.app.repository.UserJPQLRepository;
@Repository
public class UserJPQLRepositoryImplementation implements UserJPQLRepository{

	@Autowired
	EntityManager manager;
	
	@Override
	public void updateFirstNameById(Long id,String name) {
		String jpql="update User u set u.firstName=:fn where u.id=:id";
		manager.createQuery(jpql,User.class)
		.setParameter("fn",name)
		.setParameter("id", id)
		.executeUpdate();		
	}

	@Override
	public void updateLastNameById(Long id,String name) {
		String jpql="update User u set u.lastName=:ln where u.id=:id";
		manager.createQuery(jpql,User.class)
		.setParameter("ln",name)
		.setParameter("id", id)
		.executeUpdate();
		
	}

	@Override
	public void updateMobileById(Long id,String mobile) {
		String jpql="update User u set u.mobile=:mn where u.id=:id";
		manager.createQuery(jpql,User.class)
		.setParameter("mn",mobile)
		.setParameter("id", id)
		.executeUpdate();
		
	}

	@Override
	public void updatePasswordById(Long id,String password) {
		String jpql="update User u set u.password=:pwd where u.id=:id";
		manager.createQuery(jpql,User.class)
		.setParameter("pwd",password)
		.setParameter("id", id)
		.executeUpdate();
		
	}

}
