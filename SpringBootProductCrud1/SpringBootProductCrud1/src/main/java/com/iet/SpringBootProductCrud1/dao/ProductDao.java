package com.iet.SpringBootProductCrud1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iet.SpringBootProductCrud1.beans.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

}
