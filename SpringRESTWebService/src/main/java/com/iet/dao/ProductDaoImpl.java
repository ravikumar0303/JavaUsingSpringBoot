package com.iet.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.iet.bean.Product;



@Repository
public class ProductDaoImpl implements ProductDao{
	@Autowired
   JdbcTemplate jdbcTemplate;

	public List<Product> findAll() {
		RowMapperImpl rsi = new RowMapperImpl();
//		return jdbcTemplate.query("select * from product",(rs,num)->{
//			Product p=new Product();
//			p.setPid(rs.getInt(1));
//			p.setPname(rs.getString(2));
//			p.setQty(rs.getInt(3));
//			p.setPrice(rs.getFloat(4));
//			return p;
//		});
		
		RowMapper<Product> rs = new RowMapper<Product>() {

			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p=new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setQty(rs.getInt(3));
				p.setPrice(rs.getFloat(4));
				return p;
			}
			
		};
		
		return jdbcTemplate.query("select * from product", rs);
	}

	@Override
	public Product findById(int pid) {
		try {
		 return jdbcTemplate.queryForObject("select * from product where pid=?",new Object[] {pid},
				BeanPropertyRowMapper.newInstance(Product.class));
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}
//
//	@Override
//	public int save(Product p) {
//		try {
//		return jdbcTemplate.update("insert into product values(?,?,?,?)",new Object[] {
//				p.getPid(),p.getPname(),p.getQty(),p.getPrice()});
//		}catch(DataAccessException e) {
//			return 0;
//		}
//	}

//	@Override
//	public int modifyProduct(Product p) {
//		try {
//			return jdbcTemplate.update("update product set pname=?,qty=?,price=? where pid=?" ,new Object[] {
//					p.getPname(),p.getQty(),p.getPrice(),p.getPid()});
//			}catch(DataAccessException e) {
//				return 0;
//			}
//	}

//	@Override
//	public int removeById(int pid) {
//		try {
//			  return jdbcTemplate.update("delete from product where pid=?" ,new Object[] {pid});
//			}catch(DataAccessException e) {
//				return 0;
//			}
//	}
}
