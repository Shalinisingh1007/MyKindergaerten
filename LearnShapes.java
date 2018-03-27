package com.sanskaar.shalini.mykindergarten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class LearnShapes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_shapes);



        AdView mAdView = (AdView) findViewById(R.id.adViewshapes);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }
    public void shapeSelected(View view) {
        Intent i=new Intent(LearnShapes.this,answer.class);
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
        Intent in=new Intent(LearnShapes.this,MainActivity.class);
        startActivity(in);
        finish();
    }
}
