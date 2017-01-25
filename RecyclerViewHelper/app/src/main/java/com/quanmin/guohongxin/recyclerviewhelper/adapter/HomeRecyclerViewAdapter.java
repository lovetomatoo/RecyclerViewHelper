package com.quanmin.guohongxin.recyclerviewhelper.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.quanmin.guohongxin.recyclerviewhelper.R;
import com.quanmin.guohongxin.recyclerviewhelper.bean.HomeItemModel;

import java.util.ArrayList;

/**
 * Created by guo_hx on 2017/1/24.
 */

public class HomeRecyclerViewAdapter extends RecyclerView.Adapter<HomeRecyclerViewAdapter.Holder>{

    private String TAG = getClass().getSimpleName();

    private ArrayList<HomeItemModel> mList;

    public HomeRecyclerViewAdapter(ArrayList<HomeItemModel> list) {

        mList = list;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_main, null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, final int position) {

        holder.ivItemRvMain.setImageResource(mList.get(position).pic_res);
        holder.tvItemRvMain.setText(mList.get(position).des_res);
        holder.mLLItemRvMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), mList.get(position).aClass));
            }
        });
    }

    @Override
    public int getItemCount() {

        return mList == null ? 0 : mList.size();
    }

    static  class Holder extends RecyclerView.ViewHolder {

        private final ImageView ivItemRvMain;
        private final TextView tvItemRvMain;
        private final LinearLayout mLLItemRvMain;

        public Holder(View itemView) {

            super(itemView);
            ivItemRvMain = (ImageView) itemView.findViewById(R.id.iv_item_rv_main);
            tvItemRvMain = (TextView) itemView.findViewById(R.id.tv_item_rv_main);
            mLLItemRvMain = (LinearLayout) itemView.findViewById(R.id.ll_item_rv_main);
        }

    }

}
