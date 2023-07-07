package com.iet.SpringBootRestApi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.iet.SpringBootRestApi.dao.ProductDao;
import com.iet.SpringBootRestApi.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
 	
	@Autowired
	ProductDao pdao;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		List<Product> plist=pdao.findAll();
		return plist;
	}

	@Override
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		Optional<Product> p=pdao.findById(pid);
		if(p.isPresent()) {
			return p.get();
		}else {
			return null;
		}
	}

	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		  pdao.save(p);
		
	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		Optional<Product> op=pdao.findById(p.getPid());
		if(op.isPresent()) {
			Product pp=op.get();
			pp.setPname(pp.getPname());
			pp.setQty(pp.getQty());
			pp.setPrice(pp.getPrice());
			pdao.save(p);
		}
	}
	


}
