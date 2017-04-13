package com.example.hp.hej_omra;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by hp on 4/11/2017.
 */

public class TabAdapter extends FragmentStatePagerAdapter
{

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public TabAdapter(FragmentManager fm, int tabCount)
    {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }
    @Override
    public Fragment getItem(int position)
    {
        //Returning the current tabs
        switch (position) {
            case 0:
                IhramClass tab1 = new IhramClass();
                return tab1;
            case 1:
                AllowClass tab2 = new AllowClass();
                return tab2;
            case 2:
                NotAllowedClass tab3 = new NotAllowedClass();
                return tab3;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
