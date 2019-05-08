package com.example.serkan.matematikbulmaca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        final Button btn1anasayfa,btn2anasayfa;
        final TextView txt1,txt2;
        btn1anasayfa = (Button) findViewById(R.id.btndon1);
        btn2anasayfa = (Button) findViewById(R.id.btndon2);

        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);

        Bundle gelenVeri2=getIntent().getExtras(); //gelen veriyi almak için
        CharSequence gelenYazi=gelenVeri2.getCharSequence("sonuc");
        String gelenYazi2= (String) gelenYazi;

        btn1anasayfa.setVisibility(View.INVISIBLE);
        txt1.setVisibility(View.INVISIBLE);
        btn2anasayfa.setVisibility(View.INVISIBLE);
        txt2.setVisibility(View.INVISIBLE);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);



        switch (gelenYazi2){
            case "1":
                btn1anasayfa.setVisibility(View.VISIBLE);
                txt1.setVisibility(View.VISIBLE);
                txt1.startAnimation(animation);
                btn1anasayfa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Main5Activity.this,MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                });
                break;
            case "2":
                btn2anasayfa.setVisibility(View.VISIBLE);
                txt2.setVisibility(View.VISIBLE);
                btn1anasayfa.setVisibility(View.INVISIBLE);
                txt1.setVisibility(View.INVISIBLE);
                txt2.startAnimation(animation);
                btn2anasayfa.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Main5Activity.this,MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                });
                break;
                default:
                break;
        }
    }
}
