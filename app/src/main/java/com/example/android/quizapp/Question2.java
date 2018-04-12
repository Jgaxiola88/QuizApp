package com.example.android.quizapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question2 extends AppCompatActivity
{
    int score;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question2);
        Intent incoming = getIntent();
        name = incoming.getStringExtra("Name");
        score = incoming.getExtras().getInt("Score");
    }

    /**
     * gets score for question 2
     */
    public void getScore()
    {
        RadioButton orange = findViewById(R.id.orange);

        if(orange.isChecked())
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
     * submit button for question 2
     * calls getscore and calls next activity
     * @param view
     */
    public void question1Submit(View view)
    {
        getScore();

        Intent intent = new Intent(this, Question3.class);
        intent.putExtra("Name", name);
        intent.putExtra("Score", score);
        startActivity(intent);
    }
}
