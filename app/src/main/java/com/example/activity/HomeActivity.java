package com.example.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView txtLoginEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle params = getIntent().getExtras();

        txtLoginEmail = findViewById(R.id.txtLoginEmail);

        txtLoginEmail.setText(  params.getString("email" ) );

    }
}
