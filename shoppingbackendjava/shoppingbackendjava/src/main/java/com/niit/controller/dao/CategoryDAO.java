package com.niit.controller.dao;

import java.util.List;

import com.niit.entitymodel.Category;




public interface CategoryDAO
{
	public boolean addCategory(Category category);

	public boolean deleteCategory(String categoryId, String categoryName);

	public List<Category> getCategoryList();
}



