package net.javaguide.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguide.springboot.model.User;
import net.javaguide.springboot.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class AdminController {
	@Autowired
	private UserRepository userRepository;

	@PostMapping("/add")
	public String addUserByAdmin(@RequestBody User user) {
		userRepository.save(user);
		return "Add user succesfully";
	}
}
