package com.example.persondetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,age,gender,address,phone,dob,qualification,job;
    Button button;
    String sname,sage,sgender,sadd,sphone,sdob,squal,sjob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        age=findViewById(R.id.age);
        gender=findViewById(R.id.gender);
        address=findViewById(R.id.address);
        dob=findViewById(R.id.dob);
        phone=findViewById(R.id.phone);
        qualification=findViewById(R.id.qualification);
        job=findViewById(R.id.job);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Second.class);
                sname=name.getText().toString();
                i.putExtra("key1",sname);
                sage=age.getText().toString();
                i.putExtra("key2",sage);
                sgender=gender.getText().toString();
                i.putExtra("key3",sgender);
                sadd=address.getText().toString();
                i.putExtra("key4",sadd);
                sphone=phone.getText().toString();
                i.putExtra("key5",sphone);
                sdob=dob.getText().toString();
                i.putExtra("key6",sdob);
                squal=qualification.getText().toString();
                i.putExtra("key7",squal);
                sjob=job.getText().toString();
                i.putExtra("key8",sjob);
                startActivity(i);
            }
        });

    }
}