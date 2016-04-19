package com.baskin.icecream.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.baskin.icecream.service.ToppingService;
import com.baskin.model.Topping;

@Controller
public class ToppingController {

	@Autowired
	private ToppingService toppingService;
	
	
	@RequestMapping(value="topping", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	public void addTopping(HttpServletRequest request, @RequestBody Topping topping) {
		toppingService.addTopping(topping);
	}
	
	@RequestMapping(value="topping", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody Topping getTopping(HttpServletRequest request) {
		return toppingService.getTopping(request.getParameter("topping"));
	}
	
	@RequestMapping(value="toppings", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public @ResponseBody List<Topping> getAllTopping(HttpServletRequest request) {
		return toppingService.getToppings();
	}
}
