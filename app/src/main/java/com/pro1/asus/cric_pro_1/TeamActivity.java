package com.pro1.asus.cric_pro_1;

import android.app.AlertDialog;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.*;
import com.google.firebase.database.*;
import com.pro1.asus.cric_pro_1.Model.Movie;
import com.pro1.asus.cric_pro_1.Utils.Common;
import com.pro1.asus.cric_pro_1.Utils.IFirebaseLoadDone;
import com.pro1.asus.cric_pro_1.Utils.MovieAdapter;
import dmax.dialog.SpotsDialog;
import it.moondroid.coverflow.components.ui.containers.FeatureCoverFlow;

import java.util.ArrayList;
import java.util.List;

public class TeamActivity extends AppCompatActivity implements IFirebaseLoadDone {

    IFirebaseLoadDone iFirebaseLoadDone;
    DatabaseReference db_ref;
    AlertDialog alertDialog;
    FeatureCoverFlow featureCoverFlow;
    TextSwitcher title;
    MovieAdapter movieAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        iFirebaseLoadDone=this;
        loadData();
    }

    private void loadData() {
        alertDialog=new SpotsDialog.Builder().setContext(TeamActivity.this)
                .setMessage("Loading")
                .setCancelable(false)
                .build();
        alertDialog.show();

        Toast.makeText(this, "Check internet connection", Toast.LENGTH_LONG).show();

        db_ref=FirebaseDatabase.getInstance().getReference("Movies");
        db_ref.addListenerForSingleValueEvent(new ValueEventListener() {

            List<Movie> movies=new ArrayList<>();

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot movieSnapShot: dataSnapshot.getChildren())
                {
                    Movie movie=movieSnapShot.getValue(Movie.class);
                    movies.add(movie);
                }
                iFirebaseLoadDone.onFirebaseLoadSuccess(movies);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                iFirebaseLoadDone.onFirebaseLoadFailed(databaseError.getMessage());
            }
        });
    }

    @Override
    public void onFirebaseLoadSuccess(List<Movie> movieList) {
        alertDialog.dismiss();
        setupUI();
        Common.movieLoaded=movieList;

        movieAdapter=new MovieAdapter(this,movieList);
        featureCoverFlow.setAdapter(movieAdapter);

        featureCoverFlow.setOnScrollPositionListener(new FeatureCoverFlow.OnScrollPositionListener() {
            @Override
            public void onScrolledToPosition(int i) {
                title.setText(Common.movieLoaded.get(i).getName());
            }

            @Override
            public void onScrolling() {

            }
        });
        featureCoverFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    private void setupUI() {
        setContentView(R.layout.activity_team);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        featureCoverFlow=(FeatureCoverFlow) findViewById(R.id.coverFlowId);
        title=(TextSwitcher) findViewById(R.id.titleid);
        title.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                LayoutInflater inflater=LayoutInflater.from(TeamActivity.this);
                TextView txt=(TextView)inflater.inflate(R.layout.layout_title,null);
                return txt;
            }
        });
        Animation in=AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation out=AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        title.setInAnimation(in);
        title.setOutAnimation(out);

        //Calculate screen size
        Display display=getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics=new DisplayMetrics();
        display.getMetrics(outMetrics);

        float density=getResources().getDisplayMetrics().density;
        float dpHeight=outMetrics.heightPixels/density;
        float dpWidth=outMetrics.widthPixels/density;

        featureCoverFlow.setCoverHeight((int)dpHeight);
        featureCoverFlow.setCoverWidth((int)dpWidth);
    }

    @Override
    public void onFirebaseLoadFailed(String message) {
        Toast.makeText(this, "message", Toast.LENGTH_SHORT).show();
    }
}
