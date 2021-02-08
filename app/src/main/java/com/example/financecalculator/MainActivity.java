package com.example.financecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    static ArrayList<String> fruits = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");

        final ListView fruitsList = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, fruits);
        fruitsList.setAdapter(adapter);
//
//        fruitsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
////                Toast.makeText(getApplicationContext(), fruits.get(position), Toast.LENGTH_LONG).show();
//            }
//        });

        ((TextView) findViewById(R.id.btn_add)).setOnClickListener(new TextView.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), ((EditText) findViewById(R.id.editTextNumber)).getText(), Toast.LENGTH_LONG).show();
                fruits.add("ASD");
            }


        });
    }





}