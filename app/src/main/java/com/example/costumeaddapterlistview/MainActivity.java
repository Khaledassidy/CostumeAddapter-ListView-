package com.example.costumeaddapterlistview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


//practice in costume addapter

//first make new class name myaddpater

//second mnetsa3ml l addapter le 3mlnee





public class MainActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);

        ArrayList<String> data=new ArrayList<>();
        data.add("ahmad");
        data.add("khaled");
        data.add("ali");
        data.add("sara");
        data.add("lama");

        //hala2 houn ana ma 7adadt tasmem sapto bas ana l a7san 7adedo
        MyAddapter myAddapter=new MyAddapter(this,data);
        listView.setAdapter(myAddapter);


    }
}