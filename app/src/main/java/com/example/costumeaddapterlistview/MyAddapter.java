package com.example.costumeaddapterlistview;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

//2awl she 3mlna class esmo addapter
//3ashen heed l class yet3eraf 3lee eno addpater lezm ya3mel extend mn class addapter mawjoud w jehez ya3ne ana bade 2a3ml wa7ad metl l array addapter ana ma bade yeh la heed l addapter bade 2a3ml wa7ad metlo mn sefr
//l addapter l 2asese le mn 5elelo bte2dar tebne aye addapter 5aas feek esmo base addapter
//fa beje ana ba3ml extend la baseaddapter
//l base addapter kel addapter byet3mel ma3o 7ata l arrayaddapter le sta3mlne 3emel extend mn l base addapter

//hala2 ba3d ma 3mlt extend base addapter:public class MyAddapter extends BaseAdapter
//tal3lna 5at a7amar ta7t:public class MyAddapter extends BaseAdapter lesh ?
//2alk l base addapter howe abstract class l abstractclass bel oop howe byenkatab esm l medthod bas ma byen3aml impliment lal code ya3ne bas btenketb esm l method w tark l code lal bade ektbo lal ebn le bado ya3mel extend meno la heed l abstract class
//bas iza 3mlt extend meno lal abstarct class mojbar t7ot l method le b2albo le houne getcount(),getitem(),getitemid(),getview()  w enta btktob l code le b2alboun hawde l method 3ebra 3an abstract method ya3ne function mndoun implimntation
//fa hala2 btkbous 3ala kabset implimnt method bebyno 3andak l methods l 4



//tyeb ba3d ma ana 7atet l method 7kena badna neb3at l data lal adapter w l 3onour yale b2alb textview
//fa tare2a 3ashen ersel baynet la object mn 5elel l constructor 2aw set w get bas ne7na 7a nest3ml constructor

//ba3ml constructor: public MyAddapter(){
//
//    }

//teyb sho bade 7ot parameter b2albo bade 2awl she erselo l context metl l array adapter ma 2olna 2awl she mnerselo l context
//tene sha8le bade erselo l data arraylist masaln mno3 string
//fene ba3den erselo l id ta3el design w fene ektbo bshakl sebet hala2 ana ma erselo yeh e5er she ba3mlo

//public MyAddapter(Context context, ArrayList<String> data){
//
//    }

//bas ana masln momken est3ml l data hala2 bel get count bas ma 2e2dar 2osala fa lezm kel she b7oto bel conmstructor 3arfo global

//ya3ne ana hala2 bel get count lezm raje3 toul l arraylist bas ma 2e2dar l2no mano m3raf global fa b3aref kel she bel constructor global


//public MyAddapter(Context context, ArrayList<String> data){
//        this.context=context;
//        this.data=data;
//    }



public class MyAddapter extends BaseAdapter {
    Context context;
    public ArrayList<String> data;
    public MyAddapter(Context context, ArrayList<String> data){
        this.context=context;
        this.data=data;
    }

    //getcount():btrje3le toul l array list ya3ne size so data.size()
    @Override
    public int getCount() {
        return data.size();
    }

    //getitem mesh darore nest3mla momken netreka null
    //bas heye eno btraje3 data 7asab l index b2alb l arraylist
    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    public void addItem(String item){
        data.add(item);
    }

    //method bte5od l postion w bte5od string
    public void setItem(int pos,String item){
        //b2alb l array list 3ande method esma set bte5od l postion w bte5od l string le badak t3adlo
        data.set(pos,item);

    }

    //getitemid mesh darore nest3mla momken netreka 0
    //bas heye eno btraje3 l id 7asab l kel 3onsour b2alb l arraylist
    //fa fena n2ol eno traje3 l postion
//    ya3ne l postion howe l id
    @Override
    public long getItemId(int position) {
        return position;
    }

    //neje lal getview() ahm wa7de
    //mtl ma 2olna:
    /*
    //int position:heye l postion ta3et l view b2alb l listview ya3ne listview btet2asam la views 7asab l getcount w 2awl view bekoun bl listview howe l postion ta3elo 0
    //View convertView:heye l view ta3el kel wa7ad b2alb listview
    // ViewGroup parent:howe l parent ta3el l sheshe le feha list view

   */

    //ne7na 2olna hayde btestad3a kel mara wa2t badna n7ot view w bteb3at ma3a l postion w l view
    //ba3den btjeb l design bta3mlo inflate w bt7oto bel view
    //fa 2awl she 2abl ma na3ml inflate badna nef7as hal view howe null wala la2 iza null 3mlo inflate iza mano null ma ta3mel inflate

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        //fa 2awl she ba3ml variable view w b5azen fe heed l convertview
        View view=convertView;

        //ba3den mnef7as

