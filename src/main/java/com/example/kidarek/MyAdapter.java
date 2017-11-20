package com.example.kidarek;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yacineyakoubi on 4/20/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private ArrayList<Logement> list;
    private int mRowIndex = -1;


    /*ublic MyAdapter(ArrayList<Logement> Data) {
        list = Data;
    }*/


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_post_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        holder.titleTextView.setText(list.get(position).getTitle());
       // holder.coverImageView.setImageResource(Integer.parseInt(list.get(position).getProdBigPic()));
       // holder.coverImageView.setTag(list.get(position).getImageResourceId());
       // holder.likeImageView.setTag(R.drawable.ic_like);

    }
    @Override
    public int getItemCount() {
        return list.size();
    }


    public void setData(ArrayList<Logement> data) {
        if (list != data) {
            list = data;
            notifyDataSetChanged();
        }
    }

    public void setRowIndex(int index) {
        mRowIndex = index;
    }

}