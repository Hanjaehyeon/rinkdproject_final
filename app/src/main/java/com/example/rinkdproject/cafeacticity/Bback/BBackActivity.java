package com.example.rinkdproject.cafeacticity.Bback;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.rinkdproject.R;
import com.example.rinkdproject.cafeacticity.Ediya.EdiyaActivity;
import com.example.rinkdproject.cafeacticity.Ediya.EdiyaMenuFragment;
import com.google.android.material.tabs.TabLayout;

public class BBackActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ediya);

        mViewPager = (ViewPager)findViewById(R.id.viewPager);
        imageView =(ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.bbaek);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("메뉴"));
        // tabLayout.addTab(tabLayout.newTab().setText("지점"));
        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager)findViewById(R.id.viewPager);
        final BBackActivity.PagerAdapter adapter = new BBackActivity.PagerAdapter
                (getSupportFragmentManager(),tabLayout.getTabCount());
        viewpager.setAdapter(adapter);
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            public void onTabSelected(TabLayout.Tab tab){
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public  void onTabUnselected(TabLayout.Tab tab){

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
    }

    private class PagerAdapter extends FragmentPagerAdapter {
        int mNumOfTabs;

        public PagerAdapter(FragmentManager fm, int NumOfTabs){
            super(fm);
            this.mNumOfTabs=NumOfTabs;
        }
        //getItem메서드를 생성하여 해당 프래그먼트를 각각의 tab화면에 표시하도록 해준다.
        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    menuFragment tab1 = new menuFragment();
                    return tab1;
                /*case 1:
                    EdiyaPlaceFragment tab2 = new EdiyaPlaceFragment();
                    return tab2;*/
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return mNumOfTabs;
        }

    }
}
