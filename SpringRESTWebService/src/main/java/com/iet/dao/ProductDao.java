package com.iet.dao;

import java.util.List;

import com.iet.bean.Product;



public interface ProductDao {

	List<Product> findAll();

	Product findById(int pid);


//
//
//	int save(Product p);
//
//	int modifyProduct(Product p);
//
//	int removeById(int pid);

}
