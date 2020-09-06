package com.learning.eventhandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventHandlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventHandlerApplication.class, args);
    }
}

/*
    특정 이벤트에 대한 handler 가 두 개 이상인 경우 여러 handler 가 순차적으로 실행된다.
    이 때 handler 간의 우선순위를 부여하려면 @Order annotation 을 사용하면 된다.

    비동기적으로 실행하고 싶은 경우 @Async annotation 을 사용하면 된다. (SpringBootApplication 에 @EnableAsync annotation 필요)
 */
