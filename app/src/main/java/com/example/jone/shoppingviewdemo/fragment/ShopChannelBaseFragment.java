package com.example.jone.shoppingviewdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jone.shoppingviewdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class ShopChannelBaseFragment extends ShopBaseFragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    @BindView(R.id.rv_channel)
    RecyclerView rvChannel;
    @BindView(R.id.sr_channel)
    SwipeRefreshLayout srChannel;
    Unbinder unbinder;

    private String mParam1;
    private String mParam2;


    public ShopChannelBaseFragment() {
    }

    public static ShopChannelBaseFragment newInstance(String param1, String param2) {
        ShopChannelBaseFragment fragment = new ShopChannelBaseFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View initView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shop_channel_base, container, false);
        unbinder = ButterKnife.bind(this, view);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        return view;
    }

    @Override
    public View initData() {
        return null;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
