package com.sanskaar.shalini.mykindergarten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class OneTwoThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_two_three);

        AdView mAdView = (AdView) findViewById(R.id.adView123);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }


    public void numberSelected(View view) {
        Intent i=new Intent(OneTwoThree.this,answer.class);
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
        Intent in=new Intent(OneTwoThree.this,MainActivity.class);
        startActivity(in);
        finish();
    }
}
