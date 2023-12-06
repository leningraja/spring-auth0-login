package com.auth0.example.rest.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.auth0.example.model.UserDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserRESTController {

	@RequestMapping(value = "/user/create", method = RequestMethod.POST)
	public UserDTO addNewUsers(@RequestBody UserDTO user) {
		log.info("Saving user.");
		log.info("UserId: {} , Name: {}", user.getUser_id(), user.getEmail());
		return user;
	}
}
