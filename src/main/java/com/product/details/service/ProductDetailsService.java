package com.product.details.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.details.model.ProductDetails;
import com.product.details.repo.ProductDetailsRepo;

@Service
public class ProductDetailsService {
	@Autowired
	private ProductDetailsRepo productDetailsRepo;
	
	
}
