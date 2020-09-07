package com.learning.resourceloader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResourceLoaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResourceLoaderApplication.class, args);
    }
}

/*
    Resource 의 타입은 location 문자열과 'ApplicationContext 의 타입' 에 따라 결정
        ClassPathXmlApplicationContext -> ClassPathResource
        FileSystemXmlApplicationContext -> FileSystemResource
        WebApplicationContext -> ServletContextResource

    ApplicationContext 의 타입에 상관없이 리소스 타입을 강제하려면 java.net.URL 접두어 중 하나를 사용할 수 있다
        ex. classpath:com.learning.config.xml -> ClassPathResource
            file:///some/resource/path/config.xml -> FileSystemResource
 */