package com.baskin.icecream.dao.impl;

import java.sql.SQLException;
import java.util.List;






import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Component;

import com.baskin.exception.BaskinException;
import com.baskin.icecream.dao.AbstractHibernateDAO;
import com.baskin.icecream.dao.UserDAO;
import com.baskin.model.User;

@Component(value = "userDAO")
public class UserDAOImpl extends AbstractHibernateDAO implements UserDAO {

	@Override
	public void createUser(User user) {
		try {
			getHibernateTemplate().save(user);
		} catch(HibernateException he) {
			throw new BaskinException("User Already exist.");
		}

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUser(final String username) {
		return getHibernateTemplate().execute(new HibernateCallback<User>() {
			public User doInHibernate(Session session) throws HibernateException, SQLException{
				//SQLQuery query =  session.createSQLQuery("select * from User u where u.username=:username");
				Query query = session.createQuery("from User u where u.username=:username");
				query.setParameter("username", username);
				List<User> userList = query.list();
				if(userList != null && userList.size() > 0)
				return (User)userList.get(0);
				else return null;
			}
		});

	}

	@Override
	public List<User> getUsers(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
