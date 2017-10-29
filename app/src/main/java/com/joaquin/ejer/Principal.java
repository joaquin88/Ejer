package com.joaquin.ejer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    private Button id_button;
    private Button id_imagen;

    //activar una activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        this.id_button= (Button) findViewById(R.id.id_button);

        //inicializa para a otra activiti imagen
        this.id_imagen=(Button) findViewById(R.id.id_imagen);

        //inicializamos las variables
        id_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activiti_lista = new Intent(Principal.this, Lista.class);
                startActivity(activiti_lista);
            }
        });

        id_imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity_imagen= new Intent(Principal.this, Imagen.class);
                startActivity(activity_imagen);
            }
        });
    }
}
