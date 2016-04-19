package com.baskin.icecream.dao;

import java.util.List;

import com.baskin.model.Icecream;

public interface IcecreamDAO  {
	
	void addIcecream(Icecream icecream);
	void deleteIcecream(Icecream icecream);
	List<Icecream> getAllIcecreams();
	List<Icecream>getAllIcecreams(String type);
	List<Icecream>getIcecreams(String name);
	void updateIcecream(Icecream icecream);
	

}
