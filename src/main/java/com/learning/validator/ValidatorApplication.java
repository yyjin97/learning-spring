package com.learning.validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidatorApplication.class, args);
    }
}

/*
    annotation 으로 처리할 수 있는 간단한 경우에는 Validator 없이도 검증이 가능
    복잡한 validation 처리의 경우에는 Validator 클래스를 구현하여 처리
 */
