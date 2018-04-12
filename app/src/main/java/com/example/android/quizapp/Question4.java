package com.example.android.quizapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question4 extends AppCompatActivity
{
    int score;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question4);
        Intent incoming = getIntent();
        name = incoming.getStringExtra("Name");
        score = incoming.getExtras().getInt("Score");
    }

    /**
     * gets score for question 4
     */
    public void getScore()
    {
        RadioButton purple = findViewById(R.id.purple);

        if(purple.isChecked())
        {
            score += 3;
            Toast.makeText(this, "Well done " + name,
                    Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Wrong Answer " + name,
                    Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * submit button for question 4
     * calls getscore and calls next activity
     * @param view
     */
    public void question1Submit(View view)
    {
        getScore();

        Intent intent = new Intent(this, Question5.class);
        intent.putExtra("Name", name);
        intent.putExtra("Score", score);
        startActivity(intent);
    }
}
