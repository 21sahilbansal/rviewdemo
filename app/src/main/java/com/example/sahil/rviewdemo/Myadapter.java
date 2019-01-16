package com.example.sahil.rviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyadapterViewHolder> {
    Context context;
    User[] users;

    public Myadapter(Context context, User[] users1) {
        this.context = context;
        this.users = users1;
    }

    @NonNull
    @Override
    public MyadapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view =  layoutInflater.inflate(R.layout.single_item,viewGroup,false);

        return new MyadapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyadapterViewHolder myadapterViewHolder, int position) {

         myadapterViewHolder.textView.setText(users[position].getLogin());
         Glide.with(myadapterViewHolder.imageView.getContext()).load(users[position].getAvatarUrl()).into(myadapterViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return users.length;
    }

    class MyadapterViewHolder extends RecyclerView.ViewHolder{
         ImageView imageView;
         TextView textView;
        public MyadapterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = ( ImageView) itemView.findViewById(R.id.imageView1);
            textView = (TextView) itemView.findViewById(R.id.textView1);

                }
    }
}
