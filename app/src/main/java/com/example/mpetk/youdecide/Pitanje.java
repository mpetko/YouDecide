package com.example.mpetk.youdecide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.text.InputType;
import android.widget.TextView;

public class Pitanje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pitanje);

        //DECIDE BUTTON
        Button decideButton = (Button) findViewById(R.id.button_decide);

        decideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //pitanje
                EditText edt_pitanje = (EditText) findViewById(R.id.edittxt_pitanje);
                edt_pitanje.setInputType(InputType.TYPE_CLASS_TEXT);
                String pitanje_string = edt_pitanje.getText().toString();

                //odgovori
                EditText edt1 = (EditText) findViewById(R.id.edittxt1);
                edt1.setInputType(InputType.TYPE_CLASS_TEXT);
                String prvi_string = edt1.getText().toString();


                EditText edt2 = (EditText) findViewById(R.id.edittxt2);
                edt1.setInputType(InputType.TYPE_CLASS_TEXT);
                String drugi_string = edt2.getText().toString();


                EditText edt3 = (EditText) findViewById(R.id.edittxt3);
                edt1.setInputType(InputType.TYPE_CLASS_TEXT);
                String treci_string = edt3.getText().toString();


                EditText edt4 = (EditText) findViewById(R.id.edittxt4);
                edt1.setInputType(InputType.TYPE_CLASS_TEXT);
                String cetvrti_string = edt4.getText().toString();

                //moj_string
                String[] moje_odluke = {prvi_string, drugi_string, treci_string, cetvrti_string};

                setContentView(R.layout.activity_odluka);

                TextView text_odl = (TextView) findViewById(R.id.text_odluka);
                TextView text_pitanje = (TextView) findViewById(R.id.text_pitanje);
                text_pitanje.setText(pitanje_string);

                //random
                int random_odl = (int) (Math.random() * 4);
                text_odl.setText(moje_odluke[random_odl]);


            }
        });

    }
}