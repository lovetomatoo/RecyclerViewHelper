package com.quanmin.guohongxin.recyclerviewhelper.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.quanmin.guohongxin.recyclerviewhelper.R;
import com.quanmin.guohongxin.recyclerviewhelper.bean.AnimItemModel;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/1/25.
 */

public class AnimationAdapter extends RecyclerView.Adapter<AnimationAdapter.Holder> {

    private ArrayList<AnimItemModel> mList;

    public AnimationAdapter(ArrayList<AnimItemModel> list) {
        mList = list;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_anim, null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    static class Holder extends RecyclerView.ViewHolder {

        public Holder(View itemView) {
            super(itemView);
        }
    }
}
