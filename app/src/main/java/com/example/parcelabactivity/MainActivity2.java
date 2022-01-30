package com.example.parcelabactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Parcel;
import android.widget.TextView;

import org.parceler.Parcels;

public class MainActivity2 extends AppCompatActivity {

    TextView textName,textAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textName=findViewById(R.id.textName);
        textAge=findViewById(R.id.textAge);

        User user= Parcels.unwrap(getIntent().getParcelableExtra("user"));

        String name=user.getName();
        String age=user.getAge();

        textName.setText(name);
        textAge.setText(age);
    }
}