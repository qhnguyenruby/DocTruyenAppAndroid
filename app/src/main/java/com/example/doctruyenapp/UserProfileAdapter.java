package com.example.doctruyenapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class UserProfileAdapter extends FragmentStatePagerAdapter {


    public UserProfileAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public int getCount() {
        return 3;
    }

    public Fragment getItem(int position){
        switch (position){
            case 0:
                LikeFragment likeFragment = new LikeFragment();
                return likeFragment;
            case 1:
                HistoryFragment historyFragment = new HistoryFragment();
                return historyFragment;
            case 2:
                ProfileFragment profileFragment = new ProfileFragment();
                return profileFragment;
            default:
                LikeFragment likeFragment1 = new LikeFragment();
                return likeFragment1;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Likes";
                break;
            case 1:
                title = "History";
                break;
            case 2:
                title = "Profile";
        }
        return title;
    }
}
