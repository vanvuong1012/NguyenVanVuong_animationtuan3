package com.example.animation_shareelement_recyclerview_androidlab2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;

public class SingerAdapter extends RecyclerView.Adapter<SingerAdapter.SingerViewHolder>{

    private LinkedList<Singer> singers;
    private LayoutInflater mInflater;
    private Context context;
    private Activity activity;
    @NonNull
    @Override
    public SingerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_music_lits,parent,false);
        SingerViewHolder svh=new SingerViewHolder(view);
        return svh;
    }

//    public SingerAdapter(ArrayList<Singer> mSingerList, Context context) {
//        mInflater = LayoutInflater.from(context);
//        this.mSingerList = mSingerList;
//        this.context = context;
//    }
public SingerAdapter(LinkedList<Singer> singers, Context context, Activity activity) {
    this.singers = singers;
    this.context = context;
    this.activity = activity;
    mInflater = LayoutInflater.from(context);
}

    @Override
    public void onBindViewHolder(@NonNull SingerViewHolder holder, int position) {
        Singer singer=singers.get(position);
        holder.txtSinger.setText(singer.getTxtSinger());
        holder.txtName.setText(singer.getTxtName());
        holder.imgHinh.setImageResource(singer.getImgHinh());
    }

    @Override
    public int getItemCount() {
        return singers.size();
    }

    public class SingerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtName;
        public TextView txtSinger;
        public ImageView imgHinh;

        public SingerViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtSinger = itemView.findViewById(R.id.txtSinger);
            imgHinh = itemView.findViewById(R.id.imgHinh);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int mPosition = getLayoutPosition();
            Singer s = singers.get(mPosition);
            Intent i = new Intent(context, PlayMusic.class);
            i.putExtra("txtName", s.getTxtName());
            i.putExtra("txtSinger", s.getTxtSinger());
            i.putExtra("imgHinh", s.getImgHinh());
            context.startActivity(i);
        }
    }}
