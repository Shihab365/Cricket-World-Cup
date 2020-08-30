package com.pro1.asus.cric_pro_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class ScoreActivity extends AppCompatActivity implements View.OnClickListener{

    CardView t_match,l_score,p_table;
    InterstitialAd interstitialAd_1,interstitialAd_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        t_match=findViewById(R.id.todays_match_id);
        l_score=findViewById(R.id.live_scores_id);
        p_table=findViewById(R.id.point_tables_id);

        t_match.setOnClickListener(this);
        l_score.setOnClickListener(this);
        p_table.setOnClickListener(this);

        interstitialAd_1=new InterstitialAd(this);
        interstitialAd_1.setAdUnitId("ca-app-pub-1818607113375588/7614753334");
        interstitialAd_1.loadAd(new AdRequest.Builder().build());
        interstitialAd_1.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(ScoreActivity.this,LscoreActivity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_2=new InterstitialAd(this);
        interstitialAd_2.setAdUnitId("ca-app-pub-1818607113375588/3483936630");
        interstitialAd_2.loadAd(new AdRequest.Builder().build());
        interstitialAd_2.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(ScoreActivity.this,PTableActivity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.todays_match_id)
        {
            Intent intent=new Intent(ScoreActivity.this,TMatchActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.live_scores_id)
        {
            if(interstitialAd_1.isLoaded())
            {
                interstitialAd_1.show();
            }
            else
            {
                Intent intent=new Intent(ScoreActivity.this,LscoreActivity.class);
                startActivity(intent);
                interstitialAd_1.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.point_tables_id)
        {
            if(interstitialAd_2.isLoaded())
            {
                interstitialAd_2.show();
            }
            else
            {
                Intent intent=new Intent(ScoreActivity.this,PTableActivity.class);
                startActivity(intent);
                interstitialAd_2.loadAd(new AdRequest.Builder().build());
            }
        }
    }
}
