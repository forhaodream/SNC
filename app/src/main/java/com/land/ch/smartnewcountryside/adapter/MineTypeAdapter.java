package com.land.ch.smartnewcountryside.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.land.ch.smartnewcountryside.R;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;
import java.util.Map;

/**
 * Created by CH
 * on 2018/10/22 09:14
 */
public class MineTypeAdapter extends BaseAdapter {

    private Context context;
    private List<Map<String, Object>> list;

    public MineTypeAdapter(Context context, List<Map<String, Object>> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mine_type, null);
            holder = new ViewHolder();
            holder.titleTv = (TextView) convertView.findViewById(R.id.item_mine_type_text);
            holder.mImageView = (ImageView) convertView.findViewById(R.id.item_mine_type_img);
            convertView.setTag(holder);
            AutoUtils.autoSize(convertView);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        try {

            Map<String, Object> map = list.get(position);
            String name = (String) map.get("name");
            int img = (int) map.get("img");

            holder.mImageView.setImageResource(img);
            holder.titleTv.setText(name);

        } catch (Exception e) {
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        return convertView;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    class ViewHolder {
        TextView titleTv;
        ImageView mImageView;


    }
}
