package com.quanmin.guohongxin.recyclerviewhelper.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.quanmin.guohongxin.recyclerviewhelper.R;
import com.quanmin.guohongxin.recyclerviewhelper.bean.ItemModel;

import java.util.ArrayList;

/**
 * Created by guo_hx on 2017/1/25.
 */

public class AnimationAdapter extends RecyclerView.Adapter<AnimationAdapter.Holder> {

    private String TAG = getClass().getSimpleName();

    private ArrayList<ItemModel> mList;

    public AnimationAdapter(ArrayList<ItemModel> list) {

        mList = list;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_anim, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, final int position) {

        holder.mIvItemRvAnim.setImageResource(mList.get(position).pic_res);
        holder.mTvItemRvAnim.setText(mList.get(position).des_res);

        holder.mIvItemRvAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItem(position);
            }
        });

        holder.mTvItemRvAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeItem(position);
            }
        });
    }

    @Override
    public int getItemCount() {

        return mList == null ? 0 : mList.size();
    }

    static class Holder extends RecyclerView.ViewHolder {

        private final ImageView mIvItemRvAnim;
        private final TextView mTvItemRvAnim;

        Holder(View itemView) {

            super(itemView);
            mIvItemRvAnim = (ImageView) itemView.findViewById(R.id.iv_item_rv_anim);
            mTvItemRvAnim = (TextView) itemView.findViewById(R.id.tv_item_rv_anim);
        }
    }

    public void addItem(int position) {
        mList.add(position, mList.get(0));
        notifyItemInserted(position);
    }

    public void removeItem(int position) {
        mList.remove(position);
        notifyItemRemoved(position);
    }

}
