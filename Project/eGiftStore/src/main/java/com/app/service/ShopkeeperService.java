package com.app.service;

import java.util.List;

import com.app.entities.Gifts;

public interface ShopkeeperService {
	
	public List<Gifts> getAllGifts();
	public void addGifts(Gifts gift);
	public void removeGiftById(Long id);
	public void updateGiftNameById(Long id,String name);
	public void updateGiftPriceById(Long id,double price);
	public void updateGiftDescriptionById(Long id,String desc);
}
