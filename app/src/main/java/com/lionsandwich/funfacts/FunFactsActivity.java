package com.lionsandwich.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends Activity {

    public static final String TAG = FunFactsActivity.class.getSimpleName();

    private FactBook mFactBook     = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);


        // Declare our View variables and assign them the views from the layout file
        final TextView          factLabel       = (TextView)       findViewById(R.id.factTextView);
        final RelativeLayout    relativeLayout  = (RelativeLayout) findViewById(R.id.relativeLayout);
        final Button            showFactButton  = (Button)         findViewById(R.id.showFactButton);

        View.OnClickListener listener  = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fact = mFactBook     .getFact();
                int    color= mColorWheel   .getColor();
                // Update the label with our dynamic fact
                factLabel       .setText(fact);
                relativeLayout  .setBackgroundColor(color);
                showFactButton  .setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(listener);

       // Toast.makeText(this,  "Yay! Our Activity was created", Toast.LENGTH_LONG).show();

        Log.d(TAG, getString(R.string.output));



    }



}
