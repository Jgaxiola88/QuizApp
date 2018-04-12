package com.example.android.quizapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Question3 extends AppCompatActivity
{
    int score;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question3);
        Intent incoming = getIntent();
        name = incoming.getStringExtra("Name");
        score = incoming.getExtras().getInt("Score");
    }

    /**
     * gets score for question 3
     */
    public void getScore()
    {
        RadioButton green = findViewById(R.id.True);

        if(green.isChecked())
        {
            score += 2;
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
     * submit button for question 3
     * calls getscore and calls next activity
     * @param view
     */
    public void question1Submit(View view)
    {
        getScore();

        Intent intent = new Intent(this, Question4.class);
        intent.putExtra("Name", name);
        intent.putExtra("Score", score);
        startActivity(intent);

    }
}
