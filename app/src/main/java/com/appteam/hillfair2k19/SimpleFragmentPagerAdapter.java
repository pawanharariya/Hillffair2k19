package com.appteam.hillfair2k19;


import android.app.Activity;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import com.appteam.fragments.ClubsFragment;
import com.appteam.fragments.Coupons;
import com.appteam.fragments.LeaderboardFragment;
import com.appteam.fragments.SponsersFragment;



public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    Activity activity;


    public SimpleFragmentPagerAdapter(FragmentManager fm,Activity activity) {
        super(fm);

        this.activity = activity;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SponsersFragment(activity);
        } else if (position == 1) {
            return new QuizCategories(activity);
 //       } else if (position == 2) {
   //         return new FaceSmash(activity);
        } else if (position == 1) {
            return new LeaderboardFragment(activity);
        } else if (position == 2) {
            return new ClubsFragment(activity);
        } else if (position == 3) {
            return new coreteam(activity);
        } else if (position == 4) {
            return new Coupons(activity);
        }
        return new SponsersFragment(activity);

    }


    @Override
    public int getCount() {
        return 5;
    }


}
