package com.learning.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

    //@Around("bean(simpleEventService)") 로 지정할 경우 빈에 있는 모든 메서드에 적용됨
    @Around("@annotation(PerfLogging)")
    public Object perfLogging(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object retVal = pjp.proceed();
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;
    }

    @Before("@annotation(PerfLogging)")
    public void hello() {
        System.out.println("hello !");
    }

}
