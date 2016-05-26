package com.tianyl.dubboDemo.service;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tianyl.dubboDemo.cb.CustomDelayListener;
import com.tianyl.sdk.IDelayTimeService;
import com.tianyl.sdk.ITimeService;

@Service
public class DubboDemoService {

	@Reference
	private ITimeService timeService;

	@Reference(timeout = 10000)
	private IDelayTimeService delayTimeService;

	public String time() {
		return timeService.time();
	}

	public void delayTime() {
		delayTimeService.delayTime(3, new CustomDelayListener());
	}

}
