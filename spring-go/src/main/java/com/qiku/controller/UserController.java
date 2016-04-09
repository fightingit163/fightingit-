package com.qiku.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {

	@RequestMapping(value="getUser", method={RequestMethod.GET, RequestMethod.POST})
	public String getUser(HttpServletRequest request, HttpServletResponse response){
		System.out.println("dddddddddddddddddddd");
		return "index";
	}
}
