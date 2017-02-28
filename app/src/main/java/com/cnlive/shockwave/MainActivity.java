package com.cnlive.shockwave;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cnlive.shockwave.fragment.HomePageFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.layout_fragment, HomePageFragment.newInstance())
                .commit();
    }
}
