package com.shrish.onboardingscreenapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class imagesAdapter extends RecyclerView.Adapter<imagesAdapter.imageViewholder> {
        Context context;
        ArrayList<onlineImages>imagesArrayList;

    public imagesAdapter(Context context, ArrayList<onlineImages> imagesArrayList) {
        this.context = context;
        this.imagesArrayList = imagesArrayList;
    }

    @NonNull
        @Override
        public imagesAdapter.imageViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(context).inflate(R.layout.image_layout,parent,false);
            return new imageViewholder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull imagesAdapter.imageViewholder holder, int position) {
            onlineImages onlineImag=imagesArrayList.get(position);
            holder.imagetitle.setText(onlineImag.getTitle());

            String imageurl;
            imageurl = onlineImag.getImage();
            Picasso.get().load(imageurl).into(holder.onlineimage);
        }

        @Override
        public int getItemCount() {
            return imagesArrayList.size();
        }

        public class imageViewholder extends RecyclerView.ViewHolder {

            ImageView onlineimage;
            TextView imagetitle;


            public imageViewholder(@NonNull View itemView) {
                super(itemView);
                onlineimage = itemView.findViewById(R.id.onlineimage);
                imagetitle = itemView.findViewById(R.id.imagetitle);

            }
        }
    }
