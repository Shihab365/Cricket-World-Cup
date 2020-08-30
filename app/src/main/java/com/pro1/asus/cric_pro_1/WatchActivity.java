package com.pro1.asus.cric_pro_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class WatchActivity extends AppCompatActivity implements View.OnClickListener{

    CardView server_1,server_2,server_3,server_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        server_1=findViewById(R.id.server_id_1);
        server_2=findViewById(R.id.server_id_2);
        server_3=findViewById(R.id.server_id_3);
        server_4=findViewById(R.id.server_id_4);

        server_1.setOnClickListener(this);
        server_2.setOnClickListener(this);
        server_3.setOnClickListener(this);
        server_4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.server_id_1)
        {
            Intent intent=new Intent(WatchActivity.this,TvStreamActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.server_id_2)
        {
            Intent intent=new Intent(WatchActivity.this,TvStreamActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.server_id_3)
        {
            Intent intent=new Intent(WatchActivity.this,TvStreamActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.server_id_4)
        {
            Intent intent=new Intent(WatchActivity.this,TvStreamActivity.class);
            startActivity(intent);
        }
    }
}
