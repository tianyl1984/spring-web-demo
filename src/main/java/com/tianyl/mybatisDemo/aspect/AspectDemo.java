package com.tianyl.mybatisDemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDemo {

	// @Around("@annotation(org.springframework.transaction.annotation.Transactional)")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		Object obj = pjp.proceed();
		System.out.println("执行。。。。。。。。。。。。。。。。。。。");
		return obj;
	}
}
