package com.niit.controller.dao;

import java.util.List;

import com.niit.entitymodel.Product;



public interface ProductDAO {

	public boolean addProduct(Product productModel);

	public boolean deleteProduct(String productId, String productName);

	public List<Product> getProductList();
}




