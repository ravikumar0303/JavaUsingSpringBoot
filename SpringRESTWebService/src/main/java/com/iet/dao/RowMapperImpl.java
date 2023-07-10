package com.iet.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.iet.bean.Product;

public class RowMapperImpl implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product p=new Product();
		p.setPid(rs.getInt(1));
		p.setPname(rs.getString(2));
		p.setQty(rs.getInt(3));
		p.setPrice(rs.getFloat(4));
		return p;
	}

}
