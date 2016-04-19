package com.baskin.icecream.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.baskin.icecream.service.IcecreamService;
import com.baskin.model.Candy;
import com.baskin.model.Icecream;

@Service("candyService")
class CandyServiceImpl implements IcecreamService {

	@Override
	public List<Icecream> getIcecreams() {
		return new ArrayList<Icecream>();
	}

	@Override
	public void addIcecream(Icecream icecream) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteIcecream(Icecream icecream) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Icecream> getIcecreams(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
