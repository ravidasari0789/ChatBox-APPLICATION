package com.chatbox.service;

import java.util.List;

import com.chatbox.biding.LoginForm;
import com.chatbox.biding.RegisterForm;
import com.chatbox.entity.User;

public interface UserService {

	   public String saveUser(RegisterForm user);
	   public User loginCheck(LoginForm loginform);
	   public List<User> getAllUsers();
}
