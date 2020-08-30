package com.pro1.asus.cric_pro_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.database.*;
import com.squareup.picasso.Picasso;

public class TMatchActivity extends AppCompatActivity {

    DatabaseReference reference;
    TextView team1,team2;
    ImageView img1,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmatch);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        team1=(TextView) findViewById(R.id.team_name_1_id);
        team2=(TextView) findViewById(R.id.team_name_2_id);
        img1=(ImageView) findViewById(R.id.team_flag_1_id);
        img2=(ImageView) findViewById(R.id.team_flag_2_id);

        Toast.makeText(TMatchActivity.this, "Check internet connection", Toast.LENGTH_LONG).show();

        reference=FirebaseDatabase.getInstance().getReference("TMatch").child("1");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String tm1=dataSnapshot.child("team_name_1").getValue().toString();
                String tm2=dataSnapshot.child("team_name_2").getValue().toString();

                String im1=dataSnapshot.child("team_flag_1").getValue().toString();
                String im2=dataSnapshot.child("team_flag_2").getValue().toString();

                team1.setText(tm1);
                team2.setText(tm2);

                Picasso.get().load(im1).into(img1);
                Picasso.get().load(im2).into(img2);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
