package com.learning.eventhandler;

//event 객체는 spring 코드가 들어가있지 않은 완전한 POJO 객체로 구현하는 것을 추구
//event 객체는 bean 으로 등록하지 않음
public class MyEvent {

    private int data;

    public MyEvent(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

}
