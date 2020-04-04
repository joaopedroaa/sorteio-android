package com.joaopedroaats.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectButton(View v){

        int randomNumber = new Random().nextInt(10 + 1);

        TextView text = findViewById(R.id.resultText);
        text.setText(String.valueOf(randomNumber));
    }
}
