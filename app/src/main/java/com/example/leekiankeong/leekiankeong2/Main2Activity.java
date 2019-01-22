package com.example.leekiankeong.leekiankeong2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class Main2Activity extends AppCompatActivity {

    TextView name,total,status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Intent i = new Intent();

        //String name,status;

        name = (TextView) findViewById(R.id.textView);
        total = (TextView) findViewById(R.id.textView2);
        status = (TextView) findViewById(R.id.textView7);

         String getName = getIntent().getStringExtra("name");//i.getStringExtra("name");
         String getStatus = getIntent().getStringExtra("status");
        String age = getIntent().getStringExtra("age");
         //String getStatus = i.getStringExtra("hello");

        String totalAmount = "Sorry";
        String nor = "Normal";
        String dis = "Disable";
        String sty = "Study";

        if (getStatus.equals(nor)){
            totalAmount = "RM200";
        }else if (getStatus.equals(dis)){
            totalAmount = "Free";}
        else{
            totalAmount = "RM100";}

//        if (getStatus.equals(nor)){
//            totalAmount = "RM200";
//        }else if (getStatus.equals(dis)){
//            totalAmount = "Free";}
//        else{
//            totalAmount = "RM100";}


        name.setText(getName);
        total.setText(totalAmount);
        status.setText(getStatus);


    }
}
