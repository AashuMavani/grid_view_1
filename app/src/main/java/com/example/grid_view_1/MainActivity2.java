package com.example.grid_view_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity2 extends AppCompatActivity {
    GridView gridView;
    String ab[]={"A","B","C","D","E","F","G","H","J","K","L","M","N","O","P","Q"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gridView=findViewById(R.id.gridview);

        ArrayAdapter<String>adapter=new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_list_item_1,ab);
       gridView.setAdapter(adapter);
    }
}