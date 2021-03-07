package com.example.weap.game1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Handler;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
    SharedPreferences sharedpreferences;
    public static final String jsonpref = "jsondata";

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
        sharedpreferences = getSharedPreferences(jsonpref, Context.MODE_PRIVATE);

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
        runThread();
        progressBar.setMax(100);
        moxygen = (float) 0.1;
Sharedpref(sharedpreferences);



oxygen.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {


        progressBar.setProgress((int) moxygen);
        ProgressBarAnimation mProgressAnimation = new ProgressBarAnimation(progressBar, 1000);


        /* Update progress later anywhere in code: */
        mProgressAnimation.setProgress((int)moxygen);
        oxygen.setText(String.valueOf(moxygen));
    }
});


    }


    @Override
    public void run() {


    }
    private void runThread() {
        final ProgressBarAnimation mProgressAnimation = new ProgressBarAnimation(progressBar, 1000);

        new Thread() {
            public void run() {
                while (true) {
                    try {


                        runOnUiThread(new Runnable() {

                            @Override
                            public void run() {
                                moxygen += (float) 0.0824454;
                                oxygen.setText(String.valueOf(moxygen)+"Kg");
                                progressBar.setProgress((int) moxygen);

                                mProgressAnimation.setProgress((int)moxygen);


                            }
                        });
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    private void Sharedpref(SharedPreferences shrPref) {

        SharedPreferences.Editor editor = shrPref.edit();
        if (shrPref.getString(jsonpref,"").isEmpty()){
            Log.d("jsonPrefisempty", "true");
            editor.putString("jsondata", "{\n" +
                    "  \"level\": 0,\n" +
                    "  \"oxygen\": 0,\n" +
                    "  \"gems\": 0,\n" +
                    "  \"oxygen-carpani\": 0,\n" +
                    "  \"agac-1\": {\n" +
                    "    \"agac-name\": \"Pine\",\n" +
                    "    \"agac-sayisi\": 1,\n" +
                    "    \"agac-carpani\": \"0.00000375915\"\n" +
                    "  },\n" +
                    "  \"agac-2\": {\n" +
                    "    \"agac-name\": \"Maple tree\",\n" +
                    "    \"agac-sayisi\": 1,\n" +
                    "    \"agac-carpani\": \"0.00000468939\"\n" +
                    "  },\n" +
                    "  \"agac-3\": {\n" +
                    "    \"agac-name\": \"Birch tree\",\n" +
                    "    \"agac-sayisi\": 1,\n" +
                    "    \"agac-carpani\": \"0.00000608474\"\n" +
                    "  },\n" +
                    "  \"agac-4\": {\n" +
                    "    \"agac-name\": \"Oak\",\n" +
                    "    \"agac-sayisi\": 1,\n" +
                    "    \"agac-carpani\": \"0.00000724753\"\n" +
                    "  },\n" +
                    "  \"agac-5\": {\n" +
                    "    \"agac-name\": \"Beech\",\n" +
                    "    \"agac-sayisi\": 1,\n" +
                    "    \"agac-carpani\": \"0.00000817776\"\n" +
                    "  },\n" +
                    "  \"agac-6\": {\n" +
                    "    \"agac-name\": \"Chestnut tree\",\n" +
                    "    \"agac-sayisi\": 1,\n" +
                    "    \"agac-carpani\": \"0.00000957311\"\n" +
                    "  },\n" +
                    "  \"agac-7\": {\n" +
                    "    \"agac-name\": \"Plane tree\",\n" +
                    "    \"agac-sayisi\": 1,\n" +
                    "    \"agac-carpani\": \"0.0000107359\"\n" +
                    "  }\n" +
                    "}");
            editor.commit();
            JsonStuff jsonStuff = new JsonStuff();
            jsonStuff.DeployJson(shrPref.getString(jsonpref,""));

        }
        else {
            JsonStuff jsonStuff = new JsonStuff();
            jsonStuff.DeployJson(shrPref.getString(jsonpref,""));


        }


    }
}
