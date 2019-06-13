package com.example.marco.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Asignar lo que vamos usar
    private EditText edt1;
    private  EditText edt2;
    private  EditText edt3;
    private TextView tvres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Comunicacion con componentes
        edt1 = (EditText)findViewById(R.id.txt1);
        edt2 = (EditText)findViewById(R.id.txt2);
        edt3 = (EditText)findViewById(R.id.txt3);
        tvres = (TextView)findViewById(R.id.txtresultado);
    }
    //Este metodo realiza la operacion
    public void promedio(View v){
        String n1= edt1.getText().toString();
        String n2=edt2.getText().toString();
        String n3=edt3.getText().toString();
        //Cambiamos de un string a un valor entero
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        int num3 = Integer.parseInt(n3);

        int prom = (num1+num2+num3)/3;

        String result = String.valueOf(prom);
        tvres.setText(result);
    }
}
