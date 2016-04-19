package com.baskin.icecream.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baskin.icecream.dao.IcecreamDAO;
import com.baskin.icecream.service.IcecreamService;
import com.baskin.model.Icecream;
import com.baskin.model.Scoop;

@Service("icecreamService")
public class IcecreamServiceImpl implements IcecreamService {

	@Autowired
	IcecreamDAO icecreamDAO;
	public static List<Icecream> icecreams = new ArrayList<Icecream>();
	@Override
	public List<Icecream> getIcecreams() {
		return icecreams;
	}
	
	static {
		
		for(int i=0;i<=20;i++) {
			Icecream icecream = new Scoop("ButterScotch"+i, 40+i, "chocolate.jpg","chocolate single scoop");
			icecreams.add(icecream);
		}
	}

	@Override
	public void addIcecream(Icecream icecream) {
		icecreamDAO.addIcecream(icecream);
		
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
