package com.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.entities.GiftCategory;
import com.app.service.CategoryService;

@Controller
public class AdminController {
	
	@Autowired
	CategoryService categoryService;

	@GetMapping("/admin")
	public String adminHome() {
		return "adminHome";
	}
	@GetMapping("/admin/categories")
	public String getCat(Model model) {
		model.addAttribute("categories",categoryService.getAllCategory());
		return "categories";
	}
	@GetMapping("/admin/categories/add")
	public String getCategoryAdd(Model model) {
		model.addAttribute("category",new GiftCategory());
		return "categoriesAdd";
	}
	@PostMapping("/admin/categories/add")
	public String postCategoryAdd(@ModelAttribute("category") GiftCategory category) {
		categoryService.addCategory(category);
		return "redirect:/admin/categories";
	}
	@GetMapping("/admin/categories/delete/{id}")
	//fetching the value of id with the help of @PathVariable annotation
	public String deleteCategory(@PathVariable Long id) {
		categoryService.deleteCategoryById(id);
		return "redirect/admin/categories";
	}
	@GetMapping("/admin/categories/update/{id}")
	public String updateCategory(@PathVariable Long id,Model model) {
		//first we have to fetch category
		Optional<GiftCategory> category=categoryService.getCategoryById(id);
		if(category.isPresent()) {
			model.addAttribute("category", category.get());
			return "categoriesAdd";
		}
		else
			return "404";
	}
}
