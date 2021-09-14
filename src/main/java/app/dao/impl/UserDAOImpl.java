package app.dao.impl;

import java.util.List;

import app.dto.LoginDto;
import app.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;

import app.dao.GenericDAO;
import app.dao.UserDAO;

public class UserDAOImpl extends GenericDAO<Integer, User> implements UserDAO {
	private static final Logger logger = Logger.getLogger(UserDAOImpl.class);

	public UserDAOImpl() {
		super(User.class);
	}

	public UserDAOImpl(SessionFactory sessionfactory) {
		setSessionFactory(sessionfactory);
	}

	@Override
	public Boolean findByUsername(LoginDto user){
//		List<User> abc = getSession().createQuery("select username, password from  User").list();
//		System.out.println("list user");
//		System.out.println(abc.size());
//		for(int i = 0 ; i < abc.size() ; i++) {
//			System.out.println(abc.get(i).toString());
//		}
//		if(abc.isEmpty()){
//			return false;
//		}
		return true;
	}
}
