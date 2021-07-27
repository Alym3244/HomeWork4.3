package com.example.homework43;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager pager;
    VievPagerAdapter adapter;
    TextView txtSkip,txtNext;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = findViewById(R.id.view_pager);
        txtSkip = findViewById(R.id.txt_skip);
        txtNext = findViewById(R.id.txt_next);

        List<OnBoardingModem> list = new ArrayList<>();
        list.add(new OnBoardingModem("Hello1","It,s",R.drawable.camera));
        list.add(new OnBoardingModem("Hello2","It,s",R.drawable.camera));
        list.add(new OnBoardingModem("Hello3","It,s",R.drawable.camera));
        adapter= new VievPagerAdapter(list,getSupportFragmentManager());
        pager.setAdapter(adapter);




        txtSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (position==2){
                    txtNext.setText("Finish");
                }else txtNext.setText("Next");
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        txtNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pager.getCurrentItem()==2){
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }else {
                    pager.setCurrentItem(pager.getCurrentItem()+1);
                }

              pager.setCurrentItem(pager.getCurrentItem() + 1);
            }
        });
         tabLayout= findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(pager, true);
    }
}