package com.example.hello_word;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private ImageButton imageButton;
    private TextView textView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = findViewById(R.id.imageButton);
        textView = findViewById(R.id.textView);

        button = findViewById(R.id.button2);



    }

    public void startButton(View view) {
        imageButton.setImageResource(R.drawable.android);
        textView.setVisibility(View.VISIBLE);
        imageButton.setClickable(false);


    }

    public void perehod(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    public void colorButton(View view) {
        button.setBackgroundColor(Color.RED);
        Toast toast = Toast.makeText(getApplicationContext(), "gbbdt", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();


    }

    public  void exit (View view) {
        finish();
    }









}