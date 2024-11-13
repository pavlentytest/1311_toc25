package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button; // null
    private ConstraintLayout root;
    private int[] colors = {
                        Color.argb(255,255,255,0), // 0
                        Color.argb(255,0,255,255), // 1
                        Color.argb(255,255,0,255)  // 2
    };
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(this::onClick);
        root = findViewById(R.id.main);
    }

    @Override
    public void onClick(View v) {
        root.setBackgroundColor(colors[random.nextInt(3)]);
    }
}