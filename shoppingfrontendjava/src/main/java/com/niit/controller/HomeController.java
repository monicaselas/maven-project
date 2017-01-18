package com.niit.controller;

import javax.validation.Valid;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.controller.dao.UserDAO;
import com.niit.controller.dao.UserRegisterDAO;
import com.niit.controller.daoimpl.UserDAOImpl;
import com.niit.controller.daoimpl.UserRegisterDAOImpl;
import com.niit.entitymodel.UserModel;


@Controller
public class HomeController 
{
	 //@Autowired
		//private UserDAO userDao;
		 
		 
		 //@Autowired
		 //private User user;
		
		@RequestMapping(value = "/admin")
		public ModelAndView hello6() {
			ModelAndView model = new ModelAndView("admin");
			return model;
		}


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
		public ModelAndView hello(@ModelAttribute("user") User user, UserModel UserModel) {

			UserRegisterDAO userregisterDao = new UserRegisterDAOImpl();

			
			if (userregisterDao.validation(UserModel) ) {
				System.out.println("hi iam inside controller");
				ModelAndView model = new ModelAndView("success");
				return model;
			} 
			else {
				ModelAndView model = new ModelAndView("login");
				return model;

			}
		}

		@RequestMapping(value = "/success", method = RequestMethod.POST)
		public ModelAndView hello4(@RequestParam("userName") String userName, @RequestParam("password") String password) {
			UserDAO obj = new UserDAOImpl();

			if (obj.isValidCredentials(userName, password)) {

				ModelAndView model = new ModelAndView("loginsuccess");
				System.out.println("hiii login");
				model.addObject("userName", userName);
				return model;
			}else{
			
			  ModelAndView model1 = new ModelAndView("login");
			  model1.addObject("result","Check your username or password, Try again ");
			  return model1; 
			  }

		}
		public void hello1(Model obj2) {
			obj2.addAttribute("msg", "Your are successfully registered,   Begin Here ");
		}


		}


