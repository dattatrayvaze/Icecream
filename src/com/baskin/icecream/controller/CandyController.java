package com.baskin.icecream.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.baskin.icecream.service.IcecreamService;
import com.baskin.model.Candy;
import com.baskin.model.Icecream;

@Controller
public class CandyController {
	
	@Autowired
	IcecreamService candyService;
	
	@RequestMapping(value="candyList", method=RequestMethod.GET )
	public List<Icecream> getAllCandies (HttpRequest request) {
		return candyService.getIcecreams();
	}
	
	@RequestMapping(value = "candy", method = RequestMethod.POST)
	public void addSunday(HttpServletRequest request, @RequestBody Candy candy) {
		candyService.addIcecream(candy);
	}

}
