package com.example.lenovo.mytob;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends Activity {

    @BindView(R.id.im1)
    RadioButton im1;
    @BindView(R.id.im2)
    RadioButton im2;
    @BindView(R.id.im3)
    RadioButton im3;
    @BindView(R.id.container)
    RelativeLayout container;
    @BindView(R.id.vPager)
    ViewPager vPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);



    }

    @OnClick({R.id.im1, R.id.im2, R.id.im3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.im1:

                break;
            case R.id.im2:

                break;
            case R.id.im3:

                break;
        }
    }
}
