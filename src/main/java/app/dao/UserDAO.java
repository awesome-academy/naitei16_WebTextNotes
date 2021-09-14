package app.dao;

import app.dto.LoginDto;
import app.entity.User;

public interface UserDAO extends BaseDAO<Integer, User> {
	Boolean findByUsername(LoginDto user);
}
