package com.hoangnh88.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("hoangnh88") && password.equals("123456");
	}

}