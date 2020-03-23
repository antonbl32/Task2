package by.home.task;


import java.text.ParseException;
import java.util.*;

import static by.home.task.PriborRoom.countR;

public class Test {
    public static HashMap<Integer,Object> pribor=new HashMap<>();
    public static int count=0;
    public static void addPribor()  {

        PriborRoom tv=new PriborRoom("Телевизор","MJH125",1.2,1,1,1);
        pribor.put(count,tv);
        PriborRoom fresh=new PriborRoom("Кондиционер","KJ200",3.1,1,1,0);
        pribor.put(count,fresh);
        PriborKuhn cold = new PriborKuhn("Холодильник", "MK1", 1.2, 2, "11.12.2020", 20);
        pribor.put(count,cold);
        PriborKuhn wave = new PriborKuhn("Микроволновка", "KJ54", 3.6, 2, "02.02.2021", 2);
        pribor.put(count,wave);
    }
    public static ArrayList<Object> selectGroup(int i){
        ArrayList<Object> group=new ArrayList<>();

        pribor.forEach((k,v) -> {
           Pribor m;
           m= (Pribor) v;
           if(m.getGroupNom()==i)
               group.add(v);
       });
        return group;
    }
    public static Double sumPower(){
        var ref = new Object() {
            Double sum = 0.0;
        };
    pribor.forEach((k,v)->{
         Pribor m;
         m= (Pribor) v;
         if(m.getOnDev())
             ref.sum +=m.getPowerPrib();

     });
     return ref.sum;
    }
    public static void onDevice(int a){
        for (int i = 1; i <=a ; i++) {
            int key=(int)(Math.random()*3+1);
            Pribor ob=(Pribor)pribor.get(key);
            if(!ob.getOnDev()){
                ob.setOnDev(true);
            }
        }


    }
}
