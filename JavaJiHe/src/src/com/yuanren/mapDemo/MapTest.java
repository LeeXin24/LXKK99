package src.com.yuanren.mapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public static void main(String[] args) {
       /* Map<k,v> map=new HashMap<>()
       *    键=值 对
       *
       * */

        Map<Integer,String> map=new HashMap<>();
        map.put(65,"9527");
        map.put(23,"213");
        map.put(23454,"9213123527");
        map.put(21115,"952123127");
        map.put(65,"哈哈哈噶");
        map.put(43,"9527");
        map.put(null,"张三");
        map.put(36,null);

        System.out.println(map);

        String remove = map.remove(65);
        System.out.println("要移除的数据为:"+remove);

        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator = integers.iterator();

        while(iterator.hasNext()){
            Integer next = iterator.next(); //获取键
            String s = map.get(next);  //通过键获取值
            System.out.println("键:"+next+",值："+s);
        }

    }
}
