package com.jdkgroup.autoplayvideo.activity;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import com.jdkgroup.autoplayvideo.R;
import com.jdkgroup.autoplayvideo.adapter.AdapterVideo;
import com.jdkgroup.autoplayvideo.lib.autoplayvideos.AAH_CustomRecyclerView;
import com.jdkgroup.autoplayvideo.model.ModelVideo;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

public class ActivityAutoPlayVideo extends AppCompatActivity {

    private  AAH_CustomRecyclerView rvAutoPlayVideo;

    private final List<ModelVideo> modelList = new ArrayList<>();

    private Picasso picasso;

    private AdapterVideo adapterVideo;
    private LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAutoPlayVideo = (AAH_CustomRecyclerView) findViewById(R.id.rvAutoPlayVideo);

        picasso = Picasso.with(this);
        //modelList.add(new ModelVideo("http://www.betcoingaming.com/webdesigns/animatedslider/images/liveroulette2.mp4","http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70,so_0/v1481795681/2_rp0zyy.jpg","name1"));
        modelList.add(new ModelVideo("https://firebasestorage.googleapis.com/v0/b/flickering-heat-5334.appspot.com/o/demo1.mp4?alt=media&token=f6d82bb0-f61f-45bc-ab13-16970c7432c4", "http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70,so_0/v1481795681/2_rp0zyy.jpg", "video1"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70/v1491561340/hello_cuwgcb.mp4", "http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70,so_0/v1491561340/hello_cuwgcb.jpg", "video2"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/image/upload/q_70/v1481795690/3_lfndfq.jpg", "image3"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70/v1481795675/3_yqeudi.mp4", "http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70,so_0/v1481795675/3_yqeudi.jpg", "video4"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70/v1481795675/1_pyn1fm.mp4", "http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70,so_0/v1481795675/1_pyn1fm.jpg", "video5"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70/v1491561340/hello_cuwgcb.mp4", "http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70,so_0/v1491561340/hello_cuwgcb.jpg", "video6"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/image/upload/q_70/v1481795690/2_qwpgis.jpg", "image7"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/image/upload/q_70/v1481795690/1_ybonak.jpg", "image8"));
        modelList.add(new ModelVideo("https://firebasestorage.googleapis.com/v0/b/flickering-heat-5334.appspot.com/o/demo1.mp4?alt=media&token=f6d82bb0-f61f-45bc-ab13-16970c7432c4", "http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70,so_0/v1481795681/2_rp0zyy.jpg", "video9"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/image/upload/q_70/v1481795690/3_lfndfq.jpg", "name10"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70/v1481795676/4_nvnzry.mp4", "http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70,so_0/v1481795676/4_nvnzry.jpg", "video11"));
        modelList.add(new ModelVideo("https://firebasestorage.googleapis.com/v0/b/flickering-heat-5334.appspot.com/o/demo1.mp4?alt=media&token=f6d82bb0-f61f-45bc-ab13-16970c7432c4", "http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70,so_0/v1481795681/2_rp0zyy.jpg", "video12"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/image/upload/q_70/v1481795690/3_lfndfq.jpg", "image13"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/image/upload/q_70/v1481795690/2_qwpgis.jpg", "image14"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70/v1481795675/3_yqeudi.mp4", "http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70,so_0/v1481795675/3_yqeudi.jpg", "video16"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/image/upload/q_70/v1481795690/1_ybonak.jpg", "image15"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70/v1481795675/1_pyn1fm.mp4", "http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70,so_0/v1481795675/1_pyn1fm.jpg", "video17"));
        modelList.add(new ModelVideo("https://firebasestorage.googleapis.com/v0/b/flickering-heat-5334.appspot.com/o/demo1.mp4?alt=media&token=f6d82bb0-f61f-45bc-ab13-16970c7432c4", "http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70,so_0/v1481795681/2_rp0zyy.jpg", "video18"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/image/upload/q_70/v1481795690/2_qwpgis.jpg", "image19"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/image/upload/q_70/v1481795690/3_lfndfq.jpg", "image20"));
        modelList.add(new ModelVideo("http://res.cloudinary.com/krupen/image/upload/q_70/v1481795690/1_ybonak.jpg", "image21"));

        //you can pass local file uri, but make sure it exists
        //modelList.add(new ModelVideo("/storage/emulated/0/VideoPlay/myvideo.mp4","http://res.cloudinary.com/krupen/video/upload/w_300,h_150,c_crop,q_70,so_0/v1481795681/2_rp0zyy.jpg","video18"));

        adapterVideo = new AdapterVideo(modelList, picasso);
        mLayoutManager = new LinearLayoutManager(this);

        rvAutoPlayVideo.setLayoutManager(mLayoutManager);
        rvAutoPlayVideo.setItemAnimator(new DefaultItemAnimator());

        //todo before setAdapter
        rvAutoPlayVideo.setActivity(this);

        //optional - to play only first visible video
        rvAutoPlayVideo.setPlayOnlyFirstVideo(true); // false by default

        //optional - by default we check if url ends with ".mp4". If your urls do not end with mp4, you can set this param to false and implement your own check to see if video points to url
        rvAutoPlayVideo.setCheckForMp4(false);

        //optional - download videos to local storage (requires "android.permission.WRITE_EXTERNAL_STORAGE" in manifest or ask in runtime)
        rvAutoPlayVideo.setDownloadPath(Environment.getExternalStorageDirectory() + "/MyVideo"); // (Environment.getExternalStorageDirectory() + "/Video") by default

        rvAutoPlayVideo.setDownloadVideos(true); // false by default

        //extra - start downloading all videos in background before loading RecyclerView
        List<String> urls = new ArrayList<>();
        for (ModelVideo object : modelList) {
            if (object.getVideo_url() != null && object.getVideo_url().contains("http"))
                urls.add(object.getVideo_url());
        }
        rvAutoPlayVideo.preDownload(urls);

        rvAutoPlayVideo.setAdapter(adapterVideo);
        //to init videos before scrolling
        rvAutoPlayVideo.smoothScrollBy(0, 1);
        rvAutoPlayVideo.smoothScrollBy(0, -1);
    }
}
