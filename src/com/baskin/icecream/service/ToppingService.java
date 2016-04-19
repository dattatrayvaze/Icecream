package com.baskin.icecream.service;

import java.util.List;

import com.baskin.model.Topping;

public interface ToppingService {

	void addTopping(Topping topping);
	void deleteTopping(Topping topping);
	Topping getTopping(String type);
	List<Topping> getToppings();
	
}
