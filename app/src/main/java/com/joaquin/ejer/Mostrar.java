package com.joaquin.ejer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Mostrar extends AppCompatActivity {

    private adaptador myAdapter;
    public ArrayList<clase_datos> ArrayDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        ArrayDatos = Lista.ListaDatos;

        myAdapter = new adaptador(this, ArrayDatos);

        ListView ltsDatos = (ListView) findViewById(R.id.Mostrar);
        ltsDatos.setAdapter(myAdapter);

        myAdapter.notifyDataSetChanged();
    }
}
