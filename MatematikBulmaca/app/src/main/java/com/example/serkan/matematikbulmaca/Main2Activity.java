package com.example.serkan.matematikbulmaca;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final Button kolay;
        Button orta;
        Button zor;
        kolay = (Button) findViewById(R.id.btnkolay);
        orta = (Button) findViewById(R.id.btnorta);
        zor = (Button) findViewById(R.id.btnzor);

        kolay.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence charSequence = "1";
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class); // bu şekilde son ekrana geçiyoruz
                intent.putExtra("seviye", charSequence); //edittextin üzerindeki yazıyı bununla yolluyoruz
                startActivity(intent);
                finish();
            }
        });

        orta.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence charSequence = "2";
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class); // bu şekilde son ekrana geçiyoruz
                intent.putExtra("seviye", charSequence); //edittextin üzerindeki yazıyı bununla yolluyoruz
                startActivity(intent);
                finish();
            }
        });

        zor.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence charSequence = "3";
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class); // bu şekilde 3. ekrana geçiyoruz
                intent.putExtra("seviye", charSequence); //edittextin üzerindeki yazıyı bununla yolluyoruz
                startActivity(intent);
                finish();
            }
        });

    }
}
