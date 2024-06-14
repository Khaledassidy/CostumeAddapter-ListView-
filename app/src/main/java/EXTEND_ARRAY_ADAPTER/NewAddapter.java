package EXTEND_ARRAY_ADAPTER;


//hal mara bade est3ml l arrayaddapter ya3ne bade 2a3ml extend meno
//bas sar fe error lesh l2no l arrayaddapter 3ando constructor 5as fe b2albo lezm ykoun fe l context,resource,data
//super(context,Resource,data);:bas eb3tlo hawde 7a yeb3toun 3end l ab w ysheel l error

//bas mn la7ez eno ma talab mene eno 3a2mel ovveride lal methods ya3ne 7ata law ma 7atbt l 4 method ma fe error fa feek tshel l getitem(),getitemid() w ma bseer she
//bas l get item:String text=getItem(postion) fe error l2no manak m7ded nou3 data ta3el ab fa bt7ola heek: ArrayAdapter<String>
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewAddapter extends ArrayAdapter<String> {


    Context context;
    ArrayList<String> data;
    int Resource ;
    public NewAddapter(Context context,int Resource , ArrayList<String> data){
        super(context,Resource,data);
        this.context=context;
        this.Resource=Resource;
        this.data=data;
    }


    public void addItem(String item){
        data.add(item);
    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View view = convertView;


        if (view == null) {

            //fe kamen sha8le fe method jehze b2alb l array addapter esma getcontext() btjeblak l context taba3 l class nafso fa enta bas 3mlt super() w 7atet l context b2alb l super fa 2a5ad l context w 7ata jowa hay l function getcontext()
            view = LayoutInflater.from(getContext()).inflate(Resource, null, false);

        }


        TextView textView = view.findViewById(android.R.id.text1);

        //batal fe error
        String text = getItem(position);

        textView.setText(text);

        return view;
    }
}
