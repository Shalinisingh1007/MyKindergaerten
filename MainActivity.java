package com.sanskaar.shalini.mykindergarten;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton learnABCD=(ImageButton)findViewById(R.id.imageButtonabcd);
        learnABCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,abcd.class);
                startActivity(i);
                finish();
            }
        });

        ImageButton learn123=(ImageButton)findViewById(R.id.imageButton123);
        learn123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,OneTwoThree.class);
                startActivity(i);
                finish();
            }
        });

        ImageButton learnColor=(ImageButton)findViewById(R.id.imageButtonColors);
        learnColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,LearnColors.class);
                startActivity(i);
                finish();
            }
        });

        ImageButton learnShapes=(ImageButton)findViewById(R.id.imageButtonshapes);
        learnShapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,LearnShapes.class);
                startActivity(i);
                finish();
            }
        });


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final InterstitialAd interstitialAd=new InterstitialAd(getApplicationContext());
        interstitialAd.setAdUnitId("******************************");
        interstitialAd.loadAd(adRequest);
        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
            }

            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);

            }

            @Override
            public void onAdLeftApplication() {
                super.onAdLeftApplication();
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }

            @Override
            public void onAdLoaded() {
                interstitialAd.show();
                super.onAdLoaded();
            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
            }

            @Override
            public void onAdImpression() {
                super.onAdImpression();
            }
        });
    }
}
