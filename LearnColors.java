package com.sanskaar.shalini.mykindergarten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class LearnColors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_colors);

        AdView mAdView = (AdView) findViewById(R.id.adViewcolor);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
    public void colorSelected(View view) {
        Intent i=new Intent(LearnColors.this,answer.class);
        int tvId=view.getId();
        int imageID,soundId;
        String ourId="";
        ourId=view.getResources().getResourceEntryName(tvId);
        imageID=getResources().getIdentifier(ourId,"drawable","com.sanskaar.shalini.mykindergarten");
        soundId=getResources().getIdentifier(ourId,"raw","com.sanskaar.shalini.mykindergarten");
        i.putExtra("ImageID",imageID);
        i.putExtra("SoundID",soundId);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent in=new Intent(LearnColors.this,MainActivity.class);
        startActivity(in);
        finish();
    }
}
