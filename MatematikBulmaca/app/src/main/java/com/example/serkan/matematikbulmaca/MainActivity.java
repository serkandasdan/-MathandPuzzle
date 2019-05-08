package com.example.serkan.matematikbulmaca;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

Button btn1;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btnoyun);
        btn2 = (Button) findViewById(R.id.btnnasil);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        }
        );

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Nasıl Oynanır ?");
                builder.setIcon(android.R.drawable.ic_dialog_info);
                builder.setMessage("Oyun 2 kişilik oynanan bir oyundur. Seviyesine göre Kolay, Orta, Zor seçenekleri kullanıcıya sunulmuştur. " +
                        " Oyunun amacı en kısa sürede rakibinden önce puanı kapmak ve oyunu kazanmaktır. " +
                        "4 işlemden herhangi birini seçerek oyuna başlayabilir ve oynayabilirsiniz. Bizi tercih ettiğiniz için teşekkür ederiz. " +
                        "Oyun sahibi : Serkan DAŞDAN");
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}


