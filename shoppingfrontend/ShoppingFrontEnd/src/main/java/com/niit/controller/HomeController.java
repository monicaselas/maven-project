package com.niit.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.entityModel.UserModel;
import com.niit.shopping.dao.UserDao;
import com.niit.shopping.dao.UserDaoImpl;

@Controller
public class HomeController {



	@RequestMapping(value = "/register")
	public ModelAndView hello2() {
		ModelAndView model = new ModelAndView("register");
		return model;
	}

	@RequestMapping(value = "/delete")
	public ModelAndView hello5() {
		ModelAndView model = new ModelAndView("delete");
		return model;

	}


	@RequestMapping(value = "/login")
	public ModelAndView hello3() {
		ModelAndView model = new ModelAndView("login");
		return model;

	}

	@RequestMapping(value = "/index")
	public ModelAndView hello4() {
		ModelAndView model = new ModelAndView("index");
		return model;

	}





	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public ModelAndView hello(@Valid @ModelAttribute("obj") UserModel userModel, BindingResult resultobj) {

		// for just practicing errorResult
		UserDao userDao = new UserDaoImpl();
		if (resultobj.hasErrors()) {
			ModelAndView model1 = new ModelAndView("register");
			return model1;
		}
	

		if (userDao.validation(userModel)) {
		ModelAndView model = new ModelAndView("success");

			return model;
		} else {
			ModelAndView model = new ModelAndView("login");
			return model;

		}
	}

	// for just practicing addAttribute reusability of code
	public void hello1(Model obj2) {
		obj2.addAttribute("msg", "Your are successfully registered,   Rock on ");
	}


	}


