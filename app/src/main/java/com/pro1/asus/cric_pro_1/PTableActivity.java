package com.pro1.asus.cric_pro_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.google.firebase.database.*;

public class PTableActivity extends AppCompatActivity {

    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptable);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Toast.makeText(PTableActivity.this, "Check internet connection", Toast.LENGTH_LONG).show();

        reference=FirebaseDatabase.getInstance().getReference("LiveTv").child("3");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String t_url=dataSnapshot.child("point_table").getValue().toString();
                WebView webView=(WebView) findViewById(R.id.pt_web_id);
                webView.loadUrl(t_url);
                webView.setWebViewClient(new WebViewClient());
                WebSettings webSettings=webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
