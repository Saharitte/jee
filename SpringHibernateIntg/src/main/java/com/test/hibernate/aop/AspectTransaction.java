package com.test.hibernate.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectTransaction {

	@Pointcut(value = "execution(* com.test.hibernate.dao.PersonDao.* (..))")
	public void aspectTransaction() {

	}

	@Before(value = "aspectTransaction()")
	public void beforeTransaction() {
		// Add ur AOP code
	}

	@After(value = "aspectTransaction()")
	public void afterTransaction() {
		// Add ur AOP code

	}

}
