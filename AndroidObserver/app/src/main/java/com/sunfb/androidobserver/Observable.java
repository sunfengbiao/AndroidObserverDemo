package com.sunfb.androidobserver;

public interface  Observable {//抽象被观察者
    void add(Observer observer);//添加观察者

    void remove(Observer observer);//删除观察者

    void notify(String message);//通知观察者
}