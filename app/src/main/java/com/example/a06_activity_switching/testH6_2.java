package com.example.a06_activity_switching;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;

public class testH6_2 extends AppCompatActivity {

    private ConstraintLayout pageB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_h62);
        pageB = (ConstraintLayout) findViewById(R.id.pageb);
        pageB.setBackgroundColor(Color.BLACK);
    }
    public void Switch(View view) {
        testH6_2.this.finish();
    }
}