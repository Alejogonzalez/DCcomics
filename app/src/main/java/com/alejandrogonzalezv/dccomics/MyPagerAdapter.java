package com.alejandrogonzalezv.dccomics;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;

import java.util.ArrayList;

/**
 * Created by Alejandro on 13/05/2015.
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter{
    private ArrayList<Fragment> fragments;

    public MyPagerAdapter(FragmentManager fragmentManager, ArrayList<Fragment> listaFragments){
        super(fragmentManager);
        this.fragments = listaFragments;
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
