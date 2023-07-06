package com.iet.SpringBootProductCrud1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.iet.SpringBootProductCrud1.beans.Product;
import com.iet.SpringBootProductCrud1.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	

	@GetMapping("/viewProduct")
	public ModelAndView displayAllProducts() {
		List<Product> plist=productService.getAllProducts();
		return new ModelAndView("displayproduct","plist",plist);
		
	}
    @GetMapping("/addproduct")
	public String displayProduct(Model model) {
		Product p=new Product();
		model.addAttribute("product",p);
		return "addproduct";
	}
	
    @
    public ModelAndView insertProduct(@Valid @ModelAttribute("Product") Product p,BindResult result) {
    	
    	
    	if(result.()) {
			return new ModelAndView("addproduct","",null);
		}
		  productService.addProduct(p);
		  return new ModelAndView("redirect:/viewproducts");
	}
    }
}
