package com.learning.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    Validator validator;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Event event = new Event();
        event.setId(0);
        event.setEmail("aaabbb");
        EventValidator eventValidator = new EventValidator();

        Errors errors = new BeanPropertyBindingResult(event, "event");

        eventValidator.validate(event, errors);         //Validator 클래스를 구현하여 사용하는 경우
        validator.validate(event, errors);              //annotation 을 사용하는 경우

        System.out.println(validator.getClass());
        errors.getAllErrors().forEach(e -> {
            System.out.println("=============error code =============");
            Arrays.stream(e.getCodes()).forEach(System.out::println);
            System.out.println(e.getDefaultMessage());
        });
    }
}