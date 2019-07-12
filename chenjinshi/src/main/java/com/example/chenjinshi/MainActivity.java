package com.example.chenjinshi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.jaeger.library.StatusBarUtil;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int mColor;
    private int mAlpha;
    private LinearLayout LLLL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LLLL = findViewById(R.id.LLLLL);
        Random random = new Random();
        mColor = 0xff000000 | random.nextInt(0xffffff);
        LLLL.setBackgroundColor(mColor);
        StatusBarUtil.setColor(MainActivity.this, mColor, mAlpha);
    }

    public void Next(View view) {
        startActivity(new Intent(this, Main2Activity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        LLLL = findViewById(R.id.LLLLL);
        Random random = new Random();
        mColor = 0xff000000 | random.nextInt(0xffffff);
        LLLL.setBackgroundColor(mColor);
        StatusBarUtil.setColor(MainActivity.this, mColor, mAlpha);
    }
}
