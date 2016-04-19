package com.baskin.icecream.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baskin.exception.BaskinException;
import com.baskin.icecream.service.IcecreamService;
import com.baskin.model.Icecream;

@Controller
public class HomeController {

	public static Logger log = Logger.getLogger(HomeController.class);
	@Autowired
	IcecreamService icecreamService;
	
	@RequestMapping(value="/icecreamList",method=RequestMethod.GET )
	public @ResponseBody List<Icecream> getIcecreams(HttpServletRequest request) {
		
		return icecreamService.getIcecreams();
	}
	
	@RequestMapping(value="/icecreamList/success",method=RequestMethod.GET )
	public @ResponseBody List<Icecream> getIcecreamsSuccess(HttpServletRequest request) {
		
		return icecreamService.getIcecreams();
	}
	
	@RequestMapping(value="/icecreamList/error",method=RequestMethod.GET )
	public @ResponseBody List<Icecream> getIcecreamsError(HttpServletRequest request) {
		
		throw new BaskinException("Baskin eror");
	}
}
