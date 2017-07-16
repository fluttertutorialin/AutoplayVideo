package com.jdkgroup.autoplayvideo.adapter;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jdkgroup.autoplayvideo.R;
import com.jdkgroup.autoplayvideo.lib.autoplayvideos.AAH_CustomViewHolder;
import com.jdkgroup.autoplayvideo.lib.autoplayvideos.AAH_VideosAdapter;
import com.jdkgroup.autoplayvideo.model.ModelVideo;
import com.squareup.picasso.Picasso;
import java.util.List;

public class AdapterVideo extends AAH_VideosAdapter {

    private final List<ModelVideo> list;
    private final Picasso picasso;

    public class MyViewHolder extends AAH_CustomViewHolder {

        final TextView tv;
        final ImageView img_vol;

        //to mute/un-mute video (optional)
        boolean isMuted;

        public MyViewHolder(View view) {
            super(view);
            tv = (TextView) view.findViewById(R.id.tv);
            img_vol = view.findViewById(R.id.img_vol);
        }
    }

    public AdapterVideo(List<ModelVideo> list_urls, Picasso p) {
        this.list = list_urls;
        this.picasso = p;
    }

    @Override
    public AAH_CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_card, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final AAH_CustomViewHolder holder, int position) {
        ((MyViewHolder) holder).tv.setText(list.get(position).getName());

        //todo
        holder.setImageUrl(list.get(position).getImage_url());
        holder.setVideoUrl(list.get(position).getVideo_url());
        //load image into imageview
        if (list.get(position).getImage_url() != null && !list.get(position).getImage_url().isEmpty()) {
            picasso.load(holder.getImageUrl()).config(Bitmap.Config.RGB_565).into(holder.getAAH_ImageView());
        }

        //to mute/un-mute video (optional)
        holder.getAah_vi().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((MyViewHolder) holder).isMuted) {
                    holder.unmuteVideo();
                    ((MyViewHolder) holder).img_vol.setImageResource(R.drawable.ic_unmute);
                } else {
                    holder.muteVideo();
                    ((MyViewHolder) holder).img_vol.setImageResource(R.drawable.ic_mute);
                }
                ((MyViewHolder) holder).isMuted = !((MyViewHolder) holder).isMuted;
            }
        });

        if (list.get(position).getVideo_url() == null) {
            ((MyViewHolder) holder).img_vol.setVisibility(View.GONE);
        } else {
            ((MyViewHolder) holder).img_vol.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }
}