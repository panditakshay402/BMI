package com.example.bmiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ed1=null,ed2 = null;
        Button bt1 = null;
        TextView tv1 = null;

        ed1.findViewById(R.id.ed1);
        ed2.findViewById(R.id.ed2);
        bt1.findViewById(R.id.bt1);
        tv1.findViewById(R.id.tv1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ht= Integer.parseInt(ed1.getText().toString());
                int wt= Integer.parseInt(ed2.getText().toString());
                double bmi = wt/(ht*ht);


                if (bmi>25){
                    tv1.setText("Overwieght");
                } else if (bmi<18) {
                    tv1.setText("UnderWeight");

                } else {
                    tv1.setText("Healthy");
                }

            }
        });
    }
}