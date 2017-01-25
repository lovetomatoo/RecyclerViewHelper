package com.quanmin.guohongxin.recyclerviewhelper.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.quanmin.guohongxin.recyclerviewhelper.R;
import com.quanmin.guohongxin.recyclerviewhelper.adapter.AnimationAdapter;
import com.quanmin.guohongxin.recyclerviewhelper.bean.AnimItemModel;

import java.util.ArrayList;

/**
 * Created by guo_hx on 2017/1/24.
 */
public class AnimationActivity extends AppCompatActivity {

    private String TAG = getClass().getSimpleName();

    private int pic_res[] = {R.mipmap.pic_anim_item_1, R.mipmap.pic_anim_item_2};
    private int des_res[] = {R.string.item_anim_1, R.string.item_anim_2};

    private RecyclerView mRvAnim;
    private ArrayList<AnimItemModel> mData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        initData();
        initView();
    }

    private void initData() {

        mData = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            AnimItemModel animItemModel = new AnimItemModel();
            animItemModel.pic_res = pic_res[i % 2];
            animItemModel.des_res = des_res[i % 2];
            mData.add(animItemModel);
        }
    }

    private void initView() {

        mRvAnim = (RecyclerView) findViewById(R.id.rv_anim);

        mRvAnim.setHasFixedSize(true);
        mRvAnim.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        AnimationAdapter animationAdapter = new AnimationAdapter(mData);
        mRvAnim.setAdapter(animationAdapter);
    }

}
