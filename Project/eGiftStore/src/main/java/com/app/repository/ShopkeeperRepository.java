package com.app.repository;

public interface ShopkeeperRepository{
	
	public void updateGiftName(Long id, String name);
	public void updateGiftPrice(Long id, double price);
	public void updateGiftDescription(Long id, String disc);
}
