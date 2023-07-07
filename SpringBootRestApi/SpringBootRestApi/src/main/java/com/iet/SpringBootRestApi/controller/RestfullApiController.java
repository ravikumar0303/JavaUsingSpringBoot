package com.iet.SpringBootRestApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.iet.SpringBootRestApi.model.Product;
import com.iet.SpringBootRestApi.service.ProductService;

@RestController
public class RestfullApiController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public List<Product> DisplayProduct(){
		
		List<Product> plist=productService.getAllProduct();
		return plist;
	}
	
	@GetMapping("/products/{pid}")
	public ResponseEntity<Product> getById(@PathVariable int pid) {
		
		Product p=productService.getById(pid);
		if(p!=null) {
			return ResponseEntity.ok(p);
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	
	 @PostMapping("/products/{pid}")
	 public ResponseEntity <String> insertProduct(@RequestBody Product p){
		 
		 productService.addProduct(p);
		 return ResponseEntity.ok("Product is Added  !!");
	 }
	 
	 @DeleteMapping("/products/{pid}")
	 public ResponseEntity <String> deleteProduct(@RequestBody Product p){
		 
		 productService.updateProduct(p);
		 return ResponseEntity.ok("Product is Deleted.....");
	 }
}

