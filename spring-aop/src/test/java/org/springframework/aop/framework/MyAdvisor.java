package org.springframework.aop.framework;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * MyAdvisor
 *
 * @author baitianhao@sck2data.com.cn
 * @date 2019/02/13 15:23
 **/
public class MyAdvisor implements MethodInterceptor {
	public void before() throws Throwable {
		System.out.println("before execute...");
	}

	public void after() throws Throwable {
		System.out.println("after return...");
	}


	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object result = null;
		before();
		result = invocation.proceed();
		after();
		return result;
	}
}
