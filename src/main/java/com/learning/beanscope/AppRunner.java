package com.learning.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext ctx;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        //Singleton scope 의 객체들은 매번 같은 객체를 출력
        System.out.println("single");
        System.out.println(ctx.getBean(Single.class));
        System.out.println(ctx.getBean(Single.class));
        System.out.println(ctx.getBean(Single.class));

        //Prototype scope 의 객체들은 매번 다른 객체를 출력
        System.out.println("proto");
        System.out.println(ctx.getBean(Proto.class));
        System.out.println(ctx.getBean(Proto.class));
        System.out.println(ctx.getBean(Proto.class));

        //싱글톤 빈이 프로토타입 빈을 참조하는 경우 프로토 빈에 ProxyMode 설정해주어야 매번 다른 객체 참조!
        System.out.println("single.proto");
        System.out.println(ctx.getBean(Single.class).getProto());
        System.out.println(ctx.getBean(Single.class).getProto());
        System.out.println(ctx.getBean(Single.class).getProto());

    }
}
