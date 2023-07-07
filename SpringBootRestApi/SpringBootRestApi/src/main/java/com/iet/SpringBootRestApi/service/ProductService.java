package com.iet.SpringBootRestApi.service;

import java.util.List;

import com.iet.SpringBootRestApi.model.Product;

public interface ProductService {

	List<Product> getAllProduct();

	Product getById(int pid);

	void addProduct(Product p);

	void updateProduct(Product p);

}
