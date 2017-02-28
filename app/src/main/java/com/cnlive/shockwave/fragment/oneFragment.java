package com.cnlive.shockwave.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cnlive.shockwave.R;

/**
 * @author 陈硕
 * @time 2017/2/24  19:02
 * @desc ${TODD}
 */
public class oneFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_attention,container,false);
    }
}
