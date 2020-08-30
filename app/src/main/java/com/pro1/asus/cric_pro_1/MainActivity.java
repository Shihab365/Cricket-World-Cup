package com.pro1.asus.cric_pro_1;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,View.OnClickListener{

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    CardView team_btn,fixture_btn,player_btn,win_btn,score_btn,tv_btn;
    InterstitialAd interstitialAd_1,interstitialAd_2,interstitialAd_3,interstitialAd_4,
            interstitialAd_5,interstitialAd_6,interstitialAd_7,interstitialAd_8,interstitialAd_9,interstitialAd_10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout=findViewById(R.id.drawerid);

        NavigationView navigationView=findViewById(R.id.navigationid);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        team_btn=findViewById(R.id.team_id);
        fixture_btn=findViewById(R.id.fixture_id);
        player_btn=findViewById(R.id.player_list_id);
        win_btn=findViewById(R.id.win_today_id);
        score_btn=findViewById(R.id.live_score_id);
        tv_btn=findViewById(R.id.live_watch_id);

        team_btn.setOnClickListener(this);
        fixture_btn.setOnClickListener(this);
        player_btn.setOnClickListener(this);
        win_btn.setOnClickListener(this);
        score_btn.setOnClickListener(this);
        tv_btn.setOnClickListener(this);

        interstitialAd_1=new InterstitialAd(this);
        interstitialAd_1.setAdUnitId("ca-app-pub-1818607113375588/9144646799");
        interstitialAd_1.loadAd(new AdRequest.Builder().build());
        interstitialAd_1.setAdListener(new AdListener()
                                     {
                                         @Override
                                         public void onAdClosed() {
                                             Intent intent=new Intent(MainActivity.this,TMatchActivity.class);
                                             startActivity(intent);
                                         }
                                     }
        );
        interstitialAd_2=new InterstitialAd(this);
        interstitialAd_2.setAdUnitId("ca-app-pub-1818607113375588/8378360037");
        interstitialAd_2.loadAd(new AdRequest.Builder().build());
        interstitialAd_2.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(MainActivity.this,UmpireActivity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_3=new InterstitialAd(this);
        interstitialAd_3.setAdUnitId("ca-app-pub-1818607113375588/8792103638");
        interstitialAd_3.loadAd(new AdRequest.Builder().build());
        interstitialAd_3.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(MainActivity.this,StadiumActivity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_4=new InterstitialAd(this);
        interstitialAd_4.setAdUnitId("ca-app-pub-1818607113375588/5369053318");
        interstitialAd_4.loadAd(new AdRequest.Builder().build());
        interstitialAd_4.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(MainActivity.this,AboutActivity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_5=new InterstitialAd(this);
        interstitialAd_5.setAdUnitId("ca-app-pub-1818607113375588/3864399954");
        interstitialAd_5.loadAd(new AdRequest.Builder().build());
        interstitialAd_5.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(MainActivity.this,TeamActivity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_6=new InterstitialAd(this);
        interstitialAd_6.setAdUnitId("ca-app-pub-1818607113375588/6484670349");
        interstitialAd_6.loadAd(new AdRequest.Builder().build());
        interstitialAd_6.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(MainActivity.this,FixtureActivity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_7=new InterstitialAd(this);
        interstitialAd_7.setAdUnitId("ca-app-pub-1818607113375588/7730303408");
        interstitialAd_7.loadAd(new AdRequest.Builder().build());
        interstitialAd_7.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(MainActivity.this,PlayerActivity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_8=new InterstitialAd(this);
        interstitialAd_8.setAdUnitId("ca-app-pub-1818607113375588/7373890811");
        interstitialAd_8.loadAd(new AdRequest.Builder().build());
        interstitialAd_8.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(MainActivity.this,WinTodayActivity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_9=new InterstitialAd(this);
        interstitialAd_9.setAdUnitId("ca-app-pub-1818607113375588/3243074112");
        interstitialAd_9.loadAd(new AdRequest.Builder().build());
        interstitialAd_9.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(MainActivity.this,ScoreActivity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
        interstitialAd_10=new InterstitialAd(this);
        interstitialAd_10.setAdUnitId("ca-app-pub-1818607113375588/1546849062");
        interstitialAd_10.loadAd(new AdRequest.Builder().build());
        interstitialAd_10.setAdListener(new AdListener()
                                       {
                                           @Override
                                           public void onAdClosed() {
                                               Intent intent=new Intent(MainActivity.this,WatchActivity.class);
                                               startActivity(intent);
                                           }
                                       }
        );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(actionBarDrawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.h_menu_id)
        {
            Intent intent=new Intent(MainActivity.this,MainActivity.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.tmatch_menu_id)
        {

            if(interstitialAd_1.isLoaded())
            {
                interstitialAd_1.show();
            }
            else
            {
                Intent intent=new Intent(MainActivity.this,TMatchActivity.class);
                startActivity(intent);
                interstitialAd_1.loadAd(new AdRequest.Builder().build());
            }
        }
        if(item.getItemId()==R.id.umpire_menu_icon)
        {
            if(interstitialAd_2.isLoaded())
            {
                interstitialAd_2.show();
            }
            else
            {
                Intent intent=new Intent(MainActivity.this,UmpireActivity.class);
                startActivity(intent);
                interstitialAd_2.loadAd(new AdRequest.Builder().build());
            }
        }
        if(item.getItemId()==R.id.stadium_menu_icon)
        {
            if(interstitialAd_3.isLoaded())
            {
                interstitialAd_3.show();
            }
            else
            {
                Intent intent=new Intent(MainActivity.this,StadiumActivity.class);
                startActivity(intent);
                interstitialAd_3.loadAd(new AdRequest.Builder().build());
            }
        }
        if(item.getItemId()==R.id.share_menu_id)
        {
            Intent intent=new Intent(MainActivity.this,ShareActivity.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.feedback_menu_id)
        {
            Intent intent=new Intent(MainActivity.this,RatingActivity.class);
            startActivity(intent);
        }
        if(item.getItemId()==R.id.about_menu_id)
        {
            if(interstitialAd_4.isLoaded())
            {
                interstitialAd_4.show();
            }
            else
            {
                Intent intent=new Intent(MainActivity.this,AboutActivity.class);
                startActivity(intent);
                interstitialAd_4.loadAd(new AdRequest.Builder().build());
            }
        }
        return false;
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.team_id)
        {
            if(interstitialAd_5.isLoaded())
            {
                interstitialAd_5.show();
            }
            else
            {
                Intent intent=new Intent(MainActivity.this,TeamActivity.class);
                startActivity(intent);
                interstitialAd_5.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.fixture_id)
        {
            if(interstitialAd_6.isLoaded())
            {
                interstitialAd_6.show();
            }
            else
            {
                Intent intent=new Intent(MainActivity.this,FixtureActivity.class);
                startActivity(intent);
                interstitialAd_6.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.player_list_id)
        {
            if(interstitialAd_7.isLoaded())
            {
                interstitialAd_7.show();
            }
            else
            {
                Intent intent=new Intent(MainActivity.this,PlayerActivity.class);
                startActivity(intent);
                interstitialAd_7.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.win_today_id)
        {
            if(interstitialAd_8.isLoaded())
            {
                interstitialAd_8.show();
            }
            else
            {
                Intent intent=new Intent(MainActivity.this,WinTodayActivity.class);
                startActivity(intent);
                interstitialAd_8.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.live_score_id)
        {
            if(interstitialAd_9.isLoaded())
            {
                interstitialAd_9.show();
            }
            else
            {
                Intent intent=new Intent(MainActivity.this,ScoreActivity.class);
                startActivity(intent);
                interstitialAd_9.loadAd(new AdRequest.Builder().build());
            }
        }
        else if(v.getId()==R.id.live_watch_id)
        {
            if(interstitialAd_10.isLoaded())
            {
                interstitialAd_10.show();
            }
            else
            {
                Intent intent=new Intent(MainActivity.this,WatchActivity.class);
                startActivity(intent);
                interstitialAd_10.loadAd(new AdRequest.Builder().build());
            }
        }
    }
}
