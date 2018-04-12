package com.example.root.androidag;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AGnew extends AppCompatActivity {


    TextView nazwa;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);


        nazwa = findViewById(R.id.Napis);

        Bundle bundle = getIntent().getExtras();

        float sum = bundle.getFloat("coś");


        nazwa.setText("suma wynosi: "+sum);




    }
}


