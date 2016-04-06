package com.dprintf3.testintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by zh on 2016/4/4.
 */
public class OtherActivity extends Activity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        textView=(TextView)this.findViewById(R.id.msg);
        Intent intent=getIntent();
        int age=intent.getIntExtra("age", 0);
        String name=intent.getStringExtra("name");
        String address=intent.getStringExtra("address");
        textView.setText("age---->"+age+"\n"+"name---->"+name+"\n"+"address----->"+address);


    }

}
