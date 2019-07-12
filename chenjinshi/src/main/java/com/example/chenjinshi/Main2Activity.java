package com.example.chenjinshi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.jaeger.library.StatusBarUtil;
import com.r0adkll.slidr.Slidr;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    private LinearLayout LLLL;
    private int mColor;
    private int mAlpha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Slidr.attach(this);
        LLLL = findViewById(R.id.LLLL);
        Random random = new Random();
        mColor = 0xff000000 | random.nextInt(0xffffff);
        LLLL.setBackgroundColor(mColor);
        StatusBarUtil.setColor(Main2Activity.this, mColor, mAlpha);

    }
}
