package Inflate;

public class inflate {

    /*

        inflate:

        view = LayoutInflater.from(getContext()).inflate(Resource, null, false);
        2awl she heed satr berj3lna view object
        tene sha8le fena nest3mlo masln iza keen 3ande design ana 3emlo w 7abet zedo 3ala design tene 2aw best3mlo b listview,recycleview...etc
        howe 3ebra ta7wel xml la java object

         view = LayoutInflater.from(getContext()).inflate(Resource, null, false);
        l inflate fe tnen costructor wa7ad bye5od pas 2 parameter wa7ad bye5od 3 parameter

        2awl she iza keen 3ana 2 parameter
         view = LayoutInflater.from(getContext()).inflate(Resource, null);
         sho ma3neto
         2awl sha8le l inflate 2awl parametr bte5do l id taba3 l malaf le badak t7wlo la object java
         tene parmeter howe root:ya3ne l parent le la 7yseer la heed l file Resource ya3ne meen le la7 yseer l ab la heed l malaf

         la neftered b2alb malaf resource fe textview bas ma fe 7ata la linear wala constaint layout bas textview

         1stcase l root null:
                  view = LayoutInflater.from(getContext()).inflate(Resource, null);

                  bhay l 7ale l view:ya 7koun b2albo bas textview
                  la nofroud keen fe b2lb resource linearlayout,button,textview..etc
                  bhay l 7ale kel me7weyet hawde 7a ysero b2alb l variable le esmo view

                  lezm nefham 3 sha8let:

                  l view: howe heed l variable le 3ande sho fe p2albo
                  l parent:
                  layout params:howe class mas2oll 3an l a7jem w l ab3ad mawke3 l 3onsour fe l android




                  view = LayoutInflater.from(getContext()).inflate(Resource, null);

                    bhay l 7ale

               |View      |  parent  |   params|
               |textview  | null     |   null  |
               |_________ |__________|_________|




                la nefterd 3ana viewgroup1 howe constarint layout  w b2alb heed l contarint fe viewgoroup heed l view gourd howe linear layout
               case 3 parameter:

                       view = LayoutInflater.from(getContext()).inflate(Resource, veiwgroup,true);

                    hala2 l view sar fe b2albo linearlayout w b2alb linear layout fe textview heed linear layout 7a yenzeed 3al parent ra2ses l howe l constaint layout

               |View           |  parent         |   params          |
               |linear layout  | constaint layout| constaint layout  |
               |______________ |________________ |__________________ |


               hala2 l view sar fe b2albo linearlayout w b2alb linear layout fe textview heed linear layout 7a yenzeed 3al parent ra2ses l howe l constaint layout

              w l parent howe l constarint layout w l params howe constaint layout :ya3ne le 7a yenzed l linear layout heed 3ala l constaint layout w le 7a yet7am be ab3edo w mawk3o s shakolo howe l containt layout





             view = LayoutInflater.from(getContext()).inflate(Resource, veiwgroup,false); hay aktr 7ale most5deme lal listview,recycle view

             bhay l 7ale sar l view feha textview

               |View           |  parent         |   params          |
               |textview       | null            | linear layout     |
               |______________ |________________ |__________________ |


                            bhay l 7ale sar l view feha textview w l parent null lesh l2no 7tyna l parsm null w le 7a yet7akm b ab3ad w shakl l textview howe linear layout





















   */



}
