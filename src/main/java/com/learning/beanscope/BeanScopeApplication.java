package com.learning.beanscope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeanScopeApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanScopeApplication.class, args);
    }
}

/*
    Singleton scope 객체에 Prototype scope 객체를 주입하는 경우 Proto 클래스를 감싸는 Proxy 객체를 주입해주어야
    매번 다른 Proto 객체를 참조할 수 있다!
    Proxy 객체는 Proto 객체를 상속받으므로 Proto 타입 참조변수로 참조 가능
    => 넓은 Scope을 가진 빈에서 짧은 Scope을 가진 빈들을 주입받을 때 주의해야한다.

    Singleton 객체내의 변수들은 thread safe 하지 않음 -> 반드시 thread safe 한 방식으로 코딩해야한다.
 */