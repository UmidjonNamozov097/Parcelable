package com.example.parcelabactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.parceler.Parcels;

public class MainActivity extends AppCompatActivity {

    EditText eTxtName,eTxtAge;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTxtName=findViewById(R.id.edtTx);
        eTxtAge=findViewById(R.id.edtTx2);
        btnSend=findViewById(R.id.button);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=eTxtName.getText().toString();
                String age=eTxtAge.getText().toString();

                User user=new User(name,age);

                Intent intent=new Intent(MainActivity.this, MainActivity2.class);

                Bundle bundle=new Bundle();
                bundle.putParcelable("user", Parcels.wrap(user));

                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}