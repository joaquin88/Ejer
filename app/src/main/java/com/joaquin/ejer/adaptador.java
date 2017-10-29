package com.joaquin.ejer;


import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by rajito on 28/10/2017.
 */

public class adaptador extends ArrayAdapter<clase_datos> {

    public adaptador(Context context, List<clase_datos> objects) {
        super(context, 0, objects);
    }
    public View getView(int position, View convertView, ViewGroup parent){

        clase_datos obj2 = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.iten_resultado, parent, false);

        }
        TextView textoNombre = (TextView) convertView.findViewById(R.id.id_text1);
        TextView textApellido = (TextView) convertView.findViewById(R.id.id_text2);

        //mostrar los datos
        textoNombre.setText(obj2.Nombre);
        textApellido.setText(obj2.Apellido);

        return convertView;
    }
}

