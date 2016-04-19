package com.baskin.icecream.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Component;

import com.baskin.icecream.dao.AbstractHibernateDAO;
import com.baskin.icecream.dao.ToppingDAO;
import com.baskin.model.Topping;

@Component(value = "toppingDAO")
public class ToppingDAOImpl extends AbstractHibernateDAO implements ToppingDAO {

	@Override
	public void addTopping(Topping topping) {
		getHibernateTemplate().save(topping);

	}

	@Override
	public void deleteTopping(Topping topping) {
		getHibernateTemplate().delete(topping);

	}

	@Override
	public Topping getTopping(final String type) {
		return getHibernateTemplate().execute(new HibernateCallback<Topping>() {
			public Topping doInHibernate(Session session) throws HibernateException, SQLException{
				//SQLQuery query =  session.createSQLQuery("select * from User u where u.username=:username");
				Query query = session.createQuery("from Topping t where t.type=:type");
				query.setParameter("type", type);
				List<Topping> list = query.list();
				if(list != null && list.size() > 0)
				return (Topping)list.get(0);
				else return null;
			}
		});
	}

	@Override
	public List<Topping> getToppings() {
		return getHibernateTemplate().execute(new HibernateCallback<List<Topping>>() {
			public List<Topping> doInHibernate(Session session) throws HibernateException, SQLException{
				//SQLQuery query =  session.createSQLQuery("select * from User u where u.username=:username");
				Query query = session.createQuery("from Topping");
				List<Topping> list = query.list();
				return list;
			}
		});
	}

}
