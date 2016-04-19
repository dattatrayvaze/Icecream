package com.baskin.icecream.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baskin.icecream.dao.ToppingDAO;
import com.baskin.icecream.service.ToppingService;
import com.baskin.model.Topping;

@Service( value = "toppingService")
public class ToppingServiceImpl implements ToppingService {

	@Autowired
	private ToppingDAO toppingDAO;
	
	@Override
	public void addTopping(Topping topping) {
		toppingDAO.addTopping(topping);

	}

	@Override
	public void deleteTopping(Topping topping) {
		toppingDAO.deleteTopping(topping);

	}

	@Override
	public Topping getTopping(String type) {
		return toppingDAO.getTopping(type);
	}

	@Override
	public List<Topping> getToppings() {
		return toppingDAO.getToppings();
	}

}
