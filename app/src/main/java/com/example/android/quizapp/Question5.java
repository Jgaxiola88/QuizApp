package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Question5 extends AppCompatActivity
{
    int score;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question5);
        Intent incoming = getIntent();
        name = incoming.getStringExtra("Name");
        score = incoming.getExtras().getInt("Score");
    }

    /**
     * gets score for question 5
     */
    public void getScore()
    {
        EditText text = findViewById(R.id.inputText);
        score += 2;
        Toast.makeText(getApplicationContext(), text.getText().toString() + " is my favorite color too." ,
                Toast.LENGTH_SHORT).show();

    }

    /**
     * submit button for question 5
     * calls getscore and calls next activity
     * @param view
     */
    public void scoreButton(View view)
    {

        getScore();

        Intent intent = new Intent(this, ScoreQuiz.class);
        intent.putExtra("Name", name);
        intent.putExtra("Score", score);
        startActivity(intent);
    }
}
