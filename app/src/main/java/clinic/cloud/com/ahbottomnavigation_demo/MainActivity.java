package clinic.cloud.com.ahbottomnavigation_demo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AHBottomNavigation bottom_navigation;
    ViewPager fragment_viewpager;
    private ArrayList<AHBottomNavigationItem> bottomNavigationItems = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom_navigation= (AHBottomNavigation) findViewById(R.id.bottom_navigation);
        fragment_viewpager= (ViewPager) findViewById(R.id.fragment_viewpager);
        init();
    }
    public void init()
    {
        initButtonbar();
        initViewpager();
    }

    //初始化底部导航
    public void initButtonbar()
    {

        AHBottomNavigationItem item1 = new AHBottomNavigationItem("接诊", R.drawable.doctor_work_no, R.drawable.doctor_work);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem("服务订单", R.drawable.doctor_orderlist_no,  R.drawable.doctor_orderlist);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem("我的", R.drawable.doctor_user_no,  R.drawable.doctor_user);


        bottomNavigationItems.add(item1);
        bottomNavigationItems.add(item2);
        bottomNavigationItems.add(item3);

        bottom_navigation.addItems(bottomNavigationItems);
        //初始化 文字/图标 颜色
        bottom_navigation.setAccentColor(getResources().getColor(R.color.doctors_main));
        //未 选中颜色
        bottom_navigation.setInactiveColor(getResources().getColor(R.color.text2));

// Set background color

        // bottom_navigation.setDefaultBackgroundColor(Color.parseColor("#ffffff"));

//禁用CoordinatorLayout内的
        //     bottom_navigation.setBehaviorTranslationEnabled(false);

//改变颜色
        //    bottom_navigation.setAccentColor(Color.parseColor("#F63D2B"));
        //   bottom_navigation.setInactiveColor(Color.parseColor("#747474"));

// 使用彩色导航循环显示效果
        //  bottom_navigation.setColored(true);

//设置当前项
        bottom_navigation.setCurrentItem(0);

        //  bottom_navigation.setNotification(16,0);
// Set listener
        bottom_navigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position, boolean wasSelected) {
                // Do something cool here...
                System.gc();
                if(fragment_viewpager!=null)
                {
                    fragment_viewpager.setCurrentItem(position);
                }
                else
                {
                    Log.e("gwl","viewpager====null");
                }
                if(position==0)
                {

                }
                else if(position==1)
                {

                }
                else if(position==2)
                {

                }
            }
        });
    }
    //初始化viewpager
    public void initViewpager()
    {
        fragment_viewpager.setAdapter(fragment_adapter);
        fragment_viewpager.setCurrentItem(0);
        fragment_viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override
            public void onPageSelected(int position) {
                bottom_navigation.setCurrentItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    private FragmentPagerAdapter fragment_adapter=new FragmentPagerAdapter(getSupportFragmentManager()) {
        @Override
        public int getCount() {
            return bottom_navigation.getItemsCount();
        }

        @Override
        public Fragment getItem(int arg0) {
            return new BlankFragment();
        }
    };
}
