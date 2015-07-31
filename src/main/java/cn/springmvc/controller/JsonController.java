package cn.springmvc.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.springmvc.model.User;

 
@Controller
@RequestMapping("/jsonView/")
public class JsonController {

	@RequestMapping(value = "redirect", method = { RequestMethod.GET })
	public String redirect() {
		return  "redirect:/jsonView/1/json";
		
//		return  "index";
	}	
	
	@RequestMapping(value = "{ehooProportion}/json", method = { RequestMethod.GET} ,produces="application/json" ,headers="Referer=http://www.ifeng.com/")
	@ResponseBody
	public Map doUpdateProportion(Model model, @PathVariable("ehooProportion")  Integer  ehooProportion){
		model.addAttribute("tollerMap","111");
		Map m  = new HashMap();
		m.put("dd", 111);
		return m;
	}
	
	@RequestMapping(value="/{day}", method = RequestMethod.GET)  
	  public Map getForDay(@PathVariable @DateTimeFormat(iso=ISO.DATE) Date day, Model model) {  
		     return new HashMap();  
	    }  

}
