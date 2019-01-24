package com.daniel.rest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    //private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("execution(* com.daniel.rest.service..*.*(..))")
    public void log(){
        //logger.info("before method log done"+ AopContext.currentProxy().getClass());
        //logger.info("before method log done");
        int a = 0;
    }

    //可以通过JoinPoint取到aop的类名，方法参数，方法签名
    @After("execution(* com.daniel.rest.service..*.*(..))")
    public void logAfter(JoinPoint joinPoint){
        int a = 0;
        //logger.info("after method log done "+joinPoint.getTarget().getClass()+",args="+ Arrays.asList(joinPoint.getArgs())+",method="+joinPoint.getSignature());
    }
}