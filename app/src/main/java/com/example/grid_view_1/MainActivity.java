package com.example.grid_view_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<String>arr=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridview);
        arr.add("apple");
        arr.add("bol");
        arr.add("cat");
        arr.add("dog");
        arr.add("elephant");
        arr.add("fan");
        arr.add("girl");
        arr.add("hot");
        arr.add("ice creme");
        arr.add("joker");
        arr.add("kite");
        arr.add("lion");
        arr.add("monkey");
        arr.add("nose");

        ArrayAdapter<String> adapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,arr);
        gridView.setAdapter(adapter);
    }
}