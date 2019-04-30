package com.example.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HomeActivity extends AppCompatActivity {

    ListView listView;
    List<String> androidversion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Bundle params = getIntent().getExtras();
        String email;
        email = params.getString("email");

        listView = findViewById(R.id.listView);

        setTitle(email);

        androidversion =  new ArrayList<>();

        androidversion.add("Pie");
        androidversion.add("Oreo");
        androidversion.add("Nougat");
        androidversion.add("Marsmallow");
        androidversion.add("Lollipop");
        androidversion.add("Kitkat");
        androidversion.add("...");


        ArrayAdapter adaptadorVersiones =  new ArrayAdapter( this,
                                                              android.R.layout.simple_list_item_1,
                                                              androidversion);


        listView.setAdapter( adaptadorVersiones );

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String androidVersion = androidversion.get( position );
                Log.i ("LOGCAT", "click en " + androidVersion);
            }
        });





    }
}
