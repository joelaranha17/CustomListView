package com.firstapp.joel.customlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by joel on 10/31/2017.
 */

class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(@NonNull Context context, String[] foods) {
        super(context,R.layout.custom_row, foods);
    }
//-----------------------------------------------------------------------------------------------------------------------------
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View customView = inflater.inflate(R.layout.custom_row, parent, false);
//-----------------------------------------------------------------------------------------------------------------------------
        String singleFoodItem = getItem(position);
        TextView joelText = customView.findViewById(R.id.joelText);
        ImageView joelImage = customView.findViewById(R.id.joelImage);
//-----------------------------------------------------------------------------------------------------------------------------
        joelText.setText(singleFoodItem);
        joelImage.setImageResource(R.drawable.myimg);
        return customView;

    }
}
