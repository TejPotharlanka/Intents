package com.example.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {

    String s1,s2,s3;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toast.makeText(getApplicationContext(), "We are moved to second Activity",Toast.LENGTH_LONG).show();

        t1 = (TextView) findViewById(R.id.onetv);

        Intent i=getIntent();
        if(i.hasExtra("one_para")){
            t1.setText(i.getStringExtra("one_para"));
        }
        else if (i.hasExtra("two_para")){
            t1.setText(i.getStringExtra("two_para"));
        }
        else {
            t1.setText(i.getStringExtra("three_para"));
        }
    }


    public void back(View view) {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}
