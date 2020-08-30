package com.pro1.asus.cric_pro_1;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import com.github.ybq.android.spinkit.style.Wave;

public class SplashActivity extends AppCompatActivity {

    ProgressBar progressBar;
    int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();


        progressBar=(ProgressBar) findViewById(R.id.wavekit_id);
        Wave wave=new Wave();
        progressBar.setIndeterminateDrawable(wave);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
            }
        });
        thread.start();
    }
    public void doWork()
    {
        for(progress=10;progress<=100;progress+=25)
        {
            try{
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            }catch(Exception e)
            {

            }
        }
    }
    public void startApp()
    {
        Intent intent=new Intent(SplashActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
