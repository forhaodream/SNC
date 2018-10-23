package com.land.ch.smartnewcountryside.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.land.ch.smartnewcountryside.R;
import com.land.ch.smartnewcountryside.bean.HomeTypeBean;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

/**
 * Created by CH
 * on 2018/10/17 10:28
 */
public class HomeTypeAdapter extends BaseAdapter {
    private List<HomeTypeBean> mData;
    private Context mContext;
    private int phoneType;

    public HomeTypeAdapter(List<HomeTypeBean> data, Context context, int a) {
        this.mData = data;
        this.mContext = context;
        this.phoneType = a;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
//            if (phoneType == 2) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mine_type, null);


            holder = new ViewHolder();
            holder.titleTv = (TextView) convertView.findViewById(R.id.item_mine_type_text);
            holder.mImageView = (ImageView) convertView.findViewById(R.id.item_mine_type_img);
            holder.mAutoLinearLayout = convertView.findViewById(R.id.type_ll);
            convertView.setTag(holder);
            AutoUtils.autoSize(convertView);
        } else {

            holder = (ViewHolder) convertView.getTag();
        }
        holder.titleTv.setText(mData.get(position).getTitle());

        Glide.with(holder.mImageView.getContext())
                .load(mData.get(position).getImg()).into(holder.mImageView);


        return convertView;
    }


    class ViewHolder {
        TextView titleTv;
        ImageView mImageView;
        AutoLinearLayout mAutoLinearLayout;


    }
}