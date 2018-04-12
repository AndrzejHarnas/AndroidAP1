package com.example.root.androidag;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class AGtest extends AppCompatActivity {


    TextView nazwa;
    Button przycisk1;
    RatingBar GW1;
    RatingBar GW2;
    RatingBar GW3;

    Context x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        nazwa =(TextView) findViewById(R.id.Napis);
        przycisk1 = (Button) findViewById(R.id.Przycisk);
        GW1 = (RatingBar) findViewById(R.id.ratingBar2);
        GW2 = (RatingBar) findViewById(R.id.ratingBar3);
        GW3 = (RatingBar) findViewById(R.id.ratingBar4);






        przycisk1.setText("Zlicz Gwiazdki");
        x=getApplicationContext();

        przycisk1.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v){

                float g1 = GW1.getRating();
                float g2 = GW2.getRating();
                float g3 = GW3.getRating();

                float suma = g1 + g2 + g3;

                Intent intent = new Intent(x, AGnew.class);
                intent.putExtra("coś",suma);

                startActivity(intent);




            }

        });



    }
}


