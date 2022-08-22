package com.example.x_cite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        Phons deliveredPhone =(Phons) bundle.getSerializable("THEPHONEs");


        ImageView IMage = findViewById(R.id.KOKO);
        TextView TITEEL = findViewById(R.id.LOLO);
        TextView DISC = findViewById(R.id.KNSHORO);

        IMage.setImageResource(deliveredPhone.getPhoneIMge());
        TITEEL.setText(deliveredPhone.getPhonName());
        DISC.setText(deliveredPhone.getPhoneDisc());


    }
}