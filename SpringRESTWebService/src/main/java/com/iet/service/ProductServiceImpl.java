package com.iet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iet.bean.Product;
import com.iet.dao.ProductDao;


@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
     private ProductDao productDao;

	public List<Product> getAllProduct() {
		return productDao.findAll();
	}

	@Override
	public Product getById(int pid) {
		return productDao.findById(pid);
	}
//
//	@Override
//	public int addProduct(Product p) {
//		return productDao.save(p);
//	}
//
//	@Override
//	public int updateProduct(Product p) {
//		return productDao.modifyProduct(p);
//	}
//
//	@Override
//	public int deleteById(int pid) {
//		return productDao.removeById(pid);
//	}
}
