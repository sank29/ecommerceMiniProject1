package com.ecommerce.service;

import java.util.List;

import com.ecommerce.exception.ProductException;
import com.ecommerce.model.Customer;
import com.ecommerce.model.Product;

public interface CustomerProductService {
	
	public List<Product> findAllProductInDataBase() throws ProductException;
	
	public Product getProductByProductName(String productName) throws ProductException;
	
	public Product buyProductAndAddToCart(Product product, Customer customer) throws ProductException;
	

}
