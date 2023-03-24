package in.codingcomets.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codingcomets.user.VO.ResponseTemplateVO;
import in.codingcomets.user.entity.UserInfo;
import in.codingcomets.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/create")
	public UserInfo saveUser(@RequestBody UserInfo user) {
		
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public UserInfo fetchUserById(@PathVariable("id") Long id) {
		return userService.fetchUserById(id);
	}
	
	@GetMapping("/full/{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		return userService.getUserWithDepartment(userId);
	}

}
