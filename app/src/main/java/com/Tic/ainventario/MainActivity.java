package com.Tic.ainventario;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    boolean cargado = false;
    boolean ingresado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargado= true;
        Tready();
        ingresado = false;
    }
    public void  Tready(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                cargado=true;
            }
        }, 3000);
        if (cargado)
        {
            findViewById(R.id.Tbienbenida).setVisibility(View.INVISIBLE);
            findViewById(R.id.Bcontinuar).setEnabled(true);
            findViewById(R.id.Bcontinuar).setVisibility(View.VISIBLE);
        }
    }
    public void Ppasar0 (View a){
        setContentView(R.layout.activity_main);
    }

    public void Ppasar1 (View a){
        setContentView(R.layout.aceder);
    }

    public void Ppasar2n (View a){
        ingresado=true;
        setContentView(R.layout.list);
    }
    public void Ppasar2y (View a){
        ingresado=false;
        setContentView(R.layout.list);
    }

}