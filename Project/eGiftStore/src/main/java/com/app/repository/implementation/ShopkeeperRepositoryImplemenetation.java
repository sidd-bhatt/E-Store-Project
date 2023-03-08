package com.app.repository.implementation;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entities.Gifts;
import com.app.repository.ShopkeeperRepository;

@Repository
public class ShopkeeperRepositoryImplemenetation implements ShopkeeperRepository{

	@Autowired
	EntityManager manager;
	
	@Override
	public void updateGiftName(Long id, String name) {
		String jpql="update Gifts g set g.giftName=:nm where g.id=:id";
		manager.createQuery(jpql,Gifts.class)
		.setParameter("nm",name)
		.setParameter("id", id)
		.executeUpdate();
	}

	@Override
	public void updateGiftPrice(Long id, double price) {
		String jpql="update Gifts g set g.giftPrice=:pr where g.id=:id";
		manager.createQuery(jpql,Gifts.class)
		.setParameter("pr",price)
		.setParameter("id", id)
		.executeUpdate();
		
	}

	@Override
	public void updateGiftDescription(Long id, String desc) {
		String jpql="update Gifts g set g.giftDescription=:gd where g.id=:id";
		manager.createQuery(jpql,Gifts.class)
		.setParameter("gd",desc)
		.setParameter("id", id)
		.executeUpdate();
	}
}
