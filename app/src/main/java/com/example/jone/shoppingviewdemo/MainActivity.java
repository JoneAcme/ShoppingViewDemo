package com.example.jone.shoppingviewdemo;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.vp_main)
    ViewPager vpMain;
    @BindView(R.id.rb_main)
    RadioButton rbMain;
    @BindView(R.id.rb_shopping)
    RadioButton rbShopping;
    @BindView(R.id.rb_discount)
    RadioButton rbDiscount;
    @BindView(R.id.rb_shop_car)
    RadioButton rbShopCar;
    @BindView(R.id.rb_mine)
    RadioButton rbMine;
    @BindView(R.id.rg_main)
    RadioGroup rgMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
