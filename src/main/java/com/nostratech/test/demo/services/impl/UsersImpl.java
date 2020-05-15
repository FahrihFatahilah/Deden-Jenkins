package com.nostratech.test.demo.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nostratech.test.demo.domain.Users;
import com.nostratech.test.demo.repository.UsersRepository;
import com.nostratech.test.demo.services.UsersService;
import com.nostratech.test.demo.services.dto.UserDTO;

@Service
public class UsersImpl implements UsersService {
	@Autowired
	private UsersRepository userRepository;

	@Override
	public List<UserDTO> getAllUser() {
		List<Users> users = userRepository.findAll();
		List<UserDTO> userDTOs = users.stream().map(u->{
			UserDTO uDTO = new UserDTO();
			uDTO.setUsername(u.getUsername());
			return uDTO;
		}).collect(Collectors.toList());
		return userDTOs;
	}

}
