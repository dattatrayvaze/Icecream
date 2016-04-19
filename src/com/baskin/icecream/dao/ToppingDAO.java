package com.baskin.icecream.dao;

import java.util.List;

import com.baskin.model.Topping;

public interface ToppingDAO {

	void addTopping(Topping topping);
	void deleteTopping(Topping topping);
	Topping getTopping(String type);
	List<Topping> getToppings();
}
