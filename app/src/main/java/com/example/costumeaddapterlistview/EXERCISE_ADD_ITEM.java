package com.example.costumeaddapterlistview;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


//exercise 3ande button w edit text bade 7ot name bel edit text w bas okbous 3al button yenzeed 3al lista
//a7san tare2a heye 2a3ml method b2alb l addapter esma additem
//lesh l2no enta 3mlt arraylist w 7atet feha data w ba3at hay data lal addapter tyeb badak tzeed data fa enta hala2 bte7ke mobsheratan ma3 l addapter
public class EXERCISE_ADD_ITEM extends AppCompatActivity {

    ListView listView;
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_add_item);
        listView=findViewById(R.id.listview_2);
        editText=findViewById(R.id.editTextText);
        button=findViewById(R.id.button);

        ArrayList<String> data=new ArrayList<>();
        data.add("ahmad");
        data.add("khaled");
        data.add("ali");
        data.add("sara");
        data.add("lama");

        //hala2 houn ana ma 7adadt tasmem sapto bas ana l a7san 7adedo
        MyAddapter myAddapter=new MyAddapter(this,data);
        listView.setAdapter(myAddapter);

        button.setOnClickListener(v->{
            myAddapter.addItem(editText.getText().toString());
            //hala2 iza sha8lt hyde w 3abet l edit text w kabst l button w ba3den nzelt la 2e5er l lista 7a tl2eha zedet
            //ama iza kont 2e5er lista w 3abet l edit text w kabst l button 7a tl2eha ma zedet 2ama liza tel3t w rje3t nzelt 7a tl2eha zedet
            //3asehn t5leh 7ata law howe b 2e5er listview ya3mel refresh lal listview lezm ta3mel addapter.notifdatasetchanged()
//            addapter.notifdatasetchanged:hay ma3neta rou7 3meel notification lal listview w 2olo eno fe data t8ayret fa rou7 5ale lista t7ades data ta3ela fa hala2 7ata law keen b2awl lista b 2e5er lista la7ala 7a t8ades data
                myAddapter.notifyDataSetChanged();
            //
        });
    }
}