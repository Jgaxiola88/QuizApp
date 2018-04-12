package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Starts quiz and sends name info to new activity
     * @param view
     */
    public void button(View view)
    {
        EditText input = findViewById(R.id.name_text);
        name = input.getText().toString();
        Intent myIntent = new Intent(this,Question1.class);
        myIntent.putExtra("Name", name);
        startActivity(myIntent);
    }

}


