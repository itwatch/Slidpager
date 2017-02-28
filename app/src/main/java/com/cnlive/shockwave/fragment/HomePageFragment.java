package com.cnlive.shockwave.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.cnlive.shockwave.info.FragmentInfo;
import com.cnlive.shockwave.pageAdapter.MyPagerAdapter;
import com.cnlive.shockwave.R;

import java.util.ArrayList;

/**
 * @author 陈硕
 * @time 2017/2/24  17:44
 * @desc ${TODD}
 */
public class HomePageFragment extends Fragment {

    private ArrayList<FragmentInfo> fragmentInfos;
    private Button button;
    private MyPagerAdapter mAdapter1;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    public static HomePageFragment newInstance() {
        HomePageFragment fragment = new HomePageFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initDate();


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_home, container, false);
        initView(inflate);

        doCLick();
        mAdapter1 = new MyPagerAdapter(getContext(), getChildFragmentManager(),
                fragmentInfos,
                mTabLayout,
                mViewPager);
        return inflate;
    }

    private void doCLick() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * 删除选项
                 *
                 * */
                fragmentInfos.remove(2);

                /**
                 * 添加选项
                 *
                 * */
                //fragmentInfos.add(new FragmentInfo("xinde新添加的", AttentionFragment.class));
                mAdapter1.CNNotifyDataSetChanged();
            }
        });
    }

    private void initView(View inflate) {
        mViewPager = (ViewPager) inflate.findViewById(R.id.vp_view);
        mTabLayout = (TabLayout) inflate.findViewById(R.id.tabs);
        button = (Button) inflate.findViewById(R.id.insert_btn);
    }

    private void initDate() {
        fragmentInfos = new ArrayList<>();
        fragmentInfos.add(new FragmentInfo("1fsafdfsfasfasdfsa", AttentionFragment.class));
        fragmentInfos.add(new FragmentInfo("2sdfsdfsdf", oneFragment.class));
        fragmentInfos.add(new FragmentInfo("3dsdsf", AttentionFragment.class));
        fragmentInfos.add(new FragmentInfo("4sdfasfasdfsaas", AttentionFragment.class));
    }
}
