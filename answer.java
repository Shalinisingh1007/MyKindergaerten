package com.sanskaar.shalini.mykindergarten;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class answer extends AppCompatActivity {

    int selecetdImage,selectedSound;
    MediaPlayer mp;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        Bundle bundle=getIntent().getExtras();
        selecetdImage=bundle.getInt("ImageID");
        selectedSound=bundle.getInt("SoundID");
        img=(ImageView)findViewById(R.id.imageView);
        img.setImageResource(selecetdImage);
        img.animate().alphaBy(1).setDuration(3000);
        mp= MediaPlayer.create(answer.this,selectedSound);
        mp.start();

        //Toast.makeText(answer.this,selecetdItem,Toast.LENGTH_SHORT).show();


    }

    public void goBack(View view) {
        img.animate().alpha(0);
        mp.stop();
        mp.release();
        super.onBackPressed();
        finish();
    }

    @Override
    public void onBackPressed() {
        img.animate().alpha(0);
        mp.stop();
        mp.release();
        finish();
        super.onBackPressed();

    }
}
