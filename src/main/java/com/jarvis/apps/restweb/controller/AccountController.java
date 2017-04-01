package com.jarvis.apps.restweb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = AccountController.BASE_PATH)
@Api
public class AccountController {

	private static final Logger LOG = LoggerFactory.getLogger(AccountController.class);

	public static final String BASE_PATH = "/api/search";
	public static final String ROOT = "/";
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createAccount(){
		return "created";
	}

}
