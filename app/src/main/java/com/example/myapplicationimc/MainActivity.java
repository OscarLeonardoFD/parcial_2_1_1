package com.example.myapplicationimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private View.OnClickListener okListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            operacion ();

        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calcular=(Button) findViewById(R.id.button);
        calcular.setOnClickListener(okListener);

    }
    private void operacion(){
        EditText ingreso = (EditText) findViewById(R.id.editTextNumberDecimal);

        try{
            float costo = Float.parseFloat(ingreso.getText().toString());
            double iva = costo * (0.16);
            double preciototal = costo+iva;

            TextView ivaview =(TextView) findViewById(R.id.textView4);
            ivaview.setText("el iva del producto es : "+ iva );

            TextView precioview=(TextView) findViewById(R.id.textView3);
            precioview.setText("el precio del producto es "+ preciototal);
        } catch(Exception e){
            TextView ivaview =(TextView) findViewById(R.id.textView4);
            ivaview.setText("    ");

            TextView precioview=(TextView) findViewById(R.id.textView3);
            precioview.setText("ingrese solo numeros     ");
        }




    }
}