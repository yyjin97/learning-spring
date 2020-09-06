package com.learning.messagesource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        while(true) {
            System.out.println(messageSource.getMessage("greeting", new String[] {"yyjin"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[] {"yyjin"}, Locale.getDefault()));
            System.out.println(messageSource.getMessage("greeting", new String[] {"yyjin"}, Locale.US));
            Thread.sleep(1000l);
        }
    }
}

/*
    스프링 부트를 이용한다면 별다른 설정없이 messages.properties 를 사용할 수 있음
 */
