package com.app.controller;

import java.util.List;

import com.app.pojo.dec_user;
import com.app.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class userController {
	@Autowired
	private userService userService;
	
	@RequestMapping("/selectAllUsers")
	public String selectAllNews(Model model) {
		List<dec_user> list = userService.allUsers();
		
		model.addAttribute("userList", list);
		return "main";
	}
}
