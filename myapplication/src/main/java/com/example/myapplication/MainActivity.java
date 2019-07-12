package com.example.myapplication;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TopBar topBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarUtil.setColor(this, ContextCompat.getColor(this, R.color.colorAccent), 0);
        topBar = findViewById(R.id.TopBar);
        topBar.setLeftButtonClickListener(new TopBar.OnLeftButtonClickListener() {
            @Override
            public void setOnLeftButtonClick() {
                finish();
            }
        });
        topBar.setRightButtonClickListener(new TopBar.OnRightButtonClickListener() {
            @Override
            public void setOnRightButtonClick() {
                Toast.makeText(MainActivity.this, ";;;;;", Toast.LENGTH_LONG).show();
            }
        });
    }
}
