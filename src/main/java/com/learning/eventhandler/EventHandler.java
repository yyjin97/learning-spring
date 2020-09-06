package com.learning.eventhandler;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//EventHandler 는 bean 으로 등록해야함
@Component
public class EventHandler {

    //Event 를 처리하는 함수에 @EventHandler annotation 을 붙여야 함
    @EventListener
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public void handle(MyEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트 발생! 데이터는 " + event.getData() + "입니다.");
    }

    @EventListener
    public void handle(ContextRefreshedEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextRefreshedEvent");
    }

    @EventListener
    public void handle(ContextClosedEvent event) {          //ContextClosedEvent 는 exit code -1 로 종료하는 경우에는 실행 안됨
        System.out.println(Thread.currentThread().toString());
        System.out.println("ContextClosedEvent");
    }
}

/*
    ContextRefreshedEvent : ApplicationContext 를 초기화 했거나 리프레시 했을 때 발생
    ContextStartedEvent : ApplicationContext 를 start() 하여 라이프사이클 빈들이 시작 신호를 받은 시점에 발생
    ContextStoppedEvent : ApplicationContext 를 stop() 하여 라이프사이클 빈들이 정지신호를 받은 시점에 발생
    ContextClosedEvent : ApplicationContext 를 close() 하여 싱글톤 빈 소멸되는 시점에 발생
    RequestHandledEvent : HTTP 요청을 처리했을 때 발생
 */
