package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.controller.dao.CategoryDAO;
import com.niit.controller.daoimpl.CategoryDAOImpl;
import com.niit.entitymodel.Category;




@Controller
public class CategoryController {
    
	//----------------------------add-----------------------------------//
	@RequestMapping(value = "/addcategory", method = RequestMethod.GET)
	public ModelAndView addcategory(Model m) {
		ModelAndView model = new ModelAndView("success");
		model.addObject("msg", "Category");
		return model;
	}

	@RequestMapping(value = "/addcategory", method = RequestMethod.POST)
	public String addcategory(Category category) {
		CategoryDAO categoryDAO = new CategoryDAOImpl();

		categoryDAO.addCategory(category);
		return "success";

	}

	// ---------------------------------delete---------------------------------//

	@RequestMapping(value = "/deletecategory", method = RequestMethod.GET)
	public ModelAndView deletecategory(Model m) {
		ModelAndView model = new ModelAndView("success");
		model.addObject("msg", "Category deleted ");
		return model;
	}

	@RequestMapping(value = "/deletecategory", method = RequestMethod.POST)
	public String deletecategory(@RequestParam("categoryId") String categoryId,
			@RequestParam("categoryName") String categoryName) {
		CategoryDAO categoryDAO = new CategoryDAOImpl();

		categoryDAO.deleteCategory(categoryId, categoryName);
		return "success";

	}

	@RequestMapping("/category")
	public String hellooo() {
		return "category";
	}

}



