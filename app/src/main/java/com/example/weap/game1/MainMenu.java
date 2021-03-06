package com.example.weap.game1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Handler;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.support.v4.app.Fragment;
public class MainMenu extends AppCompatActivity  implements Runnable {
TextView oxygen,settings;
float moxygen = 0;
    private Handler handler = new Handler();
   FrameLayout frameLayout;

boolean test = false;
    private ProgressBar progressBar;
    private int progressStatus = 0;
    private boolean suspended = false;//Durdur butonuna basıldığında bu değeri true yapacağız.
    private boolean stopped = false;//Sıfı
    Button bulut;
    private int ekranY = 0;
    private int ekranX = 0;
    @SuppressLint({"ResourceAsColor", "WrongConstant"})
    @Override
    @SuppressWarnings("deprecation")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        frameLayout = findViewById(R.id.frame);
        FragmentTransaction fm = getSupportFragmentManager().beginTransaction();
        fm.add(R.id.frame,new com.example.weap.game1.HomeFragment());
        fm.commit();
        oxygen = (TextView)findViewById(R.id.textView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        settings = (TextView)findViewById(R.id.textView4);
        View v = LayoutInflater.from(getApplicationContext()).inflate(R.layout.slayout, null, false);
        Display display = getWindowManager(). getDefaultDisplay();
        ekranY = display.getHeight();
        ekranX = display.getWidth();
        final PopupWindow pw = new PopupWindow(v,ekranX,ekranY, true);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pw.showAtLocation(findViewById(R.id.frame), Gravity.CENTER, 0, 0);
            }
        });
        final ImageView Imagesettings =v.findViewById(R.id.imageView4);
        Imagesettings.setImageResource(R.drawable.ic_close_black_24dp);
        Imagesettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pw.dismiss();
            }
        });

        MainMenu m1=new MainMenu();
        Thread t1 =new Thread(m1);
        t1.start();
        runThread();
        progressBar.setMax(100);
        moxygen = (float) 0.1;
oxygen.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


       // progressBar.setProgress(moxygen);
        ProgressBarAnimation mProgressAnimation = new ProgressBarAnimation(progressBar, 1000);


        /* Update progress later anywhere in code: */
        //mProgressAnimation.setProgress(moxygen);
        oxygen.setText(String.valueOf(moxygen));
    }
});


    }


    @Override
    public void run() {


    }
    private void runThread() {

        new Thread() {
            public void run() {
                while (true) {
                    try {

                        moxygen = (float) (moxygen * 1.01);
                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                oxygen.setText(String.valueOf(moxygen)+"Kg");

                            }
                        });
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
