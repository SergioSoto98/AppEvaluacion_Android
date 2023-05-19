package com.example.evaluaralumno;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //CREAR VARIABLES CON LOS COMPONENES QUE VAMOS A UTILZAR
    private EditText et_Matematicas;
    private EditText et_Fisica;
    private EditText et_Quimica;
    private TextView tv_Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MANDAR A LLAMAR LOS ID DE LA VISTA GRAFICA DE LA APP Y REALIZAR UN CASTEO
        et_Matematicas = (EditText) findViewById(R.id.txt_Matematicas);
        et_Fisica = (EditText) findViewById(R.id.txt_Fisica);
        et_Quimica = (EditText) findViewById(R.id.txt_Quimica);
        tv_Resultado = (TextView) findViewById(R.id.tv_Resultado);
    }

    //EL METODO REALIZA LA EVALUACION
    public void evaluacion(View view) {
        //GUARDAR VALORES DE LA VISTA GRAFICA EN NUEVAS VARIABLES
        String valor1 = et_Matematicas.getText().toString();
        String valor2 = et_Fisica.getText().toString();
        String valor3 = et_Quimica.getText().toString();

        //PASAR LOS VALORES DE LAS NUEVAS VARIABLES DE STRING A INT EN UNA NUEVA VARIABLE Y REALIZAR UN PARSEO
        int matematicas = Integer.parseInt(valor1);
        int fisica = Integer.parseInt(valor2);
        int quimica = Integer.parseInt(valor3);

        //REALIZAR LA OPERACION
        int suma = (matematicas + fisica + quimica) / 3;

        //EVALUAR SI EL ALUMNO APRUEBA O REPRUEBA
        if (suma >= 7) {
            tv_Resultado.setText("Estatus Aprobado con " + suma); //MODIFICAR EL ESTADO DEL TEXTVIEW
        } else {
            tv_Resultado.setText("Estatus Reprobado con " + suma); //MODIFICAR EL ESTADO DEL TEXTVIEW
        }
    }
}