package com.app.service.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Gifts;
import com.app.repository.GiftsRepository;
import com.app.repository.ShopkeeperRepository;
import com.app.service.ShopkeeperService;

@Service
public class ShopkeeperServiceImplementation implements ShopkeeperService {

	@Autowired
	private GiftsRepository giftRepo;
	@Autowired
	private ShopkeeperRepository shopkeeperRepo;
	

	@Override
	public List<Gifts> getAllGifts() {
		return giftRepo.findAll();
	}

	@Override
	public void addGifts(Gifts gift) {
		giftRepo.save(gift);
	}

	@Override
	public void removeGiftById(Long id) {
		giftRepo.deleteById(id);
	}

	@Override
	public void updateGiftNameById(Long id, String name) {
		shopkeeperRepo.updateGiftName(id, name);		
	}

	@Override
	public void updateGiftPriceById(Long id, double price) {
		shopkeeperRepo.updateGiftPrice(id, price);		
	}

	@Override
	public void updateGiftDescriptionById(Long id, String desc) {
		shopkeeperRepo.updateGiftDescription(id, desc);
	}
}
