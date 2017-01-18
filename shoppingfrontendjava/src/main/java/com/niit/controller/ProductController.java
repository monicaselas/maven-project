package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.controller.dao.ProductDAO;
import com.niit.controller.daoimpl.ProductDAOImpl;
import com.niit.entitymodel.Product;




@Controller
public class ProductController {
	
	//---------------------------------add--------------------------------//
	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public ModelAndView addProduct(Model m) {
		ModelAndView model = new ModelAndView("success");
		model.addObject("msg", "Product");
		return model;
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String addProduct(Product product) {
		ProductDAO productDAO = new ProductDAOImpl();

		productDAO.addProduct(product);
		return "success";

	}

	// ---------------------------------delete---------------------------------//

	@RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
	public ModelAndView deleteProduct(Model m) {
		ModelAndView model = new ModelAndView("success");
		model.addObject("msg", "Product deleted ");
		return model;
	}

	@RequestMapping(value = "/deleteProduct", method = RequestMethod.POST)
	public String deleteProduct(@RequestParam("productId") String productId,
			@RequestParam("productName") String productName) {
		ProductDAO productDAO = new ProductDAOImpl();

		productDAO.deleteProduct(productId, productName);
		return "success";

	}

	@RequestMapping(value = "/product")
	public ModelAndView hello2() {
		ModelAndView model = new ModelAndView("product");
		return model;
	}

}



