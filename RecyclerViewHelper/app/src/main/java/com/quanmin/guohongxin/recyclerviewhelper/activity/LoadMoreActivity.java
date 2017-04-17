package com.quanmin.guohongxin.recyclerviewhelper.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.quanmin.guohongxin.recyclerviewhelper.R;
import com.quanmin.guohongxin.recyclerviewhelper.adapter.LoadmoreAdapter;
import com.quanmin.guohongxin.recyclerviewhelper.bean.ItemModel;

import java.util.ArrayList;

/**
 * Created by guo_hx on 2017/4/17 17:04.
 */
public class LoadMoreActivity extends AppCompatActivity {

    private static final String TAG = LoadMoreActivity.class.getSimpleName();

    private int pic_res[] = {R.mipmap.pic_anim_item_1, R.mipmap.pic_anim_item_2};
    private int des_res[] = {R.string.item_anim_1, R.string.item_anim_2};

    private RecyclerView mRvLoadmore;
    private ArrayList<ItemModel> mData;
    private LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadmore);

        initData();
        initView();
        initListener();
    }

    private void initData() {
        mData = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            ItemModel itemModel = new ItemModel();
            itemModel.pic_res = pic_res[i % 2];
            itemModel.des_res = i + "";
            mData.add(itemModel);
        }
    }

    private void initView() {
        mRvLoadmore = (RecyclerView) findViewById(R.id.rv_loadmore);
        mLayoutManager = new LinearLayoutManager(this);
        mRvLoadmore.setLayoutManager(mLayoutManager);
        mRvLoadmore.setAdapter(new LoadmoreAdapter(mData));
    }

    private void initListener() {
        mRvLoadmore.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_IDLE
                        && mLayoutManager.getItemCount() < mLayoutManager.findLastVisibleItemPosition() + 2) {
                    Log.i(TAG, "onScrollStateChanged__newState == " + newState);
                    //TODO......Loadmore
                    Toast.makeText(LoadMoreActivity.this, "Loadmore", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
