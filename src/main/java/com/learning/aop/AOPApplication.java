package com.learning.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AOPApplication {

    public static void main(String[] args) {
        SpringApplication.run(AOPApplication.class, args);
    }
}

/*
    AOP(Aspect-oriented Programming) 은 흩어진 Aspect 를 모듈화 할 수 있는 기법

    AOP 주요 개념
        - Advice: 해야 할 일들
        - Target: 적용되는 대상
        - Pointcut: 어디에 적용해야 하는지
        - Join point: 합류점 (ex. 생성자 호출 직전, 필드 호출 전 ...)

    AOP 적용 방법
        - 컴파일: 자바 파일을 클래스 파일로 만들 때 바이트 코드를 조작
        - 로드 타임: 컴파일은 순수한 상태로 하고 클래스 파일을 JVM 에 로딩하는 시점에 로딩하는 클래스 파일을 변경
        - 런타임: 스프링 AOP 가 사용하는 방법,
                 A 클래스 타입의 빈을 만들 때 A 타입을 감싼 proxy 빈을 생성

    AOP 구현체
        - AspectJ
        - 스프링 AOP

    스프링 AOP
        - 프록시 기반의 AOP 구현체
        - 스프링 빈에만 AOP 를 적용할 수 있음
        - 프록시 패턴: 기존 코드 변경없이 접근 제어 또는 부가 기능 추가 가능

    AbstractAutoProxyCreator 클래스가 해당 빈의 proxy 빈을 만들어서 proxy 빈을 대신 빈으로 등록
    (AbstractAutoProxyCreator implements BeanPostProcessor)

    어드바이스 정의
        - @Around
        - @Before
        - @AfterReturning
        - @AfterThrowing
 */