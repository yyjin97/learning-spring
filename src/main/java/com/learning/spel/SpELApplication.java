package com.learning.spel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpELApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpELApplication.class, args);
    }
}

/*
    SpEL (Spring Expression Language)

    문법
        #{"표현식"}
        ${"프로퍼티"}
    표현식에는 프로퍼티를 넣을 수 있지만 그 반대는 불가능!
    bean 의 값을 참조하는 것도 가능
    메서드를 호출하는 것도 가능

 */