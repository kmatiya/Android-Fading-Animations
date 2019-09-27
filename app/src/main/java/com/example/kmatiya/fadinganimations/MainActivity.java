package com.example.kmatiya.fadinganimations;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //boolean lucyIsShowing = true;
    public void fade(View view)
    {
        Log.i("Info","Imageview tapped");

        ImageView lucyImageView = findViewById(R.id.lucyImageView);
        ImageView corneliusImageView = findViewById(R.id.corneliusImageView);


        //lucyImageView.animate().rotation(1800).alpha(0).setDuration(2000);
        //lucyImageView.animate().translationXBy(-1000).setDuration(2000);


       /* if(lucyIsShowing)
        {
            lucyImageView.animate().alpha(0).setDuration(2000);
            corneliusImageView.animate().alpha(1).setDuration(2000);
            lucyIsShowing = false;
        }
        else
        {
            lucyImageView.animate().alpha(1).setDuration(2000);
            corneliusImageView.animate().alpha(0).setDuration(2000);
            lucyIsShowing = true;
        }*/

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView lucyImageView = findViewById(R.id.lucyImageView);
        lucyImageView.setX(-1000);
        lucyImageView.animate().translationXBy(1000).rotation(3600).setDuration(2000);


    }
}
