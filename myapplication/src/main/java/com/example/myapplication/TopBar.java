package com.example.myapplication;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TopBar extends RelativeLayout {
    private Button TopBar_LeftButton;
    private Button TopBar_RightButton;
    private TextView TopBar_Title;
    private OnLeftButtonClickListener leftButtonClickListener;
    private OnRightButtonClickListener rightButtonClickListener;


    public void setLeftButtonClickListener(OnLeftButtonClickListener leftButtonClickListener) {
        this.leftButtonClickListener = leftButtonClickListener;
    }

    public void setRightButtonClickListener(OnRightButtonClickListener rightButtonClickListener) {
        this.rightButtonClickListener = rightButtonClickListener;
    }

    public interface OnLeftButtonClickListener {
        void setOnLeftButtonClick();
    }

    public interface OnRightButtonClickListener {
        void setOnRightButtonClick();
    }


    public TopBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.layout_topbar, this);
        TopBar_LeftButton = findViewById(R.id.TopBar_LeftButton);
        TopBar_RightButton = findViewById(R.id.TopBar_RightButton);
        TopBar_Title = findViewById(R.id.TopBar_Title);
        TopBar_LeftButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                leftButtonClickListener.setOnLeftButtonClick();
            }
        });

        TopBar_RightButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                rightButtonClickListener.setOnRightButtonClick();
            }
        });

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TopBar);
        int leftBackground = typedArray.getResourceId(R.styleable.TopBar_leftBackground, 0);
        int rightBackground = typedArray.getResourceId(R.styleable.TopBar_rightBackground, 0);
        String titleText = typedArray.getString(R.styleable.TopBar_titleText);
        float titleTextSize = typedArray.getDimension(R.styleable.TopBar_titleTextSize, 0);
        int titleTextColor = typedArray.getColor(R.styleable.TopBar_titleTextColor, 0x38ad5a);
        //释放资源
        typedArray.recycle();
        TopBar_LeftButton.setBackgroundResource(leftBackground);
        TopBar_RightButton.setBackgroundResource(rightBackground);
        TopBar_Title.setText(titleText);
        TopBar_Title.setTextSize(titleTextSize);
        TopBar_Title.setTextColor(titleTextColor);
    }

    //设置右边按钮的可见性
    public void setRightButtonVisibility(boolean flag) {
        if (flag)
            TopBar_RightButton.setVisibility(View.VISIBLE);
        else
            TopBar_RightButton.setVisibility(View.GONE);
    }
}
