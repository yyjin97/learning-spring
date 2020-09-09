package com.learning.spel;

import org.springframework.stereotype.Component;

@Component
public class Sample {

    private int data = 10;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
