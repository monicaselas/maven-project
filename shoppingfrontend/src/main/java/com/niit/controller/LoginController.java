package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping.dao.UserLoginDao;
import com.niit.shopping.dao.UserLoginDaoImpl;

@Controller
public class LoginController {
	@RequestMapping(value = "/about", method = RequestMethod.POST)
	public ModelAndView hello4(@RequestParam("usr") String usr, @RequestParam("pwd") String pwd) {
		UserLoginDao obj = new UserLoginDaoImpl();
		
		  if (obj.validationLogin(usr, pwd)) {
		  ModelAndView model = new ModelAndView("about");
			model.addObject("usr", usr);
			return model;
		}
		/*
		 * ModelAndView model1 = new ModelAndView("login");
		 * model1.addObject("result",
		 * "Check your username or password, Try again buddy"); return model1; }
		 */
		ModelAndView model = new ModelAndView("login");
		model.addObject("usr", usr);
		return model;

	}
}