package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    double numero=0.0,numero2=0.0,resultado=0.0,resultado2=0.0;
    boolean lleno=false;
    String mostrar,valor;
    int operacion=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView pant=(TextView) findViewById(R.id.pantalla);
        Button boton1=(Button)findViewById(R.id.btn1);
        Button boton2=(Button)findViewById(R.id.btn2);
        Button boton3=(Button)findViewById(R.id.btn3);
        Button boton4=(Button)findViewById(R.id.btn4);
        Button boton5=(Button)findViewById(R.id.btn5);
        Button boton6=(Button)findViewById(R.id.btn6);
        Button boton7=(Button)findViewById(R.id.btn7);
        Button boton8=(Button)findViewById(R.id.btn8);
        Button boton9=(Button)findViewById(R.id.btn9);
        Button boton0=(Button)findViewById(R.id.btn0);
        Button botonpunto=(Button)findViewById(R.id.btn_p);
        Button botonigual=(Button)findViewById(R.id.btnigual);
        Button botonpor=(Button)findViewById(R.id.btnx);
        Button botonmenos=(Button)findViewById(R.id.btnmenos);
        Button botonmas=(Button)findViewById(R.id.btnmas);
        Button botondiv=(Button)findViewById(R.id.btndiv);
        Button botonac=(Button)findViewById(R.id.btnac);
        Button botoninvertir=(Button)findViewById(R.id.btnm_m);
        Button botonporcentaje=(Button)findViewById(R.id.btnporcentaje);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=pant.getText().toString()+"1";
                pant.setText(mostrar);
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=pant.getText().toString()+"2";
                pant.setText(mostrar);
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=pant.getText().toString()+"3";
                pant.setText(mostrar);
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=pant.getText().toString()+"4";
                pant.setText(mostrar);
            }
        });
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=pant.getText().toString()+"5";
                pant.setText(mostrar);
            }
        });
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=pant.getText().toString()+"6";
                pant.setText(mostrar);
            }
        });
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=pant.getText().toString()+"7";
                pant.setText(mostrar);
            }
        });
        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=pant.getText().toString()+"8";
                pant.setText(mostrar);
            }
        });
        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=pant.getText().toString()+"9";
                pant.setText(mostrar);
            }
        });
        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=pant.getText().toString()+"0";
                pant.setText(mostrar);
            }
        });
        botonpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar=pant.getText().toString()+".";
                pant.setText(mostrar);
            }
        });
        botonmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pant.setText(" ");
                valor=mostrar;
                operacion=1;
            }
        });
        botonmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pant.setText(" ");
                valor=mostrar;
                operacion=2;
            }
        });
        botondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pant.setText(" ");
                valor=mostrar;
                operacion=3;
            }
        });
        botonpor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pant.setText(" ");
                valor=mostrar;
                operacion=4;
            }
        });
        botonac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pant.setText("0");
                numero=0;
                operacion=0;
                valor="";
            }
        });
        botoninvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero2=Double.parseDouble(pant.getText().toString())*-1;
                mostrar=String.valueOf(numero2);
                pant.setText(mostrar);
            }
        });
        botonporcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero2=Double.parseDouble(pant.getText().toString())/100;
                mostrar=String.valueOf(numero2);
                pant.setText(mostrar);
            }
        });
        botonigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion==1){
                    numero=Double.parseDouble(valor)+Double.parseDouble(pant.getText().toString());
                    mostrar=String.valueOf(numero);
                    pant.setText(mostrar);
                }
                if (operacion==2){
                    numero=Double.parseDouble(valor)-Double.parseDouble(pant.getText().toString());
                    mostrar=String.valueOf(numero);
                    pant.setText(mostrar);
                }
                if (operacion==3){
                    numero=Double.parseDouble(valor)/Double.parseDouble(pant.getText().toString());
                    mostrar=String.valueOf(numero);
                    pant.setText(mostrar);
                }
                if (operacion==4){
                    numero=Double.parseDouble(valor)*Double.parseDouble(pant.getText().toString());
                    mostrar=String.valueOf(numero);
                    pant.setText(mostrar);
                }
            }
        });
    }
}
