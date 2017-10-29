package com.joaquin.ejer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Lista extends AppCompatActivity {

    public TextView nombre;
    public TextView apellido;
    private Button button_guardar;
    private Button button2_mostrar;
    public static ArrayList <clase_datos> ListaDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        this.button_guardar =(Button) findViewById(R.id.button_guardar);
        this.button2_mostrar =(Button) findViewById(R.id.button2_mostrar);
        this.nombre =(TextView) findViewById(R.id.nombre);
        this.apellido =(TextView) findViewById(R.id.apellido);

        ListaDatos = new ArrayList<clase_datos>();

        button_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (nombre.getText().length() !=0 && apellido.getText().length() !=0) {

                    clase_datos obj = new clase_datos();

                    obj.Nombre = nombre.getText().toString();
                    obj.Apellido = apellido.getText().toString();


                    ListaDatos.add(obj);
                    nombre.setText("");
                    apellido.setText("");
                    Toast.makeText(getApplicationContext(), "datos guardados", Toast.LENGTH_LONG).show();
                }else{
                        Toast.makeText(getApplicationContext(),"hay campos vacios", Toast.LENGTH_LONG).show();
                    }
                }

        });

        button2_mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ActivityMostrar = new Intent(Lista.this, Mostrar.class);
                startActivity(ActivityMostrar);
            }
        });


    }
}
