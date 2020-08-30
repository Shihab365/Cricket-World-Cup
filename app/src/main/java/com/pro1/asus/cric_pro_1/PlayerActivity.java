package com.pro1.asus.cric_pro_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class PlayerActivity extends AppCompatActivity implements View.OnClickListener{

    CardView afg_cv,aus_cv,ban_cv,eng_cv,ind_cv,pak_cv,nz_cv,sa_cv,sl_cv,wi_cv;
    InterstitialAd interstitialAd_1,interstitialAd_2,interstitialAd_3,interstitialAd_4,
            interstitialAd_5,interstitialAd_6,interstitialAd_7,interstitialAd_8,interstitialAd_9,interstitialAd_10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        afg_cv=findViewById(R.id.afg_player_id);
        aus_cv=findViewById(R.id.aus_player_id);
        ban_cv=findViewById(R.id.ban_player_id);
        eng_cv=findViewById(R.id.eng_player_id);
        ind_cv=findViewById(R.id.ind_player_id);
        nz_cv=findViewById(R.id.nz_player_id);
        pak_cv=findViewById(R.id.pak_player_id);
        sa_cv=findViewById(R.id.sa_player_id);
        sl_cv=findViewById(R.id.sl_player_id);
        wi_cv=findViewById(R.id.wi_player_id);

        afg_cv.setOnClickListener(this);
        aus_cv.setOnClickListener(this);
        ban_cv.setOnClickListener(this);
        eng_cv.setOnClickListener(this);
        ind_cv.setOnClickListener(this);
        nz_cv.setOnClickListener(this);
        pak_cv.setOnClickListener(this);
        sa_cv.setOnClickListener(this);
        sl_cv.setOnClickListener(this);
        wi_cv.setOnClickListener(this);

        interstitialAd_1=new InterstitialAd(this);
        interstitialAd_1.setAdUnitId("ca-app-pub-1818607113375588/6224460673");
        interstitialAd_1.loadAd(new AdRequest.Builder().build());
        interstitialAd_1.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(PlayerActivity.this,Afg_player_Activity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_2=new InterstitialAd(this);
        interstitialAd_2.setAdUnitId("ca-app-pub-1818607113375588/4528235621");
        interstitialAd_2.loadAd(new AdRequest.Builder().build());
        interstitialAd_2.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(PlayerActivity.this,Aus_player_Activity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_3=new InterstitialAd(this);
        interstitialAd_3.setAdUnitId("ca-app-pub-1818607113375588/1164895051");
        interstitialAd_3.loadAd(new AdRequest.Builder().build());
        interstitialAd_3.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(PlayerActivity.this,Ban_player_Activity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_4=new InterstitialAd(this);
        interstitialAd_4.setAdUnitId("ca-app-pub-1818607113375588/2640438884");
        interstitialAd_4.loadAd(new AdRequest.Builder().build());
        interstitialAd_4.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(PlayerActivity.this,Eng_player_Activity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_5=new InterstitialAd(this);
        interstitialAd_5.setAdUnitId("ca-app-pub-1818607113375588/9338898549");
        interstitialAd_5.loadAd(new AdRequest.Builder().build());
        interstitialAd_5.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(PlayerActivity.this,Ind_player_Activity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_6=new InterstitialAd(this);
        interstitialAd_6.setAdUnitId("ca-app-pub-1818607113375588/3401365524");
        interstitialAd_6.loadAd(new AdRequest.Builder().build());
        interstitialAd_6.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(PlayerActivity.this,Nz_player_Activity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_7=new InterstitialAd(this);
        interstitialAd_7.setAdUnitId("ca-app-pub-1818607113375588/7834245184");
        interstitialAd_7.loadAd(new AdRequest.Builder().build());
        interstitialAd_7.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(PlayerActivity.this,Pak_player_Activity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_8=new InterstitialAd(this);
        interstitialAd_8.setAdUnitId("ca-app-pub-1818607113375588/9885693451");
        interstitialAd_8.loadAd(new AdRequest.Builder().build());
        interstitialAd_8.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(PlayerActivity.this,SA_player_Activity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_9=new InterstitialAd(this);
        interstitialAd_9.setAdUnitId("ca-app-pub-1818607113375588/9392058809");
        interstitialAd_9.loadAd(new AdRequest.Builder().build());
        interstitialAd_9.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(PlayerActivity.this,SL_player_Activity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_10=new InterstitialAd(this);
        interstitialAd_10.setAdUnitId("ca-app-pub-1818607113375588/2745570037");
        interstitialAd_10.loadAd(new AdRequest.Builder().build());
        interstitialAd_10.setAdListener(new AdListener()
                                        {
                                            @Override
                                            public void onAdClosed() {
                                                Intent intent=new Intent(PlayerActivity.this,Wi_player_Activity.class);
                                                startActivity(intent);
                                            }
                                        }
        );
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.afg_player_id)
        {
            if(interstitialAd_1.isLoaded())
            {
                interstitialAd_1.show();
            }
            else
            {
                Intent intent=new Intent(PlayerActivity.this,Afg_player_Activity.class);
                startActivity(intent);
                interstitialAd_1.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.aus_player_id)
        {
            if(interstitialAd_2.isLoaded())
            {
                interstitialAd_2.show();
            }
            else
            {
                Intent intent=new Intent(PlayerActivity.this,Aus_player_Activity.class);
                startActivity(intent);
                interstitialAd_2.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.ban_player_id)
        {
            if(interstitialAd_3.isLoaded())
            {
                interstitialAd_3.show();
            }
            else
            {
                Intent intent=new Intent(PlayerActivity.this,Ban_player_Activity.class);
                startActivity(intent);
                interstitialAd_3.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.eng_player_id)
        {
            if(interstitialAd_4.isLoaded())
            {
                interstitialAd_4.show();
            }
            else
            {
                Intent intent=new Intent(PlayerActivity.this,Eng_player_Activity.class);
                startActivity(intent);
                interstitialAd_4.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.ind_player_id)
        {
            if(interstitialAd_5.isLoaded())
            {
                interstitialAd_5.show();
            }
            else
            {
                Intent intent=new Intent(PlayerActivity.this,Ind_player_Activity.class);
                startActivity(intent);
                interstitialAd_5.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.nz_player_id)
        {
            if(interstitialAd_6.isLoaded())
            {
                interstitialAd_6.show();
            }
            else
            {
                Intent intent=new Intent(PlayerActivity.this,Nz_player_Activity.class);
                startActivity(intent);
                interstitialAd_6.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.pak_player_id)
        {
            if(interstitialAd_7.isLoaded())
            {
                interstitialAd_7.show();
            }
            else
            {
                Intent intent=new Intent(PlayerActivity.this,Pak_player_Activity.class);
                startActivity(intent);
                interstitialAd_7.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.sa_player_id)
        {
            if(interstitialAd_8.isLoaded())
            {
                interstitialAd_8.show();
            }
            else
            {
                Intent intent=new Intent(PlayerActivity.this,SA_player_Activity.class);
                startActivity(intent);
                interstitialAd_8.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.sl_player_id)
        {
            if(interstitialAd_9.isLoaded())
            {
                interstitialAd_9.show();
            }
            else
            {
                Intent intent=new Intent(PlayerActivity.this,SL_player_Activity.class);
                startActivity(intent);
                interstitialAd_9.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.wi_player_id)
        {
            if(interstitialAd_10.isLoaded())
            {
                interstitialAd_10.show();
            }
            else
            {
                Intent intent=new Intent(PlayerActivity.this,Wi_player_Activity.class);
                startActivity(intent);
                interstitialAd_10.loadAd(new AdRequest.Builder().build());
            }
        }
    }
}
