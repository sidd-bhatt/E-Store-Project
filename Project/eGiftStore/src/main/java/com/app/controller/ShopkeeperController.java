package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.ShopkeeperService;

@RestController
@RequestMapping("shopkeeper")
public class ShopkeeperController {
	
	@Autowired
	private ShopkeeperService shopkeeperService;
	
	@PutMapping("/updateGiftName{id}{name}")
	public void updateGiftName(Long id,String name) {
		shopkeeperService.updateGiftNameById(id, name);
	}
	@PutMapping("/updateGiftPrice{id}{price}")
	public void updateGiftPrice(Long id,double price) {
		shopkeeperService.updateGiftPriceById(id, price);
	}
	@PutMapping("/updateGiftDescription{id}{description}")
	public void updateGiftDescription(Long id,String desc) {
		shopkeeperService.updateGiftNameById(id, desc);
	}
	@DeleteMapping("/deleteGift{id}")
	public void removeGiftById(Long id) {
		shopkeeperService.removeGiftById(id);
	}
	
}
