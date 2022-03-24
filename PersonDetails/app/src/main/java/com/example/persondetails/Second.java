package com.example.persondetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text=findViewById(R.id.text);
        String a=getIntent().getStringExtra("key1");
        String b=getIntent().getStringExtra("key2");
        String c=getIntent().getStringExtra("key3");
        String d=getIntent().getStringExtra("key4");
        String e=getIntent().getStringExtra("key5");
        String f=getIntent().getStringExtra("key6");
        String g=getIntent().getStringExtra("key7");
        String h=getIntent().getStringExtra("key8");
        text.setText(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g+"\n"+h);
    }
}