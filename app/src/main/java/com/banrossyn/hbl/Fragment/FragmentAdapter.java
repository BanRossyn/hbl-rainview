package com.banrossyn.hbl.Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class FragmentAdapter extends FragmentPagerAdapter {
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Frist_Fragment();
            case 1:
                return new Second_Fragment();
            case 2:
                return new Third_Fragment();
            case 3:
                return new Four_Fragment();
            case 4:
                return new Five_Fragment();
            default:
                return new Frist_Fragment();
        }

    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "\uD83D\uDE0D";
        } else if (position == 1) {
            title = "\uD83E\uDD70";
        } else if (position == 2) {
            title = "\uD83D\uDE1D";
        } else if (position == 3) {
            title = "\uD83E\uDD2D";
        } else if (position == 4) {
            title = "\uD83E\uDD73";
        }
        return title;
    }
}