package com.example.leekiankeong.leekiankeong2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private EditText nameTxt,status,age;
    private Button btn;
    private TextView view1;
    private String statusT;
    private int position = -1;
    private         String[] arraySpinner = new String[]{
            "Normal","Senior Citizen", "Children","Haj","Student","Study","Disable"
    };
    Spinner s; //= (Spinner) findViewById(R.id.spinner2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s = (Spinner) findViewById(R.id.spinner2);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        nameTxt = (EditText) findViewById(R.id.TextName);
        age = (EditText) findViewById(R.id.TextName);

       // int hh = s.getPositionForView();



        //String test4 = s.getSelectedItem().toString();

        btn = findViewById(R.id.btnCal);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                position = s.getSelectedItemPosition();
                statusT = arraySpinner[position];


                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                //i.putExtra("name",nameTxt);
                i.putExtra("name",nameTxt.getText().toString());
                i.putExtra("status",statusT);
                //i.putExtra("age",age.getText().toString());
                //i.putExtra("p",position);
                startActivity(i);

                //startActivity(i);
                //startActivity(MainActivity.this,Main2Activity.class);


            }
        });



    }
}
