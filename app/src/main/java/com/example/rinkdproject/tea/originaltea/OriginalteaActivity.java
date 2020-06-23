package com.example.rinkdproject.tea.originaltea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.example.rinkdproject.R;
import com.example.rinkdproject.coffee.Drink;
import com.example.rinkdproject.coffee.cafelatte.CafeLatteColdbrewFragment;
import com.example.rinkdproject.coffee.cafelatte.CafeLatteGreenteaFragment;
import com.example.rinkdproject.coffee.cafelatte.CafeLatteHeizlenutFragment;
import com.example.rinkdproject.coffee.cafelatte.CafeLatteSugarFragment;
import com.example.rinkdproject.coffee.cafelatte.CafeLatteTiramisuFragment;
import com.example.rinkdproject.coffee.cafelatte.CafeLatteYeonyuFragment;
import com.example.rinkdproject.coffee.cafelatte.CafelatteActivity;
import com.example.rinkdproject.coffee.cafelatte.CaffeLatteCaffelatteFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.ArrayList;

public class OriginalteaActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Drink> arrayList;
    private FirebaseDatabase database;

    TextView textView;
    Query query;

    private DatabaseReference databaseReference;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_drink);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        //sv.smoothScrollTo(500,0);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setText("블랙티"));
        tabLayout.addTab(tabLayout.newTab().setText("캐모마일"));
        tabLayout.addTab(tabLayout.newTab().setText("페퍼민트"));
        tabLayout.addTab(tabLayout.newTab().setText("그린티"));
        tabLayout.addTab(tabLayout.newTab().setText("자스민"));
        tabLayout.addTab(tabLayout.newTab().setText("로즈마리"));
        tabLayout.addTab(tabLayout.newTab().setText("히비스커스"));
        tabLayout.addTab(tabLayout.newTab().setText("루이보스"));

        tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);

        final ViewPager viewpager = (ViewPager) findViewById(R.id.viewPager);
        final OriginalteaActivity.PagerAdapter adapter = new OriginalteaActivity.PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewpager.setAdapter(adapter);
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
    }

    private class PagerAdapter extends FragmentPagerAdapter {
        int mNumOfTabs;

        public PagerAdapter(FragmentManager fm, int NumOfTabs) {
            super(fm);
            this.mNumOfTabs = NumOfTabs;
        }

        //getItem메서드를 생성하여 해당 프래그먼트를 각각의 tab화면에 표시하도록 해준다.
        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    BlackteaFragment tab1 = new BlackteaFragment();
                    return tab1;
                case 1:
                    ChamomileFragment tab2 = new ChamomileFragment();
                    return tab2;
                case 2:
                    PeppermintFragment tab3 = new PeppermintFragment();
                    return tab3;
                case 3:
                    GreenteaFragment tab4 = new GreenteaFragment();
                    return tab4;
                case 4:
                   JasmineFragment tab5 = new JasmineFragment();
                    return tab5;
                case 5:
                    RosmaryFragment tab6 = new RosmaryFragment();
                    return tab6;
                case 6:
                    HibiscusFragment tab7 = new HibiscusFragment();
                    return tab7;
                case 7:
                    RooibosFragment tab8 = new RooibosFragment();
                    return tab8;
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
