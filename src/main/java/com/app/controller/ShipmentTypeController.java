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

import com.app.model.ShipmentType;
import com.app.service.IshipmentService;

@Controller
@RequestMapping("/shipmenttype")
public class ShipmentTypeController {

	//Link with Service Layer
	@Autowired
	private IshipmentService service;
//1.to show register page
	@RequestMapping("/reg")
	public String Getregistetpage(Model map)
	{ 
		map.addAttribute("shipmentType", new ShipmentType());
		return	"ShipmentTypeRegister";
	}
	
	//2.TO SAVE THE DATA
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String Saveshipment(@ModelAttribute ShipmentType  shipmentType,ModelMap map)
	{
Integer id=	service.saveShipmentType(shipmentType);
map.addAttribute("id","id saved successfully "+id);		
return "ShipmentTypeRegister";
	}
	//3.to show the data 
	@RequestMapping("/viewall")
	public String ViewAllData(ModelMap map)
	{
List<ShipmentType> st=service.getAllShipmentTypes();
if(!st.isEmpty())
{
map.addAttribute("data",st);
}else
{
	map.addAttribute("nodata",st);
}
return "ShipmentDataPage";
	}
//4.deleting the record 
	@RequestMapping("/delete")
	public String deleteById(@RequestParam("id") int sid,ModelMap map)
	{
		service.deleteShipmentType(sid);	
        List<ShipmentType> list=service.getAllShipmentTypes();
		map.addAttribute("list",list);
		map.addAttribute("delete","the id is delted Succesfully"+sid);
		map.addAttribute("data",list);
		return "ShipmentDataPage";
		
	}
	
	
	
	
	
	
}
