package CLICK_ADD_and_EDIT;

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

import CLICK_IN_LISTVIEW.click_in_list_view;


//exercise 3ande listview feha data w button w edit text bade bas okbous 3al button w 7ot data bel edit text yzeeda 3al list view
//kamen bade hay l button nafsa ta3mel edit la 3onsour bel listview

//tyeb keef bade 2a3ref aymta hay l 3osnour ta3eml add or edit
//iza ana kabst 3ala wa7de mn lista yon2olo lal edit ya3ne bade 2a3ml edit la hay l 3osnour bel lista
//fa ana bas okbous 3lyha 7a ye5od data le b2alb edit text w ya3mela update lal data le kenet

public class click_add_and_edit extends AppCompatActivity {
    ListView listView;
    EditText editText;
    Button button;
    MyAddapter myAddapter;

    int current_postion=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click_add_and_edit);

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

            if(current_postion>0){
                //ya3ne bade 3adel ma bade zeed

                //3mlyet ta3del keef bada tseer bade 2a3ml method esma set item metl ma3mlt method additem la zeed 3onsour hala2 set item la 3adel b 3osnour

                myAddapter.setItem(current_postion,editText.getText().toString());

                //ba3d ma y5les 3amlyet ta3del 5ale kabset l button esma add
                button.setText("add");

                //bade erja3 8ayer l current_postion la -1 barke howe 3emel ta3del reje3 bado ya3mel add
                current_postion=-1;
            }
            else{
                //ya3ne 3amlyet add la 3onsour

                myAddapter.addItem(editText.getText().toString());

            }
            //hala2 iza sha8lt hyde w 3abet l edit text w kabst l button w ba3den nzelt la 2e5er l lista 7a tl2eha zedet
            //ama iza kont 2e5er lista w 3abet l edit text w kabst l button 7a tl2eha ma zedet 2ama liza tel3t w rje3t nzelt 7a tl2eha zedet
            //3asehn t5leh 7ata law howe b 2e5er listview ya3mel refresh lal listview lezm ta3mel addapter.notifdatasetchanged()
//            addapter.notifdatasetchanged:hay ma3neta rou7 3meel notification lal listview w 2olo eno fe data t8ayret fa rou7 5ale lista t7ades data ta3ela fa hala2 7ata law keen b2awl lista b 2e5er lista la7ala 7a t8ades data
            //
            myAddapter.notifyDataSetChanged();

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

                //hala2 ana 3ande l data l mawjoude bel 3osnour le kabst 3lee bado on2lo 3al edit text
                editText.setText(the_data);

                //ba3den bade e7faz l index lal 3osnour yale bade okbous 3lee lesh 3ashn bas bade 8ayer olo additem(postion) heed l postion howe le bade e7fazo
                //fa 2awl she b3ref integer global esmo currentpostion w b7oto=-1 ya3ne mano makbous 3ala wala 3onosour

                //ba3den 7ot heed l current+postion equll lal 3onsour le kabst 3lee
                current_postion=position;

                //hala2 ana iza ma kent kebes 3ala wala 3onsour 7a tkoun l 2emet l current postion -1 ama iza kabst 7a tkoun l keme akbr mn sefr fa brou7 btabe2 heed l kaleme bel onclicklistenr ta3ell button


                //e5er she eno bas yokbous 3ala 3onsour tet8ayar kelmet l button la edit
                button.setText("edit");

            }


        });

    }
}