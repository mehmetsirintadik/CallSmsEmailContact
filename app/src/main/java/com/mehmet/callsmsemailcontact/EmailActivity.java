package com.mehmet.callsmsemailcontact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {

    EditText emailAdress, subject, message;
    Button sendEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        emailAdress = (EditText)findViewById(R.id.etEmailAdress);
        subject = (EditText)findViewById(R.id.etSubject);
        message = (EditText)findViewById(R.id.etMessage);
        sendEmail = (Button)findViewById(R.id.btnSendEmail);

    }

    public void sendEmail(View v){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, emailAdress.getText().toString());
        intent.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT, message.getText().toString());
        startActivity(intent);
    }
}
