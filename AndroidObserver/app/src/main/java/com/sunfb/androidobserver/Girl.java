package com.sunfb.androidobserver;


import android.util.Log;

public class Girl implements Observer {

    private String name;//名字
    public Girl(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {//女孩的具体反应
//        System.out.println(name + ",收到了信息:" + message+"让男朋友去取快递~");
        Log.e("sunfb",name + ",收到了信息:" + message+"让男朋友去取快递~");
    }
}

