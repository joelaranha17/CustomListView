package com.firstapp.joel.customlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//--------------------------------------------------Creating a listView of String items-------------------------------------------------------------
        String[] foods = {"Bacon","Ham","Tuna","Candy","Potato"};
        ListAdapter buckysAdapter = new CustomAdapter(this,foods);
        ListView joelListView = findViewById(R.id.joelListView);
        joelListView.setAdapter(buckysAdapter);
//--------------------------------------------------Adding some functionality to the items-----------------------------------------------------------
        joelListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String food = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(MainActivity.this, food, Toast.LENGTH_LONG).show();
            }
        });
    }
}
