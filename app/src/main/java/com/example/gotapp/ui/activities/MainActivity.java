package com.example.gotapp.ui.activities;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.gotapp.R;
import com.example.gotapp.ui.fragments.PageFragment;
import com.example.gotapp.viewmodels.CharacterViewModel;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {

    private CharacterViewModel charViewModel;

    static final String TAG = "myLogs";
    static final int PAGE_COUNT = 3;

    TabLayout tabLayout;
    ViewPager pager;
    PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.sliding_tabs);
        pager = findViewById(R.id.pager);
        pagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(pager);
        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                Log.d(TAG, "onPageSelected, position = " + position);
            }

            @Override
            public void onPageScrolled(int position, float positionOffset,
                                       int positionOffsetPixels) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        initViewModel();

    }

    private void initViewModel() {
        charViewModel = new CharacterViewModel();
    }

    private static class MyFragmentPagerAdapter extends FragmentPagerAdapter {
        static ArrayList<String> clanList = new ArrayList<>();

        public CharSequence getPageTitle(int position) {
            clanList.add("LANISTERS");
            clanList.add("STARKS");
            clanList.add("TARGARYENS");

            return clanList.get(position);
        }

        public MyFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return PageFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

    }

}