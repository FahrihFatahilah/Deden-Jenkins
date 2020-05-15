package com.nostratech.test.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nostratech.test.demo.services.UsersService;
import com.nostratech.test.demo.services.dto.UserDTO;



@RestController
@RequestMapping("/api/v1")
public class UsersResources {
	
	@Autowired
	private UsersService userService;
	
	@GetMapping("/users")
	public ResponseEntity<List<UserDTO>> getUsers() {
		List<UserDTO> result = userService.getAllUser();
		return ResponseEntity.accepted().body(result);
	}
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}


}
