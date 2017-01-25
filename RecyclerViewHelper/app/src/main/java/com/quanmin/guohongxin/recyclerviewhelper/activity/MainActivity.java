package com.quanmin.guohongxin.recyclerviewhelper.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.quanmin.guohongxin.recyclerviewhelper.R;
import com.quanmin.guohongxin.recyclerviewhelper.adapter.HomeRecyclerViewAdapter;
import com.quanmin.guohongxin.recyclerviewhelper.bean.HomeItemModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String TAG = getClass().getSimpleName();

    private RecyclerView mRvMain;

    private int des_res[] = {R.string.item_main_1, R.string.item_main_2, R.string.item_main_3, R.string.item_main_4, R.string.item_main_5, R.string.item_main_6, R.string.item_main_7};
    private int pic_res[] = {R.mipmap.item_main, R.mipmap.item_main, R.mipmap.item_main, R.mipmap.item_main, R.mipmap.item_main, R.mipmap.item_main, R.mipmap.item_main};
    private Class<?> class_res[] = {AnimationActivity.class, MainActivity.class, MainActivity.class, MainActivity.class, MainActivity.class, MainActivity.class, MainActivity.class};
    private ArrayList<HomeItemModel> mData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
    }

    private void initData() {

        mData = new ArrayList<>();
        for (int i = 0; i < des_res.length; i++) {
            HomeItemModel homeItemModel = new HomeItemModel();
            homeItemModel.des_res = des_res[i];
            homeItemModel.pic_res = pic_res[i];
            homeItemModel.aClass = class_res[i];
            mData.add(homeItemModel);
        }
    }

    private void initView() {

        mRvMain = (RecyclerView) findViewById(R.id.rv_main);
        mRvMain.setLayoutManager(new GridLayoutManager(this, 2));
        mRvMain.setAdapter(new HomeRecyclerViewAdapter(mData));
    }


}
