package com.iet.SpringBootProductCrud1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iet.SpringBootProductCrud1.beans.Product;
import com.iet.SpringBootProductCrud1.dao.ProductDao;

@Service
public class ProductServiceImpl  implements ProductService{
	
	@Autowired
	ProductDao pdao;

	@Override
	public List<Product> getAllProducts() {
		
		List<Product> plist=pdao.findAll();
	     
		return plist;
	}
	
	

}
