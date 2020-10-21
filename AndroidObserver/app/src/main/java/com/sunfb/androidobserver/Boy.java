package com.sunfb.androidobserver;


import android.util.Log;

public class Boy implements Observer {

    private String name;//名字

    public Boy(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {//男孩的具体反应
//        System.out.println(name + ",收到了信息:" + message + "屁颠颠的去取快递.");
       Log.e("sunfb",name + ",收到了信息:" + message + "屁颠颠的去取快递.");
    }
}

