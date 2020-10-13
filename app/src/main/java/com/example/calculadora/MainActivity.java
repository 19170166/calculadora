package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    double numero1=0.0,numero2=0.0,resultado=0.0;
    boolean lleno=false;
    String valor;
    int operacion=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView pant=(TextView) findViewById(R.id.pantalla);
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
        Button botonigual=(Button)findViewById(R.id.btnigual);
        Button botonpor=(Button)findViewById(R.id.btnx);
        Button botonmenos=(Button)findViewById(R.id.btnmenos);
        Button botonmas=(Button)findViewById(R.id.btnmas);
        Button botondiv=(Button)findViewById(R.id.btndiv);
        Button botonac=(Button)findViewById(R.id.btnac);
    }


    public void onclockbtnac(View v){
        TextView tx=(TextView)findViewById(R.id.pantalla);
        tx.setText("0");
        lleno=false;numero1=0.0;numero2=0.0;
    }
    public void onclickbtn1(View v){
        TextView tx = (TextView)findViewById(R.id.pantalla);
                tx.setText(tx.getText()+"1");
    }
    public void onclickbtn2(View v){
        TextView tx = (TextView)findViewById(R.id.pantalla);
        tx.setText(tx.getText()+"2");
    }
    public void onclickbtn3(View v){
        TextView tx = (TextView)findViewById(R.id.pantalla);
        tx.setText(tx.getText()+"3");
    }
    public void onclickbtn4(View v){
        TextView tx = (TextView)findViewById(R.id.pantalla);
        tx.setText(tx.getText()+"4");
    }
    public void onclickbtn5(View v){
        TextView tx = (TextView)findViewById(R.id.pantalla);
        tx.setText(tx.getText()+"5");
    }
    public void onclickbtn6(View v){
        TextView tx = (TextView)findViewById(R.id.pantalla);
        tx.setText(tx.getText()+"6");
    }
    public void onclickbtn7(View v){
        TextView tx = (TextView)findViewById(R.id.pantalla);
        tx.setText(tx.getText()+"7");
    }
    public void onclickbtn8(View v){
        TextView tx = (TextView)findViewById(R.id.pantalla);
        tx.setText(tx.getText()+"8");
    }
    public void onclickbtn9(View v){
        TextView tx = (TextView)findViewById(R.id.pantalla);
        tx.setText(tx.getText()+"9");
    }
    public void onclickbtn0(View v){
        TextView tx=(TextView)findViewById(R.id.pantalla);
        tx.setText(tx.getText()+"0");
    }
    public void onclickbtnpunto(View v){
        TextView tx = (TextView)findViewById(R.id.pantalla);
        tx.setText(tx.getText()+".");
    }
    public void onclickbtnmas(View v){
        TextView tx = (TextView)findViewById(R.id.pantalla);
        if (lleno=false){
            numero1=Double.parseDouble(tx.getText().toString());
            lleno=true;
        }
        /*else if(lleno=true){
            numero2=Double.parseDouble(tx.getText().toString());
        }*/
        operacion=1;
        tx.setText("0");
        //tx.setText(tx.getText()+"+");
    }
    public void onclickbtnmenos(View v){
        TextView tx = (TextView)findViewById(R.id.pantalla);
        if (lleno=false){
            numero1=Double.parseDouble(tx.getText().toString());
            lleno=true;
        }
        /*else if(lleno=true){
            numero2=Double.parseDouble(tx.getText().toString());
        }*/
        operacion=2;
        tx.setText("0");
        //tx.setText(tx.getText()+"-");
    }
    public void onclickbtndiv(View v){
        TextView tx = (TextView)findViewById(R.id.pantalla);
        if (lleno=false){
            numero1=Double.parseDouble(tx.getText().toString());
            lleno=true;
        }
        /*else if(lleno=true){
            numero2=Double.parseDouble(tx.getText().toString());
        }*/
        operacion=3;
        tx.setText("0");
        //tx.setText(tx.getText()+"/");
    }
    public void onclickbtnx(View v){
        TextView tx=(TextView)findViewById(R.id.pantalla);
        if (lleno=false){
            numero1=Double.parseDouble(tx.getText().toString());
            lleno=true;
        }
        /*else if(lleno=true){
            numero2=Double.parseDouble(tx.getText().toString());
        }*/
        operacion=4;
        tx.setText("0");
        //tx.setText(tx.getText()+"x");
    }
    public void onckickbtnigual(View v){
        TextView tx=(TextView)findViewById(R.id.pantalla);
        if(operacion==1){
            if(lleno=true){
                numero2=Double.parseDouble(tx.getText().toString());
            }
            resultado=numero1+numero2;
            numero1=resultado;
            //tx=(TextView)findViewById(R.id.pantalla);
            //valor=Double.toString(resultado);
            tx.setText(Double.toString(resultado));
        }
        if(operacion==2){
            if(lleno=true){
                numero2=Double.parseDouble(tx.getText().toString());
            }
            resultado=numero1-numero2;
            numero1=resultado;
            //tx=(TextView)findViewById(R.id.pantalla);
            tx.setText(Double.toString(resultado));
        }
        if(operacion==3){
            if(lleno=true){
                numero2=Double.parseDouble(tx.getText().toString());
            }
            resultado=numero1/numero2;
            numero1=resultado;
            //tx=(TextView)findViewById(R.id.pantalla);
            tx.setText(Double.toString(resultado));
        }
        if(operacion==4){
            if(lleno=true){
                numero2=Double.parseDouble(tx.getText().toString());
            }
            resultado=numero1*numero2;
            numero1=resultado;
            //tx=(TextView)findViewById(R.id.pantalla);
            tx.setText(Double.toString(resultado));
        }

    }

}
