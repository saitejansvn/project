package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Uom;
import com.app.service.IUomTypeService;

@Controller
@RequestMapping("/uom")
public class UomTypeController
{
	@Autowired
private IUomTypeService service;
	@RequestMapping(value = "/reg",method = RequestMethod.GET)
	public String UomRegisterPage(Model model)
	{
		model.addAttribute("uom",new Uom());
		return "uomreg";
	}
	
	//2.for saving uom data
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public String saveuomdata(@ModelAttribute Uom uom,ModelMap map)
	{
Integer id=	service.saveUomType(uom);
map.addAttribute("data","the id is saved successfully"+id);		
return "uomreg";
	}	
	//3.To display the All UomData
	@RequestMapping("/viewdata")
	public String ShowData(ModelMap map)
	{
List<Uom> uomdata=service.getAllUomTypes();
if(!uomdata.isEmpty())
{
	map.addAttribute("data",uomdata);
}
else
{
	map.addAttribute("data","no records are avaaible");
}
		return "UomData";
	}
	//4.Delete by id 
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int sid,ModelMap map)
	{
		
		service.deleteUom(sid);
        List<Uom> uomdata=service.getAllUomTypes();
        map.addAttribute("data",uomdata);
		return "UomData";
	}

}