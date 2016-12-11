package com.mehmet.callsmsemailcontact;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallActivity extends AppCompatActivity {

    EditText phoneNumber;
    Button call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        phoneNumber = (EditText)findViewById(R.id.etPhoneNumber);
        call = (Button)findViewById(R.id.btnCallNumber);
    }

    public void callNumber(View v){
        Uri uri = Uri.parse("tel:"+phoneNumber.getText().toString());
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);

        startActivityForResult(intent, 1);
    }
    //startActivityForResult check

    public void callNumber2(View v){
        Uri uri = Uri.parse("tel:"+phoneNumber.getText().toString());
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);

        startActivityForResult(intent, 1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                Log.i("Result","CallNumber");
                break;
            case 2:
                Log.i("Result","CallNumber2");
                break;
        }
    }
}
