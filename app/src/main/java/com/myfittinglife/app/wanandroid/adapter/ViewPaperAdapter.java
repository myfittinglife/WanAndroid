package com.myfittinglife.app.wanandroid.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.myfittinglife.app.wanandroid.fragments.thirdfragment.tabfragments.ProjectListFragment;

import java.util.ArrayList;
import java.util.List;

/**
*  @Author      LD
*  @Time        2018/12/13
*  @Describe    Viewpager填放fragment的适配器
*  @Modify
*/
public class ViewPaperAdapter extends FragmentStatePagerAdapter {

    private List<ProjectListFragment> fragmentList =new ArrayList<>();
    private List<String>mTitles=new ArrayList<>();

    private FragmentManager fragmetnmanager;  //创建FragmentManager，没用到

    public ViewPaperAdapter(FragmentManager fm, List<ProjectListFragment>list , List<String> titleList) {
        super(fm);

        this.fragmetnmanager = fm;
        this.fragmentList = list;
        this.mTitles = titleList;

    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {        //用来设置TabLayout标题的
        return mTitles.get(position);
    }
}
