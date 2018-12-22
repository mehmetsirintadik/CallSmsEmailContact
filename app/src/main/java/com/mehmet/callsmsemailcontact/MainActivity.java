package com.mehmet.callsmsemailcontact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnCall, btnSms, btnEmail, btnContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall = (ImageButton)findViewById(R.id.btnCall);
        btnSms = (ImageButton)findViewById(R.id.btnSms);
        btnEmail = (ImageButton)findViewById(R.id.btnEmail);
        btnContact = (ImageButton)findViewById(R.id.btnContact);
    }

    public void callIntentTransition(View v){
        Intent i = new Intent(MainActivity.this, CallActivity.class);
        startActivity(i);
    }

    public void emailIntentTransition(View v){
        Intent i = new Intent(MainActivity.this, EmailActivity.class);
        startActivity(i);
    }

    public void smsIntentTransition(View v){
        Intent i = new Intent(MainActivity.this, SmsActivity.class);
        startActivity(i);
    }

    public void contactIntentTransition(View v){
        Intent i = new Intent(MainActivity.this, ContactActivity.class);
        startActivity(i);
    }
}
