package com.learning.environment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
//test라는 profile로 이 application을 실행하기 전까지는 bookRepository가 bean으로 등록되지 않음
// @Profile("!prod") 로 등록하면 profile이 prod가 아닌 경우에만 등록
// @Profile("!prod & test") 와 같이 조합해서 사용하는 것도 가능
public class TestConfiguration {

    @Bean
    public BookRepository bookRepository() {
        return new TestBookRepository();
    }
}
