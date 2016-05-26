package com.tianyl.dubboDemo.cb;

import java.io.Serializable;

import com.tianyl.sdk.DelayListener;

public class CustomDelayListener implements DelayListener, Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public void changed(String msg) {
		System.out.println(msg);
	}

}
