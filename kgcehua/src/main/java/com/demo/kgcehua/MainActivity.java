package com.demo.kgcehua;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.demo.kgcehua.adapter.ViewPagerAdapter;
import com.demo.kgcehua.fragment.MessageFragment;
import com.demo.kgcehua.fragment.MyVmFragment;
import com.demo.kgcehua.fragment.PersonalCenterFragment;
import com.demo.kgcehua.fragment.RechargeFragment;
import com.demo.kgcehua.fragment.VmMallFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Bt_MyVm, Bt_VmMall, Bt_Recharge, Bt_Message, Bt_PersonalCenter;
    private ViewPager ViewPager;
    private List<Fragment> fragmentList = new ArrayList<>();
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inntView();
        viewPager();
    }

    private void viewPager() {
        fragmentList.add(new MyVmFragment());
        fragmentList.add(new VmMallFragment());
        fragmentList.add(new RechargeFragment());
        fragmentList.add(new MessageFragment());
        fragmentList.add(new PersonalCenterFragment());
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), fragmentList);
        ViewPager.setAdapter(viewPagerAdapter);
        ViewPager.setCurrentItem(0);
        Bt_MyVm.setTextColor(Color.RED);
    }

    private void inntView() {
        ViewPager = findViewById(R.id.ViewPager);
        Bt_MyVm = findViewById(R.id.Bt_MyVm);
        Bt_VmMall = findViewById(R.id.Bt_VmMall);
        Bt_Recharge = findViewById(R.id.Bt_Recharge);
        Bt_Message = findViewById(R.id.Bt_Message);
        Bt_PersonalCenter = findViewById(R.id.Bt_PersonalCenter);
        Bt_MyVm.setOnClickListener(this);
        Bt_VmMall.setOnClickListener(this);
        Bt_Recharge.setOnClickListener(this);
        Bt_Message.setOnClickListener(this);
        Bt_PersonalCenter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Bt_MyVm:
                ViewPager.setCurrentItem(0);
                Bt_MyVm.setTextColor(Color.RED);
                Bt_VmMall.setTextColor(Color.BLACK);
                Bt_Recharge.setTextColor(Color.BLACK);
                Bt_Message.setTextColor(Color.BLACK);
                Bt_PersonalCenter.setTextColor(Color.BLACK);
                break;
            case R.id.Bt_VmMall:
                ViewPager.setCurrentItem(1);
                Bt_VmMall.setTextColor(Color.RED);
                Bt_MyVm.setTextColor(Color.BLACK);
                Bt_Recharge.setTextColor(Color.BLACK);
                Bt_Message.setTextColor(Color.BLACK);
                Bt_PersonalCenter.setTextColor(Color.BLACK);
                break;
            case R.id.Bt_Recharge:
                ViewPager.setCurrentItem(2);
                Bt_Recharge.setTextColor(Color.RED);
                Bt_MyVm.setTextColor(Color.BLACK);
                Bt_VmMall.setTextColor(Color.BLACK);
                Bt_Message.setTextColor(Color.BLACK);
                Bt_PersonalCenter.setTextColor(Color.BLACK);
                break;
            case R.id.Bt_Message:
                ViewPager.setCurrentItem(3);
                Bt_Message.setTextColor(Color.RED);
                Bt_MyVm.setTextColor(Color.BLACK);
                Bt_VmMall.setTextColor(Color.BLACK);
                Bt_Recharge.setTextColor(Color.BLACK);
                Bt_PersonalCenter.setTextColor(Color.BLACK);
                break;
            case R.id.Bt_PersonalCenter:
                ViewPager.setCurrentItem(4);
                Bt_PersonalCenter.setTextColor(Color.RED);
                Bt_MyVm.setTextColor(Color.BLACK);
                Bt_VmMall.setTextColor(Color.BLACK);
                Bt_Recharge.setTextColor(Color.BLACK);
                Bt_Message.setTextColor(Color.BLACK);
                break;
        }
    }
}
