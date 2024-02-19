package com.chatbox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chatbox.biding.DashBoardResponse;
import com.chatbox.biding.LoginForm;
import com.chatbox.biding.RegisterForm;
import com.chatbox.entity.User;
import com.chatbox.repo.UserRepo;
import com.chatbox.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepo userrepo;

	@GetMapping("/")
	public String index(Model model) {

		model.addAttribute("login", new LoginForm());
		return "home";
	}

	@GetMapping("/register")
	public String register(Model model) {

		model.addAttribute("register", new RegisterForm());
		return "register";
	}

	@PostMapping("/handleregister")
	public String handleRegister(@ModelAttribute("register") RegisterForm register, Model model) {

		User findByUsername = userrepo.findByUsername(register.getUsername());
		if (findByUsername != null) {
			model.addAttribute("error", "Already Register Username");
			return "register";
		}
		String saveUser = userService.saveUser(register);
		model.addAttribute("sucess", saveUser);

		return "register";
	}

	@PostMapping("/loginform")
	public String handleLogin(LoginForm login, Model model) {

		User loginCheck = userService.loginCheck(login);
		if (loginCheck == null) {

			model.addAttribute("errormsg", "Username and password not found");
			return "redirect:/";
		}
		List<User> allUsers = userService.getAllUsers();
		model.addAttribute("list", allUsers);
		return "dashboard";
	}

	@GetMapping("/loaddashborad")
	public String dashBoard(Model model) {

		model.addAttribute("dash", new DashBoardResponse());
		return "dashboard";
	}

	@GetMapping("/chatbox")
	public String chatBox(Model model) {
		model.addAttribute("obj", model);
		return "chatbox";
	}

}
