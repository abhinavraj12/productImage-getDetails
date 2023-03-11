package com.product.details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.product.details.model.ProductDetails;
import com.product.details.repo.ProductDetailsRepo;

@Controller
@RequestMapping("/products")
public class ProductDetailsController {
	@Autowired
	private ProductDetailsRepo productDetailsRepo;
	
	@GetMapping("/{productId}")
    public String showProductDetail(@PathVariable("productId") Long productId, Model model) {
        ProductDetails product = productDetailsRepo.findById(productId)
        		.orElseThrow(() -> new IllegalArgumentException("Invalid product id: " + productId));
        model.addAttribute("product", product);
        return "productss";
    }
	
}
