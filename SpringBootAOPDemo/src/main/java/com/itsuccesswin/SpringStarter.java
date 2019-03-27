package com.itsuccesswin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.itsuccesswin.model.Account;
import com.itsuccesswin.service.AccountServiceImp;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)

public class SpringStarter {

	public static void main(String[] args) {
		
  ConfigurableApplicationContext ctx=  SpringApplication.run(SpringStarter.class, args);
  AccountServiceImp accountService= (AccountServiceImp) ctx.getBean("accountServiceImp", AccountServiceImp.class);
  
  Account account ;
  try{
	  account = accountService.getAccounByCustomerId("CID20269835");
	  if(account != null){
		  System.out.println(account.getName_Ac()+" \t" + account.getAccountNumber());
	  }
  }catch(Exception e){
	  System.out.println(e.getMessage());
  }
  
  
  
	}

}
