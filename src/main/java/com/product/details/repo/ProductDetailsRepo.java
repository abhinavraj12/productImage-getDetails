package com.product.details.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.product.details.model.ProductDetails;


public interface ProductDetailsRepo extends JpaRepository<ProductDetails, Long> {
	//public ProductDetails getProductById(Long productId);
//	List<ProductDetails> findByProductId(Long productId);
}
