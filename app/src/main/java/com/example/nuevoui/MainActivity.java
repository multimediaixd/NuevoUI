package com.example.nuevoui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<item_pictograma> img_pictogramas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_pictogramas = new ArrayList<>();

        initData();

        HorizontalInfiniteCycleViewPager pager = findViewById(R.id.horizonta_id);
        AdapterPictograma adapterPictograma = new AdapterPictograma(img_pictogramas,getApplicationContext());
        pager.setAdapter(adapterPictograma);



    }

    private void initData(){

        img_pictogramas.add(new item_pictograma(R.drawable.cabeza2,"Triste"));
        img_pictogramas.add(new item_pictograma(R.drawable.cabeza5,"Feliz"));
        img_pictogramas.add(new item_pictograma(R.drawable.cabeza12,"Enojado"));
        img_pictogramas.add(new item_pictograma(R.drawable.caraasco3,"Eburrido"));
        img_pictogramas.add(new item_pictograma(R.drawable.carasorpresa,"Sorpresa"));
        img_pictogramas.add(new item_pictograma(R.drawable.carabonton1,"Pregunta"));
        img_pictogramas.add(new item_pictograma(R.drawable.caratriste,"Bajoneado"));
        img_pictogramas.add(new item_pictograma(R.drawable.circulo,"Circulo"));

    }
}
