package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ScoreQuiz extends AppCompatActivity
{
    int score;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scorequiz);
        Intent incoming = getIntent();
        name = incoming.getStringExtra("Name");
        score = incoming.getExtras().getInt("Score");
        getScore();
    }

    /**
     * gets score for question 5
     */
    public void getScore()
    {
        TextView text = findViewById(R.id.score);

        text.setText(score + "/15");
        Toast.makeText(getApplicationContext(), "Thank you for using my app",
                Toast.LENGTH_SHORT).show();

    }

    /**
     * reset button for quiz
     * calls getscore and calls next activity
     * @param view
     */
    public void restartButton(View view)
    {

        Intent intent = new Intent(this, Question1.class);
        intent.putExtra("Name", name);
        startActivity(intent);

    }
}
