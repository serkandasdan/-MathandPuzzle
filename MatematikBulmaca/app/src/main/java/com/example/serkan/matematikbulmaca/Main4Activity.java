package com.example.serkan.matematikbulmaca;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.StringTokenizer;

public class Main4Activity extends AppCompatActivity {
    Button btn1ilk,btn1orta,btn1son,btn2ilk,btn2orta,btn2son,btn1soru,btn2soru,btn1puan,btn2puan;
    int skor1=0,skor2=0;
    int sayi1,sayi2,sayi3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Bundle gelenVeri2=getIntent().getExtras(); //gelen veriyi almak için
        CharSequence gelenYazi=gelenVeri2.getCharSequence("islem");
        CharSequence gelenYazi2=gelenVeri2.getCharSequence("seviye");
        skor1=gelenVeri2.getInt("skor1");
        skor2=gelenVeri2.getInt("skor2");
        final String gelenYazi3= (String) gelenYazi;
        String gelenYazi4= (String) gelenYazi2;

        btn1ilk = (Button) findViewById(R.id.btn1ilk);
        btn1orta = (Button) findViewById(R.id.btn1orta);
        btn1son = (Button) findViewById(R.id.btn1son);
        btn2ilk = (Button) findViewById(R.id.btn2ilk);
        btn2orta = (Button) findViewById(R.id.btn2orta);
        btn2son = (Button) findViewById(R.id.btn2son);
        btn1soru = (Button) findViewById(R.id.btn1soru);
        btn2soru = (Button) findViewById(R.id.btn2soru);
        btn1puan = (Button) findViewById(R.id.btn1puan);
        btn2puan = (Button) findViewById(R.id.btn2puan);

        final Random rnd = new Random();

        btn1puan.setText(skor1+"");
        btn2puan.setText(skor2+"");

        if(btn1puan.getText().equals("10")){
            CharSequence charSequence = "1";
            Intent intent = new Intent(getApplicationContext(), Main5Activity.class); // bu şekilde son ekrana geçiyoruz
            intent.putExtra("sonuc", charSequence); //edittextin üzerindeki yazıyı bununla yolluyoruz
            startActivity(intent);
            finish();
        }
        else if (btn2puan.getText().equals("10")) {

            CharSequence charSequence = "2";
            Intent intent = new Intent(getApplicationContext(), Main5Activity.class); // bu şekilde son ekrana geçiyoruz
            intent.putExtra("sonuc", charSequence); //edittextin üzerindeki yazıyı bununla yolluyoruz
            startActivity(intent);
            finish();

        }

