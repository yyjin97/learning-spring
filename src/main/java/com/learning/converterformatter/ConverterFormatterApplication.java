package com.learning.converterformatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConverterFormatterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConverterFormatterApplication.class, args);
    }
}

/*
    *Converter
        Converter 는 S 타입의 객체를 T 타입으로 변환할 수 있다. (String 타입이 아니어도 가능)
        Converter<Src, Target> 인터페이스를 구현하여 Converter 를 생성

    *Formatter
        Object 와 String 간의 변환을 담당한다.
        문자열을 Locale 에 따라 다국화하는 기능도 제공
        Web 과 관련해서 만드는 경우 Formatter 를 추천

    Converter 와 Formatter 는 상태 정보 없음 == stateless == thread safe => 빈으로 등록해도 됨!
    ConverterRegistry 와 FormatterRegistry 에 등록하여 사용해야 하지만 spring boot 에서는
    빈으로 등록만하면 WebConversionService 가 Converter 와 Formatter 를 찾아 자동으로 등록해줌
 */
