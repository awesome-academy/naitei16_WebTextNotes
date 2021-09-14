package app.service;
import app.dto.LoginDto;

public interface UserService {
	Boolean findByUsername(LoginDto user);
}
