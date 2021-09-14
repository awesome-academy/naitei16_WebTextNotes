package app.service.impl;
import app.dao.UserDAO;
import app.dto.LoginDto;
import org.apache.log4j.Logger;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

	@Autowired
	private UserDAO userDAO;

	@Override
	public Boolean findByUsername (LoginDto user){
		try {
			return userDAO.findByUsername(user);
		} catch (Exception e) {
			logger.info(e);
			throw e;
		}
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
