package com.chatbox.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatbox.biding.DashBoardResponse;
import com.chatbox.biding.LoginForm;
import com.chatbox.biding.RegisterForm;
import com.chatbox.entity.User;
import com.chatbox.repo.UserRepo;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userrepo;
	@Override
	public String saveUser(RegisterForm register) {
	    User user=new User();
	    User findByUsername = userrepo.findByUsername(user.getUsername());
	    if(findByUsername!=null) {
	    	return "Already Register username";
	    }
	    BeanUtils.copyProperties(register, user);
	    userrepo.save(user);
		return "User Register Sucessfully";
	}

	@Override
	public User loginCheck(LoginForm loginform) {
		User findByUsernameAndPwd = userrepo.findByUsernameAndPwd(loginform.getUsername(), loginform.getPwd());
		return findByUsernameAndPwd;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> findAll = userrepo.findAll();
		return findAll;
	}

}
