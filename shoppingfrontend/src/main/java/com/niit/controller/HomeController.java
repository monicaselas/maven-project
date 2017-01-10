package com.niit.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
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
	@RequestMapping ("/sample")
	public String ShowSample()
	{
		return "sample";
	}
	@RequestMapping("/login")
	public String Showlogin()
	{
		return "login";
	}
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public ModelAndView hello4(@RequestParam("username") String username, @RequestParam("password") String password) {
		UserDAO obj = new UserDAOImpl();
		
		  if (obj.isValidCredentials(username, password)) {
		  ModelAndView model = new ModelAndView("success");
			model.addObject("username", username);
			return model;
		}
		/*
		 * ModelAndView model1 = new ModelAndView("login");
		 * model1.addObject("result",
		 * "Check your username or password, Try again buddy"); return model1; }
		 */
		ModelAndView model = new ModelAndView("login");
		model.addObject("username", username);
		return model;

	}
	@RequestMapping("/register")
	public String ShowRegister()
	{
		return "register";
	
	}
	
	@RequestMapping("/validate")
	public ModelAndView validate(@RequestParam("username") String username,@RequestParam("password") String password){
			System.out.println("In validate method");
			
			
			System.out.println(username+":username");
			System.out.println(password+":password");
			UserDAO userdao=new UserDAOImpl();
			
			
if(userdao.isValidCredentials(username,password))
{
	ModelAndView model=new ModelAndView("success");
return model;
}
else
{
	ModelAndView model=new ModelAndView("invalid");
	return model;
	}
			}


	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public ModelAndView hello(@Valid @ModelAttribute("obj") UserModel userModel, BindingResult resultobj) {

		// for just practicing errorResult
		UserRegisterDAO userDao = new UserRegisterDAOImpl();
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

	
	
	
	

}