        //ya3ne 3am yo3roud l 3onsour la 2awl mara 3mlo inflate
        if(view==null){
           //keef ya3ne inflate ya3ne badak tjeeb design le enta 3mlto w t7oto b view ya3ne badak t7awel mn xml la object 3ashen te2dar t7ot fe data ya3ne enta la tosal la attribute ta3el textview masln mesh bta3ml finveiw by id 3ashen te2dar tet7km bel attribute ta3elo settext(),gettext() fa 3ashn ta3ml heeek bta3ml inflate

           //bas ne7na bas kona na3ml inflate na3ml findviewbyid bas houn 5talf l kalem mesh heek
           //ne7na kona na3ml finview by id bas ykoun 3arfanen ween maw2e3 tasmem ya3ne kona 2awl ma nblesh n7ot setcontentview() w na3te l id ta3el tasmem fa bas nrou7 na3ml finveiwbyid yrou7 yfatesh 3al id l mawjoud ma7al ma 7atet setcontentview
            //bas houn hala2 mesh 3arfeen esm tasmem lal 3osnour nafso
            //fa bade eje 2a3mlo inflate la layout ya3ne la tasmem kolo

            //keef ba3mlo inflate
            //fe class esmo layoutinflatter
            //layoutinflater:class fe b2albo majmo3a mn l function 3ashen ta3mel inflate la layout keemel ya3ne ta7wel code xml la code java
            //ana 3ashn 2a3ml finview by id lezm 2a3ref sha8le le bade eb7as feha ya3ne design le bade eb7as fe 3an id m3ayn
            //fa ana bade rou7 jeeb l object yale bado yeb7as 3an l id heda fa setcontentviewhye l object yale bt3mlo 3ashn teb7as 3an id mo3ayn b2albo mn 5elel finviewbyid
            //bas houn ma fe setcontentview honek la7lo fehem eno heed tasmem w ba3den findviewbyid w rou7 b7as b2alb heed tasmem

            //houn la2 badak ta3ml inflate la tasmem ya3ne t7wlo la object 3ashn ta3ml findviewbyid b2alb heed l object tasmem

            //fa hala2 mnesta3ml layoutinflater
            //2awl she lezm t7adedo b2alb layoutinflater l contect
            //fa ana ba3ml layoutinflater.from(contect):hay ma3neta 3am 2olo l 3onsour yale bade 2a3mlo inflate howe tebe3 la shshe ra2seye le feha listview
            //bas lisa mesh marbout feha la shshe ana bas 3am 2olo l 3onsour yale bado 2a3mlo inflate howe tebe3 la heed l context le howe m3araf bel constaractor le howe ana 7a eb3to mn bara bas rou7 la 2a3mlo bel mainactivity 7a 2oktbo
            // LayoutInflater.from(context)
            //ba3den ba3ml . la hay LayoutInflater.from(context) w besta3mel method esma inflate
            //inflate ya3ne:bte5od 3 sha8let 2awl sha8le l id taba3 design 2aw l 3onsour le badak ta3mlo inflate fa ne7na bel 3ade mnkoun 3emlen design m3ayan w mn7ot l id ta3elo bas hala2 7a nesta3ml jehez le howe android.R.layout.simplelistitem
            //tene parameter l parent:2alak heed le 3onsour yale badak ta3mlo inflate hal 7a ykoun marbout b listview wala la2 akked 7a ykoun marbout bas ne7an 2olna bas l getview ta3ml return la7ala bteje w btrbout l 3onsour b listview la7ala fa ana bade 7a dedlo yorbout fa b2olo null ya3ne ma trobout b 2aye she
            //telet wa7ad attach to root:hal torbto ma3 l ab ya3ne:houn b2olo eno ma torbout bel viewgroup false

            //ba3d ma 3mlt kol heed : LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1,null,false);
            //brou7 w b5zno bel variable le 3mlto l esmo view: View view=convertView;
            view=LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1,null,false);


            //fek kamen t7ota heek:view = LayoutInflater.from(getContext()).inflate(Resource, parent,false);
        }

        //hala2 houn ba3d ma 3mlt inflate lezm 2a3ml inflate lal 3osour le bede5l heed le 3mltolo inflate:android.R.layout.simple_list_item_1 w heed b2albo bas textview
        //ya3ne ana jeebt tasmem kolo hala2 rou7 b7as 3an 3osnour bede5l heed tasmem
        TextView textView=view.findViewById(android.R.id.text1);

        //hala2 badee jeeb data mn l arraylist
        String text=data.get(position);

        //hala2 bade 7ot data b2alb heed textview
        textView.setText(text);

        //ba3d ma ta3mel kol heed btraje3 l view le view:heye le enta enta 3mltela inflate w jebt textview le joweta w 5aznta data joweta
        return view;


        //note: ana keen fene 2a3ml integer resource w 5ale l most5dem howe 7ydade l resource
        //ya3ne

        // Context context;
        //    ArrayList<String> data;
        //    int resource
        //    public MyAddapter(Context context,int resource, ArrayList<String> data){
        //        this.context=context;
        //        this.resource=resource
        //        this.data=data;
        //    }

        //w ba3den             view=LayoutInflater.from(context).inflate(resource,null,false);

        //note keef fene esta5dem heed l 3onsour: fene kamen bhay l method masln 2olo iza keen l postion been 5aza w 5aza raje3 kaza w heek
        // @Override
        //    public Object getItem(int position) {
        //        return data.get(position);
        //    }

        //houn  String text=(String)getItem(postion) lezm ta3ml casting 2aw

        //bta3mel heek:public String getItem(int position) {
        //        return data.get(position);
        //    }
        //bt8yer return type la string


        //fe kamen ba3d sha8le 2olo lal 5lss ta3ele eno l user bado yersel noo3 m7adad mn data mn 5elel geniric type:public class MyAddapter<T>:eno l most5dem bado yeb3at data of type T
//        public T getItem(int position) {
//            return data.get(position);
//        }

    }
}
