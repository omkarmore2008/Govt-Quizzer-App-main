package com.example.govtquizzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String selectedTopicName = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout gk = findViewById(R.id.gkLayout);
        final LinearLayout reasoning = findViewById(R.id.reasoningLayout);
        final LinearLayout english = findViewById(R.id.engLayout);
        final LinearLayout maths = findViewById(R.id.mathsLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);

        gk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "gk";
                gk.setBackgroundResource(R.drawable.round_back_white_stroke10);

                reasoning.setBackgroundResource(R.drawable.round_back_white10);

                english.setBackgroundResource(R.drawable.round_back_white10);

                maths.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        reasoning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "reasoning";
                reasoning.setBackgroundResource(R.drawable.round_back_white_stroke10);

                gk.setBackgroundResource(R.drawable.round_back_white10);

                english.setBackgroundResource(R.drawable.round_back_white10);

                maths.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "english";
                english.setBackgroundResource(R.drawable.round_back_white_stroke10);

                reasoning.setBackgroundResource(R.drawable.round_back_white10);

                gk.setBackgroundResource(R.drawable.round_back_white10);

                maths.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedTopicName = "maths";
                maths.setBackgroundResource(R.drawable.round_back_white_stroke10);

                reasoning.setBackgroundResource(R.drawable.round_back_white10);

                gk.setBackgroundResource(R.drawable.round_back_white10);

                english.setBackgroundResource(R.drawable.round_back_white10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please select the Topic", Toast.LENGTH_SHORT).show();
                }
                else{

                    Intent intent = new Intent(MainActivity.this,QuizActivity.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}