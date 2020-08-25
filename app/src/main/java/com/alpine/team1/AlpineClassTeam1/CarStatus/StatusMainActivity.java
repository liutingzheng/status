package com.alpine.team1.AlpineClassTeam1.CarStatus;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.alpine.team1.AlpineClassTeam1.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class StatusMainActivity extends AppCompatActivity {

    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private Fragment[] fragments;
    private int lastfragment;//用于记录上一个选择的fragment
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_status_main);
        initFragment();
    }

    //初始化fragment和fragment数组
    private void initFragment() {
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragments = new Fragment[]{fragment1,fragment2,fragment3};
        lastfragment = 0;
        getSupportFragmentManager().beginTransaction().replace(R.id.mainview,fragment1).show(fragment1).commit();
        bottomNavigationView = findViewById(R.id.bnv);

        bottomNavigationView.setOnNavigationItemSelectedListener(changeFragment);
    }

    //判断选择菜单
    private BottomNavigationView.OnNavigationItemSelectedListener changeFragment = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()){
                case R.id.id1:{
                    if (lastfragment!=0){
                        switchFragment(lastfragment,0);
                        lastfragment = 0;
                    }
                    return true;
                }
                case R.id.id2:{
                    if (lastfragment!=1){
                        switchFragment(lastfragment,1);
                        lastfragment = 1;
                    }
                    return true;
                }
                case R.id.id3:{
                    if (lastfragment!=2){
                        switchFragment(lastfragment,2);
                        lastfragment = 2;
                    }
                    return true;
                }
            }
            return false;
        }
    };

    //切换fragment
    private void switchFragment(int lastfragment,int index){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.hide(fragments[lastfragment]);
        if (fragments[index].isAdded()==false){
            fragmentTransaction.add(R.id.mainview,fragments[index]);
        }
        fragmentTransaction.show(fragments[index]).commitAllowingStateLoss();
    }
}
