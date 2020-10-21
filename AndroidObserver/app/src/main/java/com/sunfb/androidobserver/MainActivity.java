package com.sunfb.androidobserver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_test=findViewById(R.id.btn_test);
        //点击时间本身就是观察者模式，有兴趣的同学可以跟踪下源码
        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testObservable();
            }
        });

    }
    //观察者模式
    public void testObservable(){
        Observable postman=new Postman();
        Observer boy1=new Boy("路飞");
        Observer boy2=new Boy("乔巴");
        Observer girl1=new Girl("娜美");
        postman.add(boy1);
        postman.add(boy2);
        postman.add(girl1);
        postman.notify("快递到了,请下楼领取.");
    }
}