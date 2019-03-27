package com.itsuccesswin.aspects;

import org.apache.tomcat.util.digester.ObjectCreateRule;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.itsuccesswin.model.Account;

@Component
@Aspect
public class AspectService {

	@AfterReturning(value = "execution(* com.itsuccesswin.service.AccountServiceImp.*(..))", returning = "account")
	public void afterReturningAdvice(JoinPoint joinPoint, Account account) {
		System.out.println("After Returing method : " + joinPoint.getSignature());
		System.out.println("Here Account : " + account);
	}

	@AfterThrowing(value = "execution(* com.itsuccesswin.service.AccountServiceImp.*(..))", throwing = "ex")
	public void afterThroingAdvice(JoinPoint joinPoint, Exception ex) {
		System.out.println("After Throwing exception in method : " + joinPoint.getSignature());
		System.out.println("Execption is : " + ex.getMessage());
	}

	@Around(value = "execution(* com.itsuccesswin.service.AccountServiceImp.*(..))")
	public Object aroudAdvice(ProceedingJoinPoint joinPoint) {
		System.out.println("Before method : " + joinPoint.getSignature());
		Long sTime = System.currentTimeMillis();
		Object object = null;
		try {
			object = joinPoint.proceed();

			if (object instanceof Account) {
				Account account = (Account) object;
				System.out.println(account);

			}
		} catch (Throwable ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("After Method : " + joinPoint.getSignature());
		Long etime = System.currentTimeMillis();

		System.out.println("Total excution time taken by " + joinPoint.getSignature() + "  is " + (etime - sTime));
		return object;
	}

}
