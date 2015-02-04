package com.test.hibernate.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class AspectTransaction {
	
	
	@Pointcut(value = "execution(* com.test.hibernate.dao.PersonDao.* (..))")
	public void aspectTransaction()
	{
		
	}
	
	
	@Before(value = "aspectTransaction()")
	public void beforeTransaction() {
		
		
	}
	@After(value = "aspectTransaction()")
	public void afterTransaction() {
		
		
	}
	
}
