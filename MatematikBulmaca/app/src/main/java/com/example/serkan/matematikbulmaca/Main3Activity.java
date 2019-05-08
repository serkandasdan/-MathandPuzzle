package com.example.serkan.matematikbulmaca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button basla;
        final RadioButton toplama,cikarma,carpma,bolme;
        basla = (Button) findViewById(R.id.btnbasla);
        toplama = (RadioButton) findViewById(R.id.chtoplama);
        cikarma = (RadioButton) findViewById(R.id.chcikarma);
        carpma = (RadioButton) findViewById(R.id.chcarpma);
        bolme = (RadioButton) findViewById(R.id.chbolme);

        Bundle gelenVeri=getIntent().getExtras(); //gelen veriyi almak için
        final CharSequence gelenYazi=gelenVeri.getCharSequence("seviye");
        final String gelenYazi2= (String) gelenYazi;


        basla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(toplama.isChecked()){
                    CharSequence charSequence = "+";
                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                    intent.putExtra("islem", charSequence); //edittextin üzerindeki yazıyı bununla yolluyoruz
                    intent.putExtra("seviye", gelenYazi2);
                    intent.putExtra("skor1", 0);
                    intent.putExtra("skor2", 0);
                    startActivity(intent);
                    finish();
                }else if(cikarma.isChecked()){
                    CharSequence charSequence = "-";
                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                    intent.putExtra("islem", charSequence); //edittextin üzerindeki yazıyı bununla yolluyoruz
                    intent.putExtra("seviye", gelenYazi2);
                    startActivity(intent);
                    finish();
                }else if (carpma.isChecked()){
                    CharSequence charSequence = "*";
                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                    intent.putExtra("islem", charSequence); //edittextin üzerindeki yazıyı bununla yolluyoruz
                    intent.putExtra("seviye", gelenYazi2);
                    startActivity(intent);
                    finish();
                }else if(bolme.isChecked()){
                    CharSequence charSequence = "/";
                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                    intent.putExtra("islem", charSequence); //edittextin üzerindeki yazıyı bununla yolluyoruz
                    intent.putExtra("seviye", gelenYazi2);
                    startActivity(intent);
                    finish();
                }

            }
        });

    }
}
