package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.controller.dao.SupplierDAO;
import com.niit.controller.daoimpl.SupplierDAOImpl;
import com.niit.entitymodel.Supplier;




@Controller
public class SupplierController {
	
	//----------------------------add-------------------------------------//

	@RequestMapping(value = "/addsupplier", method = RequestMethod.GET)
	public ModelAndView addsupplier(Model m) {
		ModelAndView model = new ModelAndView("success");
		model.addObject("msg", "Supplier");
		return model;
	}

	@RequestMapping(value = "/addsupplier", method = RequestMethod.POST)
	public String addsupplier(Supplier supplier) {
		SupplierDAO supplierDAO = new SupplierDAOImpl();

		supplierDAO.addsupplier(supplier);
		return "success";

	}

	// ---------------------------------delete---------------------------------//

	@RequestMapping(value = "/deletesupplier", method = RequestMethod.GET)
	public ModelAndView deletesupplier(Model m) {
		ModelAndView model = new ModelAndView("success");
		model.addObject("msg", "supplier deleted ");
		return model;
	}

	@RequestMapping(value = "/deletesupplier", method = RequestMethod.POST)
	public String deletesupplier(@RequestParam("supplierId") String supplierId,
			@RequestParam("supplierName") String supplierName) {
		SupplierDAO supplierDAO = new SupplierDAOImpl();

		supplierDAO.deletesupplier(supplierId, supplierName);
		return "success";

	}

	@RequestMapping(value = "/supplier")
	public ModelAndView hello2() {
		ModelAndView model = new ModelAndView("supplier");
		return model;
	}

}



