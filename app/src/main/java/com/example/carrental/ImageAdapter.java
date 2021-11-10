package com.example.carrental;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public ImageAdapter(Context mContext){
        this.mContext = mContext;
    }
    @Override
    public int getCount() {
        return Cars.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(200,200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }
        else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(Cars[position]);
        return imageView;
    }
    public Integer [] Cars = {R.drawable.car1, R.drawable.car2,R.drawable.car3, R.drawable.car4, R.drawable.car5, R.drawable.car6};

    public int Cars(int position) {
        return position;
    }
}
