package com.example.a06_activity_switching;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;

public class testH6 extends AppCompatActivity {

    private ConstraintLayout pageA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_h6);
        pageA = (ConstraintLayout) findViewById(R.id.pagea);
    }

    public void Switch(View view) {
        Intent intent = new Intent();
        intent.setClass(testH6.this, testH6_2.class);
        pageA.setBackgroundColor(Color.YELLOW);
        startActivity(intent);
    }
}