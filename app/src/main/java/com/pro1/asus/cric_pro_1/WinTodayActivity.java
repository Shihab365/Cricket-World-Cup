package com.pro1.asus.cric_pro_1;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.Random;

public class WinTodayActivity extends AppCompatActivity {

    TextView percentage_text;
    AutoCompleteTextView team_enter_edittext;
    ImageButton hit_button;
    String[] countryNames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_today);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        percentage_text=(TextView) findViewById(R.id.textview_score_id);
        team_enter_edittext=(AutoCompleteTextView) findViewById(R.id.edittext_team_id);
        hit_button=(ImageButton) findViewById(R.id.imagebutton_hit_id);

        countryNames=getResources().getStringArray(R.array.team_name_auto);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,countryNames);
        team_enter_edittext.setThreshold(1);
        team_enter_edittext.setAdapter(adapter);

        hit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(team_enter_edittext.getText().toString().equals(""))
                {
                    Toast.makeText(WinTodayActivity.this, "Enter team name!!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    percentage_text.setText(generateString(2)+""+"%");
                    hit_button.setClickable(false);
                }
            }
        });
    }

    private String generateString(int length)
    {
        char[] chars="1234567890".toCharArray();
        StringBuilder stringBuilder=new StringBuilder();
        Random random=new Random();
        for(int i=0;i<length;i++)
        {
            char c=chars[random.nextInt(chars.length)];
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
