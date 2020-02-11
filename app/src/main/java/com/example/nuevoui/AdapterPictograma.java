package com.example.nuevoui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class AdapterPictograma extends PagerAdapter {

    ArrayList<item_pictograma> pictogramas;
    Context context;
    LayoutInflater layoutInflater;

    public AdapterPictograma(ArrayList<item_pictograma> pictogramas, Context context) {
        this.pictogramas = pictogramas;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return pictogramas.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);

    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = layoutInflater.inflate(R.layout.item_pictograma,container,false);
        ImageView imageView = view.findViewById(R.id.img_pictograma);
        TextView textView = view.findViewById(R.id.nombre_pictograma);
        imageView.setImageResource(pictogramas.get(position).getPictigrama());
        textView.setText(pictogramas.get(position).getNombre_pictograma());
        container.addView(view);
        return view;
    }
}
