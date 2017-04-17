package com.quanmin.guohongxin.recyclerviewhelper.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.quanmin.guohongxin.recyclerviewhelper.R;
import com.quanmin.guohongxin.recyclerviewhelper.bean.ItemModel;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by guo_hx on 2017/4/17 17:07.
 */
public class LoadmoreAdapter extends RecyclerView.Adapter<LoadmoreAdapter.Holder> {

    private static final String TAG = LoadmoreAdapter.class.getSimpleName();
    private List<ItemModel> mDataList;

    public LoadmoreAdapter(List<ItemModel> list) {
        mDataList = list;
    }

    @Override
    public LoadmoreAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_loadmore, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(LoadmoreAdapter.Holder holder, int position) {
        holder.mIvLoadmore.setImageResource(mDataList.get(position).pic_res);
        holder.mTvLoadmore.setText(mDataList.get(position).des_res);
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    static class Holder extends RecyclerView.ViewHolder {

        private ImageView mIvLoadmore;
        private TextView mTvLoadmore;

        public Holder(View itemView) {
            super(itemView);
            mIvLoadmore = (ImageView) itemView.findViewById(R.id.iv_item_rv_loadmore);
            mTvLoadmore = (TextView) itemView.findViewById(R.id.tv_item_rv_loadmore);
        }
    }

}
