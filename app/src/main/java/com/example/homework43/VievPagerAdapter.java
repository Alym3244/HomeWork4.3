package com.example.homework43;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class VievPagerAdapter extends FragmentStatePagerAdapter {
    private List<OnBoardingModem>list = new ArrayList<>();
    public VievPagerAdapter(List<OnBoardingModem> list, FragmentManager fm){
        super(fm);
        this.list = list;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
            case 1:
            case 2:


                return OnBoarding.newInstance(list.get(position).getTitle(), list.get(position).getDescription(), list.get(position).getImage());

        }
return null;
    }
    @Override
    public int getCount() {
        return list.size();
    }
}
