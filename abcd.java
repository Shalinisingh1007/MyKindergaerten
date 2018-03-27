package com.sanskaar.shalini.mykindergarten;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class abcd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abcd);

        AdView mAdView = (AdView) findViewById(R.id.adViewabcd);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }



    public void alphabetSelected(View view) {
        Intent i=new Intent(abcd.this,answer.class);
        int tvId=view.getId();
        int imageID,soundId;
        String ourId="";
        ourId=view.getResources().getResourceEntryName(tvId);
        imageID=getResources().getIdentifier(ourId,"drawable","com.sanskaar.shalini.mykindergarten");
        soundId=getResources().getIdentifier(ourId,"raw","com.sanskaar.shalini.mykindergarten");

        i.putExtra("ImageID",imageID);
        i.putExtra("SoundID", soundId);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent in=new Intent(abcd.this,MainActivity.class);
        startActivity(in);
        finish();
    }
}
