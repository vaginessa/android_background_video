package com.aapbd.videoviewer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.SurfaceView;

/**
 * Created by Mehdi on 2/29/16.
 */
public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp = null;
    SurfaceView mSurfaceView=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}