        switch (gelenYazi4){

            case "1":

                sayi1 = rnd.nextInt(10)+1;
                sayi2 = rnd.nextInt(10)+1;
                sayi3 = rnd.nextInt(3)+1;

                switch (gelenYazi3){

                    case "+":
                        int toplam=sayi1+sayi2;
                        btn1soru.setText(sayi1+" + "+sayi2);
                        btn2soru.setText(sayi1+" + "+sayi2);

                        if(sayi3==1){
                            btn1orta.setText(toplam+"");
                            btn2orta.setText(toplam+"");
                            btn1ilk.setText(toplam+sayi3+"");
                            btn2ilk.setText(toplam+sayi3+"");
                            btn1son.setText(Math.abs(toplam-sayi3)+"");
                            btn2son.setText(Math.abs(toplam-sayi3)+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                  if(skor1>0)
                                    skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        else if (sayi3==2) {
                            btn1son.setText(toplam+"");
                            btn2son.setText(toplam+"");
                            btn1ilk.setText(toplam+sayi3+"");
                            btn2ilk.setText(toplam+sayi3+"");
                            btn1orta.setText(Math.abs(toplam-sayi3)+"");
                            btn2orta.setText(Math.abs(toplam-sayi3)+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        else {
                            btn1ilk.setText(toplam+"");
                            btn2ilk.setText(toplam+"");
                            btn1orta.setText(toplam+sayi3+"");
                            btn2orta.setText(toplam+sayi3+"");
                            btn1son.setText(Math.abs(toplam-sayi3)+"");
                            btn2son.setText(Math.abs(toplam-sayi3)+"");

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });


                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                        break;

                    case "-":
                        int cıkarma=sayi1-sayi2;
                        btn1soru.setText(sayi1+" - "+sayi2);
                        btn2soru.setText(sayi1+" - "+sayi2);
                        if(sayi3==1){
                            btn1orta.setText(cıkarma+"");
                            btn2orta.setText(cıkarma+"");
                            btn1ilk.setText(cıkarma+sayi3+"");
                            btn2ilk.setText(cıkarma+sayi3+"");
                            btn1son.setText(cıkarma-sayi3+"");
                            btn2son.setText(cıkarma-sayi3+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                        }
                        else if (sayi3==2) {
                            btn1son.setText(cıkarma+"");
                            btn2son.setText(cıkarma+"");
                            btn1ilk.setText(cıkarma+sayi3+"");
                            btn2ilk.setText(cıkarma+sayi3+"");
                            btn1orta.setText(cıkarma-sayi3+"");
                            btn2orta.setText(cıkarma-sayi3+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }

                        else {
                            btn1ilk.setText(cıkarma+"");
                            btn2ilk.setText(cıkarma+"");
                            btn1orta.setText(cıkarma+sayi3+"");
                            btn2orta.setText(cıkarma+sayi3+"");
                            btn1son.setText(cıkarma-sayi3+"");
                            btn2son.setText(cıkarma-sayi3+"");

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });


                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                        break;
                    case "*":
                        sayi2 = rnd.nextInt(3)+1;
                        int carpma=sayi1*sayi2;
                        btn1soru.setText(sayi1+" x "+sayi2);
                        btn2soru.setText(sayi1+" x "+sayi2);

                        if(sayi3==1){
                            btn1orta.setText(carpma+"");
                            btn2orta.setText(carpma+"");
                            btn1ilk.setText(carpma+sayi3+"");
                            btn2ilk.setText(carpma+sayi3+"");
                            btn1son.setText(carpma-sayi3+"");
                            btn2son.setText(carpma-sayi3+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                        }
                        else if (sayi3==2) {
                            btn1son.setText(carpma+"");
                            btn2son.setText(carpma+"");
                            btn1ilk.setText(carpma+sayi3+"");
                            btn2ilk.setText(carpma+sayi3+"");
                            btn1orta.setText(carpma-sayi3+"");
                            btn2orta.setText(carpma-sayi3+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }

                        else {
                            btn1ilk.setText(carpma+"");
                            btn2ilk.setText(carpma+"");
                            btn1orta.setText(carpma+sayi3+"");
                            btn2orta.setText(carpma+sayi3+"");
                            btn1son.setText(carpma-sayi3+"");
                            btn2son.setText(carpma-sayi3+"");

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });


                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "1");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                        break;
                    case "/":
                        while (sayi1%sayi2!=0) {
                            sayi1 = rnd.nextInt(10) + 1;
                            sayi2 = rnd.nextInt(10) + 1;
                        }
                            int bolme=sayi1/sayi2;
                            btn1soru.setText(sayi1+" / "+sayi2);
                            btn2soru.setText(sayi1+" / "+sayi2);

                            if(sayi3==1){
                                btn1orta.setText(bolme+"");
                                btn2orta.setText(bolme+"");
                                btn1ilk.setText(bolme+sayi3+"");
                                btn2ilk.setText(bolme+sayi3+"");
                                btn1son.setText(bolme-sayi3+"");
                                btn2son.setText(bolme-sayi3+"");

                                btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                        return false;
                                    }
                                });

                                btn1ilk.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(skor1>0)
                                            skor1--;
                                        btn1puan.setText(skor1+"");
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    }
                                });

                                btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                        return false;
                                    }
                                });
                                btn2ilk.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(skor2>0)
                                            skor2--;
                                        btn2puan.setText(skor2+"");
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    }
                                });

                                btn1son.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                        return false;
                                    }
                                });
                                btn1son.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(skor1>0)
                                            skor1--;
                                        btn1puan.setText(skor1+"");
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    }
                                });

                                btn2son.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                        return false;
                                    }
                                });
                                btn2son.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(skor2>0)
                                            skor2--;
                                        btn2puan.setText(skor2+"");
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    }
                                });

                                btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                        return false;
                                    }
                                });

                                btn1orta.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        skor1++;
                                        btn1puan.setText(skor1+"");
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                        Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                        intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                        intent.putExtra("seviye", "1");
                                        intent.putExtra("skor1", skor1);
                                        intent.putExtra("skor2", skor2);
                                        startActivity(intent);
                                        finish();
                                    }
                                });

                                btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                        return false;
                                    }
                                });

                                btn2orta.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        skor2++;
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                        btn2puan.setText(skor2+"");
                                        Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                        intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                        intent.putExtra("seviye", "1");
                                        intent.putExtra("skor1", skor1);
                                        intent.putExtra("skor2", skor2);
                                        startActivity(intent);
                                        finish();
                                    }
                                });

                            }
                            else if (sayi3==2) {
                                btn1son.setText(bolme+"");
                                btn2son.setText(bolme+"");
                                btn1ilk.setText(bolme+sayi3+"");
                                btn2ilk.setText(bolme+sayi3+"");
                                btn1orta.setText(bolme-sayi3+"");
                                btn2orta.setText(bolme-sayi3+"");

                                btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                        return false;
                                    }
                                });

                                btn1ilk.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(skor1>0)
                                            skor1--;
                                        btn1puan.setText(skor1+"");
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    }
                                });

                                btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                        return false;
                                    }
                                });
                                btn2ilk.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(skor2>0)
                                            skor2--;
                                        btn2puan.setText(skor2+"");
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    }
                                });

                                btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                        return false;
                                    }
                                });

                                btn1orta.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(skor1>0)
                                            skor1--;
                                        btn1puan.setText(skor1+"");
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    }
                                });

                                btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                        return false;
                                    }
                                });
                                btn2orta.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(skor2>0)
                                            skor2--;
                                        btn2puan.setText(skor2+"");
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    }
                                });

                                btn1son.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                        return false;
                                    }
                                });

                                btn1son.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        skor1++;
                                        btn1puan.setText(skor1+"");
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                        Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                        intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                        intent.putExtra("seviye", "1");
                                        intent.putExtra("skor1", skor1);
                                        intent.putExtra("skor2", skor2);
                                        startActivity(intent);
                                        finish();
                                    }
                                });
                                btn2son.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                        return false;
                                    }
                                });
                                btn2son.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        skor2++;
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                        btn2puan.setText(skor2+"");
                                        Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                        intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                        intent.putExtra("seviye", "1");
                                        intent.putExtra("skor1", skor1);
                                        intent.putExtra("skor2", skor2);
                                        startActivity(intent);
                                        finish();
                                    }
                                });
                            }

                            else {
                                btn1ilk.setText(bolme+"");
                                btn2ilk.setText(bolme+"");
                                btn1orta.setText(bolme+sayi3+"");
                                btn2orta.setText(bolme+sayi3+"");
                                btn1son.setText(bolme-sayi3+"");
                                btn2son.setText(bolme-sayi3+"");

                                btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                        return false;
                                    }
                                });

                                btn1orta.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(skor1>0)
                                            skor1--;
                                        btn1puan.setText(skor1+"");
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    }
                                });

                                btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                        return false;
                                    }
                                });
                                btn2orta.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(skor2>0)
                                            skor2--;
                                        btn2puan.setText(skor2+"");
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    }
                                });


                                btn1son.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                        return false;
                                    }
                                });
                                btn1son.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(skor1>0)
                                            skor1--;
                                        btn1puan.setText(skor1+"");
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    }
                                });

                                btn2son.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                        return false;
                                    }
                                });
                                btn2son.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        if(skor2>0)
                                            skor2--;
                                        btn2puan.setText(skor2+"");
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    }
                                });

                                btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                        return false;
                                    }
                                });

                                btn1ilk.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        skor1++;
                                        btn1puan.setText(skor1+"");
                                        btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                        Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                        intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                        intent.putExtra("seviye", "1");
                                        intent.putExtra("skor1", skor1);
                                        intent.putExtra("skor2", skor2);
                                        startActivity(intent);
                                        finish();
                                    }
                                });
                                btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                    @Override
                                    public boolean onTouch(View v, MotionEvent event) {
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                        return false;
                                    }
                                });

                                btn2ilk.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        skor2++;
                                        btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                        btn2puan.setText(skor2+"");
                                        Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                        intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                        intent.putExtra("seviye", "1");
                                        intent.putExtra("skor1", skor1);
                                        intent.putExtra("skor2", skor2);
                                        startActivity(intent);
                                        finish();
                                    }
                                });
                            }
                        break;
                    default:
                        break;
                }
                break;

            case "2":
                sayi1 = rnd.nextInt(50)+10;
                sayi2 = rnd.nextInt(50)+10;
                sayi3 = rnd.nextInt(20)+1;
                switch (gelenYazi3){
                    case "+":
                        int toplam=sayi1+sayi2;
                        btn1soru.setText(sayi1+" + "+sayi2);
                        btn2soru.setText(sayi1+" + "+sayi2);

                        if(sayi3==1){
                            btn1orta.setText(toplam+"");
                            btn2orta.setText(toplam+"");
                            btn1ilk.setText(toplam+sayi3+"");
                            btn2ilk.setText(toplam+sayi3+"");
                            btn1son.setText(Math.abs(toplam-sayi3)+"");
                            btn2son.setText(Math.abs(toplam-sayi3)+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        else if (sayi3==2) {
                            btn1son.setText(toplam+"");
                            btn2son.setText(toplam+"");
                            btn1ilk.setText(toplam+sayi3+"");
                            btn2ilk.setText(toplam+sayi3+"");
                            btn1orta.setText(Math.abs(toplam-sayi3)+"");
                            btn2orta.setText(Math.abs(toplam-sayi3)+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        else {
                            btn1ilk.setText(toplam+"");
                            btn2ilk.setText(toplam+"");
                            btn1orta.setText(toplam+sayi3+"");
                            btn2orta.setText(toplam+sayi3+"");
                            btn1son.setText(Math.abs(toplam-sayi3)+"");
                            btn2son.setText(Math.abs(toplam-sayi3)+"");

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });


                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                        break;
                    case "-":
                        int cıkarma=sayi1-sayi2;
                        btn1soru.setText(sayi1+" - "+sayi2);
                        btn2soru.setText(sayi1+" - "+sayi2);
                        if(sayi3==1){
                            btn1orta.setText(cıkarma+"");
                            btn2orta.setText(cıkarma+"");
                            btn1ilk.setText(cıkarma+sayi3+"");
                            btn2ilk.setText(cıkarma+sayi3+"");
                            btn1son.setText(cıkarma-sayi3+"");
                            btn2son.setText(cıkarma-sayi3+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                        }
                        else if (sayi3==2) {
                            btn1son.setText(cıkarma+"");
                            btn2son.setText(cıkarma+"");
                            btn1ilk.setText(cıkarma+sayi3+"");
                            btn2ilk.setText(cıkarma+sayi3+"");
                            btn1orta.setText(cıkarma-sayi3+"");
                            btn2orta.setText(cıkarma-sayi3+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }

                        else {
                            btn1ilk.setText(cıkarma+"");
                            btn2ilk.setText(cıkarma+"");
                            btn1orta.setText(cıkarma+sayi3+"");
                            btn2orta.setText(cıkarma+sayi3+"");
                            btn1son.setText(cıkarma-sayi3+"");
                            btn2son.setText(cıkarma-sayi3+"");

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });


                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                        break;
                    case "*":
                        sayi1 = rnd.nextInt(10)+3;
                        sayi2 = rnd.nextInt(6)+2;
                        int carpma=sayi1*sayi2;
                        btn1soru.setText(sayi1+" x "+sayi2);
                        btn2soru.setText(sayi1+" x "+sayi2);

                        if(sayi3==1){
                            btn1orta.setText(carpma+"");
                            btn2orta.setText(carpma+"");
                            btn1ilk.setText(carpma+sayi1+"");
                            btn2ilk.setText(carpma+sayi1+"");
                            btn1son.setText(carpma-sayi1+"");
                            btn2son.setText(carpma-sayi1+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                        }
                        else if (sayi3==2) {
                            btn1son.setText(carpma+"");
                            btn2son.setText(carpma+"");
                            btn1ilk.setText(carpma+sayi1+"");
                            btn2ilk.setText(carpma+sayi1+"");
                            btn1orta.setText(carpma-sayi1+"");
                            btn2orta.setText(carpma-sayi1+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }

                        else {
                            btn1ilk.setText(carpma+"");
                            btn2ilk.setText(carpma+"");
                            btn1orta.setText(carpma+sayi1+"");
                            btn2orta.setText(carpma+sayi1+"");
                            btn1son.setText(carpma-sayi1+"");
                            btn2son.setText(carpma-sayi1+"");

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });


                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                        break;
                    case "/":
                        while (sayi1%sayi2!=0) {
                            sayi1 = rnd.nextInt(50) + 1;
                            sayi2 = rnd.nextInt(10) + 3;
                            sayi3 = rnd.nextInt(3) + 1;
                        }
                        int bolme=sayi1/sayi2;
                        btn1soru.setText(sayi1+" / "+sayi2);
                        btn2soru.setText(sayi1+" / "+sayi2);

                        if(sayi3==1){
                            btn1orta.setText(bolme+"");
                            btn2orta.setText(bolme+"");
                            btn1ilk.setText(bolme+sayi3+"");
                            btn2ilk.setText(bolme+sayi3+"");
                            btn1son.setText(bolme-sayi3+"");
                            btn2son.setText(bolme-sayi3+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                        }
                        else if (sayi3==2) {
                            btn1son.setText(bolme+"");
                            btn2son.setText(bolme+"");
                            btn1ilk.setText(bolme+sayi3+"");
                            btn2ilk.setText(bolme+sayi3+"");
                            btn1orta.setText(bolme-sayi3+"");
                            btn2orta.setText(bolme-sayi3+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }

                        else {
                            btn1ilk.setText(bolme+"");
                            btn2ilk.setText(bolme+"");
                            btn1orta.setText(bolme+sayi3+"");
                            btn2orta.setText(bolme+sayi3+"");
                            btn1son.setText(bolme-sayi3+"");
                            btn2son.setText(bolme-sayi3+"");

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });


                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "2");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                        break;
                    default:
                        break;
                }
                break;

            case "3":
                sayi1 = rnd.nextInt(100)+30;
                sayi2 = rnd.nextInt(70)+20;
                sayi3 = rnd.nextInt(3)+1;
                int sayi4 = rnd.nextInt(2)+1;
                switch (gelenYazi3){
                    case "+":
                        int toplam=sayi1+sayi2;
                        btn1soru.setText(sayi1+" + "+sayi2);
                        btn2soru.setText(sayi1+" + "+sayi2);

                        if(sayi3==1){
                            btn1orta.setText(toplam+"");
                            btn2orta.setText(toplam+"");
                            btn1ilk.setText(toplam+sayi3+"");
                            btn2ilk.setText(toplam+sayi3+"");
                            btn1son.setText(Math.abs(toplam-(sayi4*10))+"");
                            btn2son.setText(Math.abs(toplam-(sayi4*10))+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        else if (sayi3==2) {
                            btn1son.setText(toplam+"");
                            btn2son.setText(toplam+"");
                            btn1ilk.setText(toplam+sayi3+"");
                            btn2ilk.setText(toplam+sayi3+"");
                            btn1orta.setText(toplam-(sayi4*10)+"");
                            btn2orta.setText(toplam-(sayi4*10)+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        else {
                            btn1ilk.setText(toplam+"");
                            btn2ilk.setText(toplam+"");
                            btn1orta.setText(toplam+sayi3+"");
                            btn2orta.setText(toplam+sayi3+"");
                            btn1son.setText(Math.abs(toplam-(sayi3*10))+"");
                            btn2son.setText(Math.abs(toplam-(sayi3*10))+"");

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });


                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "+"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                        break;
                    case "-":
                        int cıkarma=sayi1-sayi2;
                        btn1soru.setText(sayi1+" - "+sayi2);
                        btn2soru.setText(sayi1+" - "+sayi2);
                        if(sayi3==1){
                            btn1orta.setText(cıkarma+"");
                            btn2orta.setText(cıkarma+"");
                            btn1ilk.setText(cıkarma+sayi3+"");
                            btn2ilk.setText(cıkarma+sayi3+"");
                            btn1son.setText(cıkarma-sayi3+"");
                            btn2son.setText(cıkarma-sayi3+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                        }
                        else if (sayi3==2) {
                            btn1son.setText(cıkarma+"");
                            btn2son.setText(cıkarma+"");
                            btn1ilk.setText(cıkarma+sayi3+"");
                            btn2ilk.setText(cıkarma+sayi3+"");
                            btn1orta.setText(cıkarma-sayi3+"");
                            btn2orta.setText(cıkarma-sayi3+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }

                        else {
                            btn1ilk.setText(cıkarma+"");
                            btn2ilk.setText(cıkarma+"");
                            btn1orta.setText(cıkarma+sayi3+"");
                            btn2orta.setText(cıkarma+sayi3+"");
                            btn1son.setText(cıkarma-sayi3+"");
                            btn2son.setText(cıkarma-sayi3+"");

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });


                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "-"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                        break;
                    case "*":
                        sayi1 = rnd.nextInt(15)+6;
                        sayi2 = rnd.nextInt(10)+4;
                        int carpma=sayi1*sayi2;
                        btn1soru.setText(sayi1+" x "+sayi2);
                        btn2soru.setText(sayi1+" x "+sayi2);

                        if(sayi3==1){
                            btn1orta.setText(carpma+"");
                            btn2orta.setText(carpma+"");
                            btn1ilk.setText(carpma+(sayi4*2)+"");
                            btn2ilk.setText(carpma+sayi2+"");
                            btn1son.setText(carpma-sayi1+"");
                            btn2son.setText(carpma-sayi1+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                        }
                        else if (sayi3==2) {
                            btn1son.setText(carpma+"");
                            btn2son.setText(carpma+"");
                            btn1ilk.setText(carpma+sayi2+"");
                            btn2ilk.setText(carpma+sayi2+"");
                            btn1orta.setText(carpma-sayi1+"");
                            btn2orta.setText(carpma-sayi1+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }

                        else {
                            btn1ilk.setText(carpma+"");
                            btn2ilk.setText(carpma+"");
                            btn1orta.setText(carpma+sayi2+"");
                            btn2orta.setText(carpma+sayi2+"");
                            btn1son.setText(carpma-sayi1+"");
                            btn2son.setText(carpma-sayi1+"");

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });


                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "*"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                        break;
                    case "/":
                        while (sayi1%sayi2!=0) {
                            sayi1 = rnd.nextInt(100) + 20;
                            sayi2 = rnd.nextInt(10) + 5;
                            sayi3 = rnd.nextInt(3) + 1;
                        }
                        int bolme=sayi1/sayi2;
                        btn1soru.setText(sayi1+" / "+sayi2);
                        btn2soru.setText(sayi1+" / "+sayi2);

                        if(sayi3==1){
                            btn1orta.setText(bolme+"");
                            btn2orta.setText(bolme+"");
                            btn1ilk.setText(bolme+sayi3+"");
                            btn2ilk.setText(bolme+sayi3+"");
                            btn1son.setText(bolme-sayi3+"");
                            btn2son.setText(bolme-sayi3+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });

                        }
                        else if (sayi3==2) {
                            btn1son.setText(bolme+"");
                            btn2son.setText(bolme+"");
                            btn1ilk.setText(bolme+sayi3+"");
                            btn2ilk.setText(bolme+sayi3+"");
                            btn1orta.setText(bolme-sayi3+"");
                            btn2orta.setText(bolme-sayi3+"");

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }

                        else {
                            btn1ilk.setText(bolme+"");
                            btn2ilk.setText(bolme+"");
                            btn1orta.setText(bolme+sayi3+"");
                            btn2orta.setText(bolme+sayi3+"");
                            btn1son.setText(bolme-sayi3+"");
                            btn2son.setText(bolme-sayi3+"");

                            btn1orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });

                            btn1orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2orta.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2orta.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });


                            btn1son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn1son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor1>0)
                                        skor1--;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn2son.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.redshapebutton));
                                    return false;
                                }
                            });
                            btn2son.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    if(skor2>0)
                                        skor2--;
                                    btn2puan.setText(skor2+"");
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                }
                            });

                            btn1ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn1ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor1++;
                                    btn1puan.setText(skor1+"");
                                    btn1puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                            btn2ilk.setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public boolean onTouch(View v, MotionEvent event) {
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.greenshapebutton));
                                    return false;
                                }
                            });

                            btn2ilk.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    skor2++;
                                    btn2puan.setBackgroundDrawable(getResources().getDrawable(R.drawable.oyunicigorsel));
                                    btn2puan.setText(skor2+"");
                                    Intent intent = new Intent(getApplicationContext(), Main4Activity.class); // bu şekilde son ekrana geçiyoruz
                                    intent.putExtra("islem", "/"); //edittextin üzerindeki yazıyı bununla yolluyoruz
                                    intent.putExtra("seviye", "3");
                                    intent.putExtra("skor1", skor1);
                                    intent.putExtra("skor2", skor2);
                                    startActivity(intent);
                                    finish();
                                }
                            });
                        }
                        break;
                    default:
                        break;
                }
                break;
                    default:
                        break;
                }

        }

    }

