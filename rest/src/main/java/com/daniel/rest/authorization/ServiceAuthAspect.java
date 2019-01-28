package com.daniel.rest.authorization;

import com.daniel.rest.Log.LoggerWrapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAuthAspect {

    //Define a pointcut (when and where to invoke aop)
    @Pointcut("execution(public * com.daniel.rest.service..*.*(..))")
    private void authorizeAll() {}

    //Define an advise (What to do before pointcut)
    @Before("authorizeAll()")
    public void authorize(){
        LoggerWrapper.info("Authorize successfully.");
    }

//    @After("authorizeAll()")
//    public void after(){
//    }
}