package com.androidlibpro;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

//import chehara.mylibapplication.CheharaTime;

public class MainActivity extends Activity {
//Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.user);

       /*  btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheharaTime.callEvent(MainActivity.this,"room");
                //TestClass.testActivity(MainLIBActivity.this);
            }
        });*/
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(this)
                .load("https://goo.gl/images/h7bg4m")
                .into(imageView);
    }
    }

