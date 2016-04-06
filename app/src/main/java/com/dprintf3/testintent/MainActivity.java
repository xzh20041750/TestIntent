package com.dprintf3.testintent;

import android.content.Intent;
import android.support.annotation.StringDef;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    private Button button;//定义button的引用
    //R.string.app_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//此行的作用调用oncreate方法后是加载布局文件，通常位于oncreate方法的第一行
        button =(Button)this.findViewById(R.id.button);//给上面定义的button赋值为本类对象的引用内名称为button按钮
        //以下是给button绑定一个点击事件，告诉android系统，点击button按钮后改干点什么
        button.setOnClickListener(new View.OnClickListener() {
            @Override//复写onclick方法
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,OtherActivity.class);//定义一个意图intent，并根据官网Intent的构造涵涵传递参数，第一个参数代本类对像的引用，第二个参数单位的是intent将要调用的activity类
              //以下三行在传递数据,具体格式看官网
                intent.putExtra("name","张三");
                intent.putExtra("age",23);
                intent.putExtra("address","北京");
                //下面一行在启动意图intent
                startActivity(intent);

            }
        });
    }
}
