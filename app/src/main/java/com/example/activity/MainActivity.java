package com.example.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btnRegister;
    EditText email;
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        email = findViewById(R.id.txEmail);
        password = findViewById(R.id.txtPassword);




        btnRegister = findViewById( R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i ("BUTTON", "click en el boton");
                Intent intentLogin = new Intent( MainActivity.this , HomeActivity.class );


                intentLogin.putExtra("email", email.getText().toString());
                intentLogin.putExtra( "password", password.getText().toString());


                startActivity( intentLogin );

            }
        });



        Log.i ( "LOGCAT", "create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i ( "LOGCAT", "start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i ( "LOGCAT", "pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i ( "LOGCAT", "resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i ( "LOGCAT", "destroy");
    }
}
