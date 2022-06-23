package cdacproject.cdacproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import cdacproject.cdacproject.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import cdacproject.cdacproject.service.UserService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cdacproject.cdacproject.controller.response.GlobalResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
@RestController
@CrossOrigin(origins = "*")

public class UserController {
	
	
	@Autowired
	
	private UserService userService;
	
	@GetMapping("/users")
	public  List<User> getUsers() {
		return userService.getUsers();
	}
	
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable String userId) {
		return userService.getUser(Long.parseLong(userId));
	}
	
	@PostMapping("/users")
	public GlobalResponse addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PutMapping("/users")
	public GlobalResponse updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/users/{userId}")
	public GlobalResponse deleteUser(@PathVariable String userId) {
		return userService.deleteUser(Long.parseLong(userId));
	}
	
	@GetMapping("/users/username/{username}")
	public User findByUsername(@PathVariable String username) {
		return userService.findByUsername(username);
	}

	

}
