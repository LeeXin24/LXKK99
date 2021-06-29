package src.com.yuanren.mapDemo;

import java.util.Hashtable;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>(); //TreeSet

        map.put("9527",23);
        map.put("9",45);
        map.put("92527",223);
        map.put("527",45);
        map.put("5",451);
        map.put("57",4512);
        map.put("27",45);

        System.out.println(map);


        Hashtable<Object, Object> objectObjectHashtable = new Hashtable<>();
       // objectObjectHashtable.put(null,"das");
       // objectObjectHashtable.put("1",null);  键和值尽量不要空
        System.out.println(objectObjectHashtable);


        //  HashMap  底层实现的原理   红黑树上讲






    }
}
