package com.example.android.quizapp;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Question1 extends AppCompatActivity
{
    int score = 0;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
        Intent incoming = getIntent();
        name = incoming.getStringExtra("Name");
    }

    /**
     * gets score for question 1
     */
    public void getScore()
    {
        CheckBox red = findViewById(R.id.red);
        CheckBox yellow = findViewById(R.id.yellow);
        CheckBox blue = findViewById(R.id.blue);
        CheckBox green = findViewById(R.id.green);

        if(red.isChecked() && yellow.isChecked() && blue.isChecked() && !green.isChecked())
        {
            score += 5;
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
     * submit button for question 1
     * calls getscore and calls next activity
     * @param view
     */
    public void question1Submit(View view)
    {
        getScore();

        Intent intent = new Intent(this, Question2.class);
        intent.putExtra("Name", name);
        intent.putExtra("Score", score);
        startActivity(intent);
    }

}
