package com.tianyl.dubboDemo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tianyl.sdk.ITimeService;

@Controller
public class DubboController {

	@Autowired
	private ITimeService timeService;

	@RequestMapping("time")
	@ResponseBody
	public void time(HttpServletResponse response) throws Exception {
		String timeStr = timeService.time();
		response.getWriter().write(timeStr);
	}

}
