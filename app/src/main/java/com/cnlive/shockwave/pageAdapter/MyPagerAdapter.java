package com.cnlive.shockwave.pageAdapter;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.cnlive.shockwave.info.FragmentInfo;

import java.util.ArrayList;

/**
 * @author 陈硕
 * @time 2017/2/24  14:38
 * @desc ${TODD}
 */
public  class MyPagerAdapter extends FragmentStatePagerAdapter {
    private ArrayList<FragmentInfo> fragmentInfos;
    Context context;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

   public MyPagerAdapter(Context context, FragmentManager fm, ArrayList<FragmentInfo> fragmentInfos, TabLayout mTabLayout, ViewPager mViewPager) {
        super(fm);
        this.fragmentInfos = fragmentInfos;
        this.context = context;
        this.mTabLayout=mTabLayout;
        this.mViewPager=mViewPager;
        mViewPager.setAdapter(this);
        mTabLayout.setupWithViewPager(mViewPager);//将TabLayout和ViewPager关联起来。
        mTabLayout.setTabsFromPagerAdapter(this);//给Tabs设置适配器
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

    /**
     * 添加选项
     *
     * */
    @Override
    public Fragment getItem(int position) {
        FragmentInfo fragmentInfo = fragmentInfos.get(position);
        return Fragment.instantiate(context, fragmentInfo.getaClass().getName());

    }

    @Override
    public int getCount() {
        return fragmentInfos.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentInfos.get(position).getTitle();

    }

    /**
     * 添加选项、删除某一项数据
     *
     * */
   public void CNNotifyDataSetChanged(){
       notifyDataSetChanged();
       mTabLayout.setupWithViewPager(mViewPager);
    }


}
