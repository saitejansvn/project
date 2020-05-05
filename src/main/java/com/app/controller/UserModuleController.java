package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.User;
import com.app.service.IUserModuleService;

@Controller
@RequestMapping("/user")
public class UserModuleController {

	@Autowired
	private IUserModuleService ser;

	@RequestMapping(value = "/reg",method = RequestMethod.GET)
	public String showregpage(Model model)
	{
		model.addAttribute("user",new User());
		return "userregisterpage";
	}
	
@RequestMapping(value = "/save",method =RequestMethod.POST )	
public String saveuser(@ModelAttribute User user,ModelMap map)
{
Integer id=	ser.saveuser(user);
map.addAttribute("data","the id is saved sucessfuuly"+id);
return "userregisterpage";
}
}
