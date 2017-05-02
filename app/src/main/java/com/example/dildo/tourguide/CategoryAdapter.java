package com.example.dildo.tourguide;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



class CategoryAdapter extends FragmentPagerAdapter {

    private static final String SIGHT = "Sightseeings";
    private static final String NIGHT = "Night Life";
    private static final String FOOD = "Restaurants";
    private static final String HOTELS = "Hotels";
    private final String[] tabTitles = new String[]{SIGHT, NIGHT, FOOD, HOTELS};


    CategoryAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position==0){
        return new SightFragment();}
        else
            return new NightFragment();

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
