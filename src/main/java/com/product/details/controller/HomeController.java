package com.product.details.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.product.details.model.ProductDetails;
import com.product.details.repo.ProductDetailsRepo;

@Controller
public class HomeController {
	
	@Autowired
	private ProductDetailsRepo productDetailsRepo;

	
	@GetMapping("/")
    public String index(Model model) {
        List<ProductDetails> products = productDetailsRepo.findAll();
        model.addAttribute("products", products);
        return "index";
    }
	
}
