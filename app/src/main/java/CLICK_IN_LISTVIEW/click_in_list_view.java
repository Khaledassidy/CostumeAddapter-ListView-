package CLICK_IN_LISTVIEW;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.costumeaddapterlistview.MyAddapter;
import com.example.costumeaddapterlistview.R;

import java.util.ArrayList;


//exercise eno la ma ekbous 3ala aye wa7de mn listview yetb3le tost l maktob b2alb heed l 3osnour ma3 l postion

//fa best3mel onitemclicklistener:ya3ne bas tobsous 3ala item b2alb l listview


public class click_in_list_view extends AppCompatActivity {
    ListView listView;
    EditText editText;
    Button button;
    MyAddapter myAddapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_in_list_view);
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
         myAddapter=new MyAddapter(this,data);
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


        //houn bas ekbous 3ala 3osnour mn listview

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //parent:howe l addapterview ya3ne jam3o l addapter ma3 l view ma3 kel sha8le momkn telzamak mn l addapter nafso 2aw mn l view ba3tolak b class esmo adapter view
                //ya3ne momken tjeeb l adapter bhay tare2a: parent.getAdapter() 2aw iza enta m3ref l addapter global feek tjeeb de8re l addapter parent.getAdapter() hay btjeblak l adddapter bshakl 3am mesh ta3elak
                //View view:howe l 3onsour le enta da8t 3lee
                //int position:howe l postion howe l postion taba3 l 3onsour le enta da8t 3lee
                //long id:l id taba3 l 3osnour le enta da8t 3lee

                //iza bade jeeeb l data taba3 kel view l data mawjoude bel array list w l arraylist mawjoude b addapter
                //ya3ne 3ashen jeeb l data mafroud rou7 3al addapter ba3den 3al arraylist w ba3den 2a3te l postion lal array list w yetb3le l data ta3el 3onsour

                //fe haw 4 toro2:
//                String data1=myAddapter.data.get(position);
//                String data2=(String)parent.getItemAtPosition(position);
//                String data3=(String) myAddapter.getItem(position)
//                String data4=(String) ((MyAddapter)parent.getAdapter()).getItem(position);


                //bas a7san tare2a heye hay String data3=(String) myAddapter.getItem(position); lesh?
                //l2no enta lezm ta3mel l variables b2alb l addapter private a7san

                String the_data=(String) myAddapter.getItem(position);


                Toast.makeText(click_in_list_view.this, "pos:"+position+" data "+the_data, Toast.LENGTH_SHORT).show();

            }


        });

    }
}