package com.baskin.icecream.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.baskin.icecream.service.IcecreamService;
import com.baskin.model.Icecream;

@Controller
public class SundayController {

	@Autowired
	IcecreamService icecreamService;
	
	@ResponseStatus(value = HttpStatus.OK)
	@RequestMapping(value = "/sunday", method = RequestMethod.POST)
	public void addSunday(HttpServletRequest request, @RequestBody Icecream sunday) {
		icecreamService.addIcecream(sunday);
	}
}
