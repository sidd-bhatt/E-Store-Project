package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.dto.GiftCategoryAdd;
import com.app.entities.GiftCategory;
import com.app.service.CategoryService;

@RestController
@RequestMapping("admin")
public class AdminController {
	
	@Autowired
	private ModelMapper mapper;
	@Autowired
	CategoryService categoryService;

	@GetMapping("/getAllCategories")
	public List<GiftCategory> getCategory() {
		return categoryService.getAllCategory();
	}
	
	@PostMapping("/addCategory")
	public GiftCategory getCategoryAdd(@RequestBody GiftCategoryAdd newCategory) {
		GiftCategory category=mapper.map(newCategory,GiftCategory.class);
		return categoryService.addCategory(category);
	}
	
	@GetMapping("/{id}")
	public Optional<GiftCategory> getStudentById(Long id) {
		return categoryService.getCategoryById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(Long id) {
		categoryService.deleteCategoryById(id);
	}
}
