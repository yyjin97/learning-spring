package com.learning.resourceloader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ResourceLoader resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(resourceLoader.getClass());                  //ApplicationContext 의 타입이 WebApplicationContext

        Resource resource = resourceLoader.getResource("test.txt");
        System.out.println(resource.getClass());                //따라서 getResource 로 얻어온 Resource 의 타입이 ServletWebApplicationContext
        System.out.println(resource.exists());

        resource = resourceLoader.getResource("classpath:test.txt");    //classpath: 접두어를 사용하였으므로
        System.out.println(resource.getClass());                //Resource 의 타입이 ClassPathResource
        System.out.println(resource.exists());
        System.out.println(resource.getDescription());
        System.out.println(Files.readString(Path.of(resource.getURI())));
    }
}

