package com.learning.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Singleton Scope 빈
@Component
public class Single {

    @Autowired
    Proto proto;

    public Proto getProto() {
        return proto;
    }
}


