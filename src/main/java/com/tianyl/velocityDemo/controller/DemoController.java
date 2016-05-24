package com.tianyl.velocityDemo.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tianyl.velocityDemo.model.User;

@Controller
public class DemoController {

	@RequestMapping("m1")
	public void m1(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.getWriter().write("OK");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("vmDemo")
	public Object vmDemo(Model model) {
		model.addAttribute("name", "张三");
		model.addAttribute("age", 55);
		model.addAttribute("hobbies", Arrays.asList("足球", "篮球", "乒乓球"));
		User user = new User();
		user.setLoginName("李四");
		// user.setAge(10);
		model.addAttribute("user", user);
		return "vm/springmvc-demo";
	}

}
