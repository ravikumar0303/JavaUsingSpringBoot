package com.iet.service;

import java.util.List;

import com.iet.bean.Product;



public interface ProductService {

	List<Product> getAllProduct();

	Product getById(int pid);


//

//	int addProduct(Product p);
//
//	int updateProduct(Product p);
//
//	int deleteById(int pid);

}
