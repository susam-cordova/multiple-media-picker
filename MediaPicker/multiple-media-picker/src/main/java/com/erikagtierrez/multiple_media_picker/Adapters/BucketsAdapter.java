package com.erikagtierrez.multiple_media_picker.Adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.erikagtierrez.multiple_media_picker.R;
import com.bumptech.glide.Glide;

import java.util.List;

public class BucketsAdapter extends RecyclerView.Adapter<BucketsAdapter.MyViewHolder>{
    private List<String> bucketNames,bitmapList;
    private Context context;
//    private int width = 130;
//    private int height = 130;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            thumbnail=(ImageView) view.findViewById(R.id.image);
        }
    }

    public BucketsAdapter(List<String> bucketNames,List<String> bitmapList,Context context) {
        this.bucketNames=bucketNames;
        this.bitmapList = bitmapList;
        this.context=context;
    }

//    public BucketsAdapter(List<String> bucketNames,List<String> bitmapList,Context context, int width, int height) {
//        this.bucketNames=bucketNames;
//        this.bitmapList = bitmapList;
//        this.context=context;
//        this.width = width;
//        this.height = height;
//    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_item, parent, false);
//        itemView.setLayoutParams(new ViewGroup.LayoutParams(this.width, this.height));

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        bucketNames.get(position);
        holder.title.setText(bucketNames.get(position));
        //Glide.with(context).load("file://"+bitmapList.get(position)).override(this.width,this.height).centerCrop().into(holder.thumbnail);
        Glide.with(context).load("file://"+bitmapList.get(position)).override(300, 300).centerCrop().into(holder.thumbnail);
    }

    @Override
    public int getItemCount() {
        return bucketNames.size();
    }
}

