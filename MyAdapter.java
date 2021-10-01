package com.example.foodapp;

import android.view.View;
import android.view.ViewGroup;

import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class MyAdapter extends SliderViewAdapter<MyAdapter.MyViewHolder> {

    List<Integer> imageList;

    MyAdapter(List<Integer> list)
    {
        this.imageList=list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int position) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    class MyViewHolder extends SliderViewAdapter
    {

        public MyViewHolder(View itemView){
            super(itemView);
        }
    }
}
