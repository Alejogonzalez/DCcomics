package com.alejandrogonzalezv.dccomics;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import java.util.ArrayList;


public class MainActivity extends FragmentActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batman fragbatman = new batman();
        robin fragrobin = new robin();
        harley fragharley = new harley();

        ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

        fragmentList.add(fragbatman);
        fragmentList.add(fragrobin);
        fragmentList.add(fragharley);

        MyPagerAdapter mSectionsPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),fragmentList);

        ViewPager mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);



    }

   /* class MyPageAdapter extends PagerAdapter{
        public int getCount(){
            return 3;
        }
        public Object instantiateItem(ViewGroup container, int position){
            View page = null;
            switch (position){
                case 0: if (page1==null)
                        page1 = (LinearLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.fragment_batman,null);
                    page = page1;
                    break;

                case 1: if (page2==null)
                    page2 = (LinearLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.fragment_robin,null);
                    page = page2;
                    break;

                default: if (page3==null)
                    page3 = (LinearLayout) LayoutInflater.from(MainActivity.this).inflate(R.layout.fragment_harley,null);
                    page = page3;
                    break;
            }
            ((ViewPager) container).addView(page,0);
            return page;
        }

        @Override
        public boolean isViewFromObject(View view, Object o) {
            return view==o;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager) container).removeView((View) object);
        }
    }*/




}
