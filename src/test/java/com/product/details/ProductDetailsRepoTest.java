package com.product.details;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.product.details.model.ProductDetails;
import com.product.details.repo.ProductDetailsRepo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class ProductDetailsRepoTest {
	
	@Autowired
	private ProductDetailsRepo productDetailsRepo;
	
	@Test
	public void testAddValue() {
		ProductDetails productDetails = new ProductDetails(3L,"Watch", "$528", 
				"https://e7.pngegg.com/pngimages/758/778/png-clipart-pocket-watch-chronograph-watch-watch-accessory-accessories-thumbnail.png", 
				"This is the Watch");
		ProductDetails saveProduct = productDetailsRepo.save(productDetails);
		assertThat(saveProduct).isNotNull();
	}

}
