package com.wzy.chajiandemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_login).setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        Intent intent = new Intent(this, LoginServiceActivity.class);
        startActivity(intent);
    }
}