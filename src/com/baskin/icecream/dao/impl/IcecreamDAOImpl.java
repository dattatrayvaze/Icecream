package com.baskin.icecream.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.baskin.icecream.dao.AbstractHibernateDAO;
import com.baskin.icecream.dao.IcecreamDAO;
import com.baskin.model.Icecream;

@Component(value = "icecreamDAO")
public class IcecreamDAOImpl extends AbstractHibernateDAO implements
		IcecreamDAO {

	@Override
	public void addIcecream(Icecream icecream) {
		getHibernateTemplate().save(icecream);

	}

	@Override
	public void deleteIcecream(Icecream icecream) {
		getHibernateTemplate().save(icecream);

	}

	@Override
	public List<Icecream> getAllIcecreams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Icecream> getAllIcecreams(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Icecream> getIcecreams(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateIcecream(Icecream icecream) {
		// TODO Auto-generated method stub

	}

}
