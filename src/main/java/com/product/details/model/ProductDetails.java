package com.product.details.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productDetails")
public class ProductDetails {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	
	@Column(name = "productName", nullable = false)
	private String productName;
	
	@Column(name = "price", nullable = false)
	private String price;
	
	@Column(name = "imgProduct", nullable = false)
	private String image;
	
	@Column(name = "description",nullable = false, length = 500)
	private String desc;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public ProductDetails(Long productId, String productName, String price, String image, String desc) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.image = image;
		this.desc = desc;
	}

	public ProductDetails() {
		super();
		
	}

	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", image=" + image + ", desc=" + desc + "]";
	}
	
	

}
