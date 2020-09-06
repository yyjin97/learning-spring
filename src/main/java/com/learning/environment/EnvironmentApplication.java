package com.learning.environment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnvironmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnvironmentApplication.class, args);
    }
}

/*
    프로파일 - 빈들의 그룹,
            각각 환경에 따라 다른 빈들을 써야하는 경우, 특정 환경에서 특정 빈을 사용해야 하는 경우 사용

    프로파일 설정 방법
        1. Edit Configuration - Active profile 에 등록
        2. Edit Configuration - Environment - Vm option : -Dspring.profiles.active="test" 로 등록

    프로퍼티 설정 방법
        1. Edit Configuration - Environment - Vmoption : -Dkey=value 와 같이 등록 (ex. -Dapp.run=spring )
        2. properties 파일에 설정 -> 이 경우 @PropertySource("classpath:/app.properties")로 등록
 */