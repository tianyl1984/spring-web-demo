package com.tianyl.dubboDemo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tianyl.dubboDemo.service.DubboDemoService;

@Controller
public class DubboController {

	@Autowired
	private DubboDemoService dubboDemoService;

	@RequestMapping("time")
	@ResponseBody
	public void time(HttpServletResponse response) throws Exception {
		String timeStr = dubboDemoService.time();
		response.getWriter().write(timeStr);
	}

	@RequestMapping("delayTime")
	@ResponseBody
	public void delayTime(HttpServletResponse response) throws Exception {
		dubboDemoService.delayTime();
		response.getWriter().write("ok!!!");
	}

}
