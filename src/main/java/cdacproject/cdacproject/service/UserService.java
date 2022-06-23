package cdacproject.cdacproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cdacproject.cdacproject.controller.response.GlobalResponse;
import cdacproject.cdacproject.dao.UserDao;
import cdacproject.cdacproject.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public List<User> getUsers() {
		return userDao.findAll();
	}
	
	public User getUser(Long id) {
		return userDao.getById(id);
	}
	
	public GlobalResponse addUser(User user) {
		User entity = userDao.save(user);
		return new GlobalResponse(entity.getUserId(), "User Added Successful", true);
	}
	
	public GlobalResponse updateUser(User user) {
		User entity = userDao.save(user);
		return new GlobalResponse(entity.getUserId(),"User updated sucessfull",true);
	}
	
	public GlobalResponse deleteUser(Long id) {
		User entity = userDao.getById(id);
		userDao.delete(entity);
		return new GlobalResponse(id, "User Deleted Successful", true);
	}
	
	public User findByUsername(String username) {
//		User entity = userDao.findByUsername(username);
		return userDao.findByUsername(username);
	}
	
}
