package com.mehmet.callsmsemailcontact;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SmsActivity extends AppCompatActivity {

    EditText phoneNumber, message;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        phoneNumber=(EditText)findViewById(R.id.etPhoneNumber);
        message = (EditText)findViewById(R.id.etMessage);
        send = (Button)findViewById(R.id.btnSend);
    }

    public void sendSms(View v){
        try{
            Uri uri = Uri.parse("smsto:"+phoneNumber.getText().toString());
            Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
            intent.putExtra("sms_body",message.getText().toString());
            startActivityForResult(intent,1);
        }catch (Exception ex){
            Log.i("Hata",ex.getMessage());
        }

    }
}
