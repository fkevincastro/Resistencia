package com.fkevincastro.resistencia;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button banda1,banda2, banda3, banda4,c0,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,reset;
    TextView ValR,Tol;
    int[] ValRes;


    int ColActual,BanActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ValRes=new int[3];
        setContentView(R.layout.activity_main);
        c0=findViewById(R.id.bC0);
        c1=findViewById(R.id.bC1);
        c2=findViewById(R.id.bC2);
        c3=findViewById(R.id.bC3);
        c4=findViewById(R.id.bC4);
        c5=findViewById(R.id.bC5);
        c6=findViewById(R.id.bC6);
        c7=findViewById(R.id.bC7);
        c8=findViewById(R.id.bC8);
        c9=findViewById(R.id.bC9);
        c10=findViewById(R.id.bC10);
        c11=findViewById(R.id.bC11);
        banda1=findViewById(R.id.bB1);
        banda2=findViewById(R.id.bB2);
        banda3=findViewById(R.id.bB3);
        banda4=findViewById(R.id.bB4);
        Tol=findViewById(R.id.tTol);
        ValR=findViewById(R.id.tValR);
        reset=findViewById(R.id.bRestart);







    }

    public void OnCalcularClicked(View view) {
        int valTotal;
        valTotal=ValRes[0]*10+ValRes[1];

        switch (ValRes[2]){
            case 0: ValR.setText(String.valueOf(valTotal)+"Ohms");
            break;
            case 1: ValR.setText(String.valueOf(valTotal)+"0 Ohms");
                break;
            case 2: ValR.setText(String.valueOf(valTotal)+"00 Ohms");
                break;
            case 3: ValR.setText(String.valueOf(valTotal)+" K Ohms");
                break;
            case 4: ValR.setText(String.valueOf(valTotal)+"0 K Ohms");
                break;
            case 5: ValR.setText(String.valueOf(valTotal)+"00 K Ohms");
                break;
            case 6: ValR.setText(String.valueOf(valTotal)+" M Ohms");
                break;
            case 7: ValR.setText(String.valueOf(valTotal)+"0 M Ohms");
                break;
            case 8: ValR.setText(String.valueOf(valTotal)+"00 M Ohms");
                break;
            case 9: ValR.setText(String.valueOf(valTotal)+" G Ohms");
                break;
            default:ValR.setText("Incorrecto...");
                break;


        }

    }

    public void OnColorButtomClicked(View view) {

        int id=view.getId();

        switch (id){
            case R.id.bC0: ColActual=0;
                break;
            case R.id.bC1: ColActual=1;

                break;
            case R.id.bC2: ColActual=2;
                break;
            case R.id.bC3: ColActual=3;
                break;
            case R.id.bC4: ColActual=4;
                break;
            case R.id.bC5: ColActual=5;
                break;
            case R.id.bC6: ColActual=6;
                break;
            case R.id.bC7: ColActual=7;
                break;
            case R.id.bC8: ColActual=8;
                break;
            case R.id.bC9: ColActual=9;
                break;
            case R.id.bC10: ColActual=10;
                break;
            case R.id.bC11: ColActual=11;
                break;
        }

        switch (BanActual){
            case 1:  LlevarColorBanda1();

                break;
            case 2: LlevarColorBanda2();
                break;
            case 3: LlevarColorBanda3();
                break;
            case 4: LlevarColorBanda4();
                break;

        }
    }
     public void LlevarColorBanda1(){

        ValRes[0]=ColActual;

        switch (ColActual){
            case 1: banda1.setBackground(c1.getBackground());

            break;
            case 2: banda1.setBackground(c2.getBackground());
                break;
            case 3: banda1.setBackground(c3.getBackground());
                break;
            case 4: banda1.setBackground(c4.getBackground());
                break;
            case 5: banda1.setBackground(c5.getBackground());
                break;
            case 6: banda1.setBackground(c6.getBackground());
                break;
            case 7: banda1.setBackground(c7.getBackground());
                break;
            case 8: banda1.setBackground(c8.getBackground());
                break;
            case 9: banda1.setBackground(c9.getBackground());
                break;
        }

     }
    public void LlevarColorBanda2(){
        ValRes[1]=ColActual;
        switch (ColActual){
            case 0: banda2.setBackground(c0.getBackground());
                break;
            case 1: banda2.setBackground(c1.getBackground());
                break;
            case 2: banda2.setBackground(c2.getBackground());
                break;
            case 3: banda2.setBackground(c3.getBackground());
                break;
            case 4: banda2.setBackground(c4.getBackground());
                break;
            case 5: banda2.setBackground(c5.getBackground());
                break;
            case 6: banda2.setBackground(c6.getBackground());
                break;
            case 7: banda2.setBackground(c7.getBackground());
                break;
            case 8: banda2.setBackground(c8.getBackground());
                break;
            case 9: banda2.setBackground(c9.getBackground());
                break;

        }

    }



    public void LlevarColorBanda3(){
        ValRes[2]=ColActual;
        switch (ColActual){
            case 0: banda3.setBackground(c0.getBackground());
                break;
            case 1: banda3.setBackground(c1.getBackground());
                break;
            case 2: banda3.setBackground(c2.getBackground());
                break;
            case 3: banda3.setBackground(c3.getBackground());
                break;
            case 4: banda3.setBackground(c4.getBackground());
                break;
            case 5: banda3.setBackground(c5.getBackground());
                break;
            case 6: banda3.setBackground(c6.getBackground());
                break;
            case 7: banda3.setBackground(c7.getBackground());
                break;
            case 8: banda3.setBackground(c8.getBackground());
                break;
            case 9: banda3.setBackground(c9.getBackground());
                break;
        }


    }
    public void LlevarColorBanda4(){
        switch (ColActual){
            case 10:banda4.setBackground(c10.getBackground());
                    Tol.setText("5%");
                break;
            case 11:banda4.setBackground(c11.getBackground());
                Tol.setText("10%");
                break;
        }

    }

    public void OnBanda1Clicked(View view) {
        BanActual=1;
        c0.setVisibility(View.GONE);
        c1.setVisibility(View.VISIBLE);
        c2.setVisibility(View.VISIBLE);
        c3.setVisibility(View.VISIBLE);
        c4.setVisibility(View.VISIBLE);
        c5.setVisibility(View.VISIBLE);
        c6.setVisibility(View.VISIBLE);
        c7.setVisibility(View.VISIBLE);
        c8.setVisibility(View.VISIBLE);
        c9.setVisibility(View.VISIBLE);
        c10.setVisibility(View.GONE);
        c11.setVisibility(View.GONE);
    }
    public void OnBanda2Clicked(View view) {
        BanActual=2;
        c0.setVisibility(View.VISIBLE);
        c1.setVisibility(View.VISIBLE);
        c2.setVisibility(View.VISIBLE);
        c3.setVisibility(View.VISIBLE);
        c4.setVisibility(View.VISIBLE);
        c5.setVisibility(View.VISIBLE);
        c6.setVisibility(View.VISIBLE);
        c7.setVisibility(View.VISIBLE);
        c8.setVisibility(View.VISIBLE);
        c9.setVisibility(View.VISIBLE);
        c10.setVisibility(View.GONE);
        c11.setVisibility(View.GONE);
    }
    public void OnBanda3Clicked(View view) {
        BanActual=3;
        c0.setVisibility(View.VISIBLE);
        c1.setVisibility(View.VISIBLE);
        c2.setVisibility(View.VISIBLE);
        c3.setVisibility(View.VISIBLE);
        c4.setVisibility(View.VISIBLE);
        c5.setVisibility(View.VISIBLE);
        c6.setVisibility(View.VISIBLE);
        c7.setVisibility(View.VISIBLE);
        c8.setVisibility(View.VISIBLE);
        c9.setVisibility(View.VISIBLE);
        c10.setVisibility(View.GONE);
        c11.setVisibility(View.GONE);
    }
    public void OnBanda4Clicked(View view) {
        BanActual=4;
        c0.setVisibility(View.GONE);
        c1.setVisibility(View.GONE);
        c2.setVisibility(View.GONE);
        c3.setVisibility(View.GONE);
        c4.setVisibility(View.GONE);
        c5.setVisibility(View.GONE);
        c6.setVisibility(View.GONE);
        c7.setVisibility(View.GONE);
        c8.setVisibility(View.GONE);
        c9.setVisibility(View.GONE);
        c10.setVisibility(View.VISIBLE);
        c11.setVisibility(View.VISIBLE);
    }



    public void OnResetClicked(View view) {
        ValRes[0]=0;
        ValRes[1]=0;
        ValRes[2]=2;
        c0.setVisibility(View.VISIBLE);
        c1.setVisibility(View.VISIBLE);
        c2.setVisibility(View.VISIBLE);
        c3.setVisibility(View.VISIBLE);
        c4.setVisibility(View.VISIBLE);
        c5.setVisibility(View.VISIBLE);
        c6.setVisibility(View.VISIBLE);
        c7.setVisibility(View.VISIBLE);
        c8.setVisibility(View.VISIBLE);
        c9.setVisibility(View.VISIBLE);
        c10.setVisibility(View.VISIBLE);
        c11.setVisibility(View.VISIBLE);
        banda1.setBackgroundColor(Color.GRAY);
        banda2.setBackgroundColor(Color.GRAY);
        banda3.setBackgroundColor(Color.GRAY);
        banda4.setBackgroundColor(Color.GRAY);
    }
}
