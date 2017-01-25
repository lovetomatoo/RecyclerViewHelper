package com.quanmin.guohongxin.recyclerviewhelper.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.quanmin.guohongxin.recyclerviewhelper.R;
import com.quanmin.guohongxin.recyclerviewhelper.bean.AnimItemModel;

import java.util.ArrayList;

/**
 * Created by guo_hx on 2017/1/25.
 */

public class AnimationAdapter extends RecyclerView.Adapter<AnimationAdapter.Holder> {

    private String TAG = getClass().getSimpleName();

    private ArrayList<AnimItemModel> mList;

    public AnimationAdapter(ArrayList<AnimItemModel> list) {

        mList = list;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_anim, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {

        holder.mIvItemRvAnim.setImageResource(mList.get(position).pic_res);
        holder.mTvItemRvAnim.setText(mList.get(position).des_res);
    }

    @Override
    public int getItemCount() {

        return mList == null ? 0 : mList.size();
    }

    static class Holder extends RecyclerView.ViewHolder {

        private final ImageView mIvItemRvAnim;
        private final TextView mTvItemRvAnim;

        public Holder(View itemView) {

            super(itemView);
            mIvItemRvAnim = (ImageView) itemView.findViewById(R.id.iv_item_rv_anim);
            mTvItemRvAnim = (TextView) itemView.findViewById(R.id.tv_item_rv_anim);
        }

    }

}
