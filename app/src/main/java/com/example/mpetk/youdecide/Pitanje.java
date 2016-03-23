package com.example.mpetk.youdecide;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.text.InputType;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.FacebookSdk;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareButton;

public class Pitanje extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //initialize facebook sdk
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_pitanje);





        //+ BUTTON ***************
        // ******************** 3. edit text
        final Button dodajPolje = (Button) findViewById(R.id.button_more1);
        dodajPolje.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText edt3 = (EditText) findViewById(R.id.edittxt3);
                edt3.setVisibility(View.VISIBLE);
                Button dodajPolje1 = (Button) findViewById(R.id.button_more2);
                dodajPolje1.setVisibility(View.VISIBLE);
                dodajPolje.setVisibility(View.INVISIBLE);

                //DECIDE BUTTON
                Button decideButton = (Button) findViewById(R.id.button_decide);

                decideButton.setOnClickListener(new OnClickListener() {
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
                        edt2.setInputType(InputType.TYPE_CLASS_TEXT);
                        String drugi_string = edt2.getText().toString();

                        EditText edt3 = (EditText) findViewById(R.id.edittxt3);
                        edt3.setInputType(InputType.TYPE_CLASS_TEXT);
                        String treci_string = edt3.getText().toString();

                        //provjerava treci editext dal je prazan
                        if(TextUtils.isEmpty(treci_string)) {

                            edt3.setError("Field can not be empty!");
                            return;
                        }

                        //moj_string
                        String[] moje_odluke = {prvi_string, drugi_string, treci_string};

                        setContentView(R.layout.activity_odluka);

                        TextView text_odl = (TextView) findViewById(R.id.text_odluka);
                        TextView text_pitanje = (TextView) findViewById(R.id.text_pitanje);
                        text_pitanje.setText(pitanje_string);

                        //random
                        int random_odl = (int) (Math.random() * 3);
                        text_odl.setText(moje_odluke[random_odl]);

                        if (edt_pitanje.getText().toString().length() == 0) {
                            text_pitanje.setText("Well, I guess you don't need to write the question...");
                        }


                    }
                });




                /*
if (edt3.getVisibility() == View.VISIBLE)
*/

            }
        });

        // ******************** 4. edit text

        final Button dodajPolje1 = (Button) findViewById(R.id.button_more2);
        dodajPolje1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText edt4 = (EditText) findViewById(R.id.edittxt4);
                edt4.setVisibility(View.VISIBLE);
                Button dodajPolje2 = (Button) findViewById(R.id.button_more3);
                dodajPolje2.setVisibility(View.VISIBLE);
                dodajPolje1.setVisibility(View.INVISIBLE);

                //DECIDE BUTTON
                Button decideButton = (Button) findViewById(R.id.button_decide);

                decideButton.setOnClickListener(new OnClickListener() {
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
                        edt2.setInputType(InputType.TYPE_CLASS_TEXT);
                        String drugi_string = edt2.getText().toString();

                        EditText edt3 = (EditText) findViewById(R.id.edittxt3);
                        edt3.setInputType(InputType.TYPE_CLASS_TEXT);
                        String treci_string = edt3.getText().toString();

                        EditText edt4 = (EditText) findViewById(R.id.edittxt4);
                        edt4.setInputType(InputType.TYPE_CLASS_TEXT);
                        String cetvrti_string = edt4.getText().toString();

                        //provjerava 4. editext dal je prazan
                        if(TextUtils.isEmpty(cetvrti_string)) {

                            edt4.setError("Field can not be empty!");
                            return;
                        }


                        //moj_string
                        String[] moje_odluke = {prvi_string, drugi_string, treci_string, cetvrti_string};

                        setContentView(R.layout.activity_odluka);

                        TextView text_odl = (TextView) findViewById(R.id.text_odluka);
                        TextView text_pitanje = (TextView) findViewById(R.id.text_pitanje);
                        text_pitanje.setText(pitanje_string);

                        //random
                        int random_odl = (int) (Math.random() * 4);
                        text_odl.setText(moje_odluke[random_odl]);

                        if(edt_pitanje.getText().toString().length() == 0 ) {
                            text_pitanje.setText("Well, I guess you don't need to write the question...");
                        }


                    }
                });


            }
        });



        // *************** 5. eedit text

        final Button dodajPolje2 = (Button) findViewById(R.id.button_more3);
        dodajPolje2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText edt5 = (EditText) findViewById(R.id.edittxt5);
                edt5.setVisibility(View.VISIBLE);
                Button dodajPolje3 = (Button) findViewById(R.id.button_more4);
                dodajPolje3.setVisibility(View.VISIBLE);
                dodajPolje2.setVisibility(View.INVISIBLE);

                //DECIDE BUTTON
                Button decideButton = (Button) findViewById(R.id.button_decide);

                decideButton.setOnClickListener(new OnClickListener() {
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
                        edt2.setInputType(InputType.TYPE_CLASS_TEXT);
                        String drugi_string = edt2.getText().toString();

                        EditText edt3 = (EditText) findViewById(R.id.edittxt3);
                        edt3.setInputType(InputType.TYPE_CLASS_TEXT);
                        String treci_string = edt3.getText().toString();

                        EditText edt4 = (EditText) findViewById(R.id.edittxt4);
                        edt4.setInputType(InputType.TYPE_CLASS_TEXT);
                        String cetvrti_string = edt4.getText().toString();

                        EditText edt5 = (EditText) findViewById(R.id.edittxt5);
                        edt5.setInputType(InputType.TYPE_CLASS_TEXT);
                        String peti_string = edt5.getText().toString();

                        //provjerava treci editext dal je prazan
                        if(TextUtils.isEmpty(peti_string)) {

                            edt5.setError("Field can not be empty!");
                            return;
                        }


                        //moj_string
                        String[] moje_odluke = {prvi_string, drugi_string, treci_string, cetvrti_string, peti_string};

                        setContentView(R.layout.activity_odluka);

                        TextView text_odl = (TextView) findViewById(R.id.text_odluka);
                        TextView text_pitanje = (TextView) findViewById(R.id.text_pitanje);
                        text_pitanje.setText(pitanje_string);

                        //random
                        int random_odl = (int) (Math.random() * 5);
                        text_odl.setText(moje_odluke[random_odl]);

                        if(edt_pitanje.getText().toString().length() == 0 ) {
                            text_pitanje.setText("Well, I guess you don't need to write the question...");
                        }


                    }
                });


            }
        });

        // *************** 6. eedit text

        final Button dodajPolje3 = (Button) findViewById(R.id.button_more4);
        dodajPolje3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText edt6 = (EditText) findViewById(R.id.edittxt6);
                edt6.setVisibility(View.VISIBLE);
                Button dodajPolje4 = (Button) findViewById(R.id.button_more5);
                dodajPolje4.setVisibility(View.VISIBLE);
                dodajPolje3.setVisibility(View.INVISIBLE);

                //DECIDE BUTTON
                Button decideButton = (Button) findViewById(R.id.button_decide);

                decideButton.setOnClickListener(new OnClickListener() {
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
                        edt2.setInputType(InputType.TYPE_CLASS_TEXT);
                        String drugi_string = edt2.getText().toString();

                        EditText edt3 = (EditText) findViewById(R.id.edittxt3);
                        edt3.setInputType(InputType.TYPE_CLASS_TEXT);
                        String treci_string = edt3.getText().toString();

                        EditText edt4 = (EditText) findViewById(R.id.edittxt4);
                        edt4.setInputType(InputType.TYPE_CLASS_TEXT);
                        String cetvrti_string = edt4.getText().toString();

                        EditText edt5 = (EditText) findViewById(R.id.edittxt5);
                        edt5.setInputType(InputType.TYPE_CLASS_TEXT);
                        String peti_string = edt5.getText().toString();

                        EditText edt6 = (EditText) findViewById(R.id.edittxt6);
                        edt6.setInputType(InputType.TYPE_CLASS_TEXT);
                        String sest_string = edt6.getText().toString();

                        //provjerava treci editext dal je prazan
                        if(TextUtils.isEmpty(sest_string)) {

                            edt6.setError("Field can not be empty!");
                            return;
                        }


                        //moj_string
                        String[] moje_odluke = {prvi_string, drugi_string, treci_string, cetvrti_string, peti_string, sest_string};

                        setContentView(R.layout.activity_odluka);

                        TextView text_odl = (TextView) findViewById(R.id.text_odluka);
                        TextView text_pitanje = (TextView) findViewById(R.id.text_pitanje);
                        text_pitanje.setText(pitanje_string);

                        //random
                        int random_odl = (int) (Math.random() * 6);
                        text_odl.setText(moje_odluke[random_odl]);

                        if(edt_pitanje.getText().toString().length() == 0 ) {
                            text_pitanje.setText("Well, I guess you don't need to write the question...");
                        }


                    }
                });


            }
        });
        // *************** 7. eedit text

        final Button dodajPolje4 = (Button) findViewById(R.id.button_more5);
        dodajPolje4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText edt7 = (EditText) findViewById(R.id.edittxt7);
                edt7.setVisibility(View.VISIBLE);
                Button dodajPolje5 = (Button) findViewById(R.id.button_more6);
                dodajPolje5.setVisibility(View.VISIBLE);
                dodajPolje4.setVisibility(View.INVISIBLE);

                //DECIDE BUTTON
                Button decideButton = (Button) findViewById(R.id.button_decide);

                decideButton.setOnClickListener(new OnClickListener() {
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
                        edt2.setInputType(InputType.TYPE_CLASS_TEXT);
                        String drugi_string = edt2.getText().toString();

                        EditText edt3 = (EditText) findViewById(R.id.edittxt3);
                        edt3.setInputType(InputType.TYPE_CLASS_TEXT);
                        String treci_string = edt3.getText().toString();

                        EditText edt4 = (EditText) findViewById(R.id.edittxt4);
                        edt4.setInputType(InputType.TYPE_CLASS_TEXT);
                        String cetvrti_string = edt4.getText().toString();

                        EditText edt5 = (EditText) findViewById(R.id.edittxt5);
                        edt5.setInputType(InputType.TYPE_CLASS_TEXT);
                        String peti_string = edt5.getText().toString();

                        EditText edt6 = (EditText) findViewById(R.id.edittxt6);
                        edt6.setInputType(InputType.TYPE_CLASS_TEXT);
                        String sest_string = edt6.getText().toString();

                        EditText edt7 = (EditText) findViewById(R.id.edittxt7);
                        edt7.setInputType(InputType.TYPE_CLASS_TEXT);
                        String sedam_string = edt7.getText().toString();

                        //provjerava treci editext dal je prazan
                        if(TextUtils.isEmpty(sedam_string)) {

                            edt7.setError("Field can not be empty!");
                            return;
                        }


                        //moj_string
                        String[] moje_odluke = {prvi_string, drugi_string, treci_string, cetvrti_string, peti_string, sest_string, sedam_string};

                        setContentView(R.layout.activity_odluka);

                        TextView text_odl = (TextView) findViewById(R.id.text_odluka);
                        TextView text_pitanje = (TextView) findViewById(R.id.text_pitanje);
                        text_pitanje.setText(pitanje_string);

                        //random
                        int random_odl = (int) (Math.random() * 7);
                        text_odl.setText(moje_odluke[random_odl]);

                        if(edt_pitanje.getText().toString().length() == 0 ) {
                            text_pitanje.setText("Well, I guess you don't need to write the question...");
                        }


                    }
                });


            }
        });

        // *************** 8. eedit text

        final Button dodajPolje5 = (Button) findViewById(R.id.button_more6);
        dodajPolje5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText edt8 = (EditText) findViewById(R.id.edittxt8);
                edt8.setVisibility(View.VISIBLE);

                //nema vise
                dodajPolje5.setVisibility(View.INVISIBLE);

                //DECIDE BUTTON
                Button decideButton = (Button) findViewById(R.id.button_decide);

                decideButton.setOnClickListener(new OnClickListener() {
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
                        edt2.setInputType(InputType.TYPE_CLASS_TEXT);
                        String drugi_string = edt2.getText().toString();

                        EditText edt3 = (EditText) findViewById(R.id.edittxt3);
                        edt3.setInputType(InputType.TYPE_CLASS_TEXT);
                        String treci_string = edt3.getText().toString();

                        EditText edt4 = (EditText) findViewById(R.id.edittxt4);
                        edt4.setInputType(InputType.TYPE_CLASS_TEXT);
                        String cetvrti_string = edt4.getText().toString();

                        EditText edt5 = (EditText) findViewById(R.id.edittxt5);
                        edt5.setInputType(InputType.TYPE_CLASS_TEXT);
                        String peti_string = edt5.getText().toString();

                        EditText edt6 = (EditText) findViewById(R.id.edittxt6);
                        edt6.setInputType(InputType.TYPE_CLASS_TEXT);
                        String sest_string = edt6.getText().toString();

                        EditText edt7 = (EditText) findViewById(R.id.edittxt7);
                        edt7.setInputType(InputType.TYPE_CLASS_TEXT);
                        String sedam_string = edt7.getText().toString();

                        EditText edt8 = (EditText) findViewById(R.id.edittxt8);
                        edt8.setInputType(InputType.TYPE_CLASS_TEXT);
                        String osam_string = edt8.getText().toString();

                        //provjerava treci editext dal je prazan
                        if(TextUtils.isEmpty(osam_string)) {

                            edt8.setError("Field can not be empty!");
                            return;
                        }


                        //moj_string
                        String[] moje_odluke = {prvi_string, drugi_string, treci_string, cetvrti_string, peti_string, sest_string, sedam_string, osam_string};

                        setContentView(R.layout.activity_odluka);

                        TextView text_odl = (TextView) findViewById(R.id.text_odluka);
                        TextView text_pitanje = (TextView) findViewById(R.id.text_pitanje);
                        text_pitanje.setText(pitanje_string);

                        //random
                        int random_odl = (int) (Math.random() * 8);
                        text_odl.setText(moje_odluke[random_odl]);

                        if(edt_pitanje.getText().toString().length() == 0 ) {
                            text_pitanje.setText("Well, I guess you don't need to write the question...");
                        }


                    }
                });


            }
        });


        //DECIDE BUTTON
        Button decideButton = (Button) findViewById(R.id.button_decide);

        decideButton.setOnClickListener(new OnClickListener() {
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
                edt2.setInputType(InputType.TYPE_CLASS_TEXT);
                String drugi_string = edt2.getText().toString();



                //PROVJERAVA DALI JE EDITTEXT PRAZAN
                if(TextUtils.isEmpty(prvi_string)) {

                    edt1.setError("Field can not be empty!");
                    return;
                }else if (TextUtils.isEmpty(drugi_string)) {
                    edt2.setError("Field can not be empty!");
                    return;
                }


                //moj_string
                String[] moje_odluke = {prvi_string, drugi_string};

                setContentView(R.layout.activity_odluka);

                TextView text_odl = (TextView) findViewById(R.id.text_odluka);
                TextView text_pitanje = (TextView) findViewById(R.id.text_pitanje);
                text_pitanje.setText(pitanje_string);

                //random
                int random_odl = (int) (Math.random() * 2);
                text_odl.setText(moje_odluke[random_odl]);

                if (edt_pitanje.getText().toString().length() == 0) {
                    text_pitanje.setText("Well, I guess you don't need to write the question...");
                }

                //FB
                ShareButton fbShareButton = (ShareButton) findViewById(R.id.share_btn);
                ShareLinkContent content = new ShareLinkContent.Builder()
                        .setContentUrl(Uri.parse("https://web.facebook.com/petko91"))
                        .setContentTitle("YouDecide app")
                        .setContentDescription("YouDecide app helped me decide. Try it now!")
                        .build();
                fbShareButton.setShareContent(content);


            }
        });


    }
}