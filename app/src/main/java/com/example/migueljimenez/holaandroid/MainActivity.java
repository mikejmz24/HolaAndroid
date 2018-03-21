package com.example.migueljimenez.holaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView)findViewById(R.id.myTextView);
        myTextView.setText("He modificado TextView con un nuevo texto usando Java");
    }
}
