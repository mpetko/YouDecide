package com.example.mpetk.youdecide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.facebook.FacebookSdk;

/**
 * Created by mpetk on 8.1.2016..
 */
public class Home extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initialize facebook sdk
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_home);

        Button randomB = (Button) findViewById(R.id.button_random_H);
        Button askOthers = (Button) findViewById(R.id.button_ask_H);

        randomB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(), Pitanje.class);
                startActivity(intent);
            }
        });

        askOthers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentA = new Intent(getApplicationContext(), Login.class);
                startActivity(intentA);
            }
        });










    }

}
