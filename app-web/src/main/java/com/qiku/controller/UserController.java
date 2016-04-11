package com.qiku.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qiku.service.IUserService;


@Controller
public class UserController {
	
	@Resource
	private IUserService userService;

	@RequestMapping(value="getUser", method={RequestMethod.GET, RequestMethod.POST})
	public String getUser(HttpServletRequest request, HttpServletResponse response){
		System.out.println("dddddddddddddddddddd");
		System.out.println(userService.getUser("大家好，张三                    "));
		return "index";
	}
}
