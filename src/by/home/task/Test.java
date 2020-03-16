package by.home.task;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import static by.home.task.PriborRoom.countR;

public class Test {
    public static HashMap<Integer,Object> pribor=new HashMap<>();
    public static int count=0;
    public static void addPribor() throws ParseException {

        PriborRoom tv=new PriborRoom("Телевизор","MJH125",1,1,1,1);
        pribor.put(count,tv);
        PriborRoom fresh=new PriborRoom("Кондиционер","KJ200",3,1,1,0);
        pribor.put(count,fresh);
            try {
                PriborKuhn cold = new PriborKuhn("Холодильник", "MK1", 1, 2, "11.12.2020", 20);
                pribor.put(count,cold);
                PriborKuhn wave = new PriborKuhn("Микроволновка", "KJ54", 3, 2, "02.02.2021", 2);
                pribor.put(count,wave);
            } catch (ParseException s){
                 System.out.println("Проверь дату ТО");
            }
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


}
