package com.cnlive.shockwave.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.cnlive.shockwave.R;

/**
 * @author 陈硕
 * @time 2017/2/24  17:24
 * @desc ${TODD}
 */
public class AttentionFragment extends Fragment {

    private View inflate;
    private TextView viewById;
    private Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        inflate = inflater.inflate(R.layout.fragment_attention, container, false);

        return  inflate;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        viewById = (TextView) inflate.findViewById(R.id.textView2);
        button = (Button) inflate.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewById.setText("改变");
            }
        });
    }
}
