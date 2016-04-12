package com.qiku.controller;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qiku.service.IUserService;


@Controller
public class UserController {
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Resource
	private IUserService userService;

	@RequestMapping(value="getUser", method={RequestMethod.GET, RequestMethod.POST})
	public String getUser(HttpServletRequest request, HttpServletResponse response){
		System.out.println("dddddddddddddddddddd");
		System.out.println(userService.getUser("张三  4月12号改动   "));
		logger.info("调用user， 时间{}", new Date());
		logger.debug("debug调用user， 时间{}", new Date());
		return "index";
	}
}
