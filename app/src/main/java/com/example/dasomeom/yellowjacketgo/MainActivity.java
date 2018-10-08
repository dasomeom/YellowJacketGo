package com.example.dasomeom.yellowjacketgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    private Button bLogin;
    private Button bRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bLogin = (Button) findViewById(R.id.mLogin);
        bRegister = (Button) findViewById(R.id.mRegister);
        bLogin.setOnClickListener(this);
        bRegister.setOnClickListener(this);



    }

    public void onClick(View v) {
        if (v == bLogin) {
            Intent intLog = new Intent (this, login.class);
            startActivity(intLog);
        }

        if (v == bRegister) {
            Intent intent2 = new Intent (this, register.class);
            startActivity(intent2);
        }
    }
}
