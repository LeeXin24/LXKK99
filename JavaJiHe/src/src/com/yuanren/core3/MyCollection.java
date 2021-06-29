package src.com.yuanren.core3;

import java.util.*;

public class MyCollection {


    public static void main(String[] args) {
        List<String>  list=new ArrayList<>();
        list.add("李aswdasdasda");
        list.add("李ww四3");
        list.add("李22");
        list.add("李2四514四");
        list.add(2,"王五");
        System.out.println(list);

        System.out.println(list.get(4));

        System.out.println(list.indexOf("李2四2"));

       /* List<String> list1 = list.subList(1, 4);
        System.out.println(list1);
*/

        list.sort(new Comparator<String>() { //思考 如果集合里面存放的是对象(User[name ,age])  age一样  根据用户名长度排序  长度一样 根据用户名是否相同排序
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
        }
        });

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list); //打乱

        System.out.println(list);//[李aswdasdasda, 王五, 李22, 李ww四3, 李2四514四]   [李22, 李aswdasdasda, 王五, 李2四514四, 李ww四3]

        List<Integer> integers = Arrays.asList(12, 3123, 1412312, 3123, 12, 312, 312, 41212);
        Collections.sort(integers);
        System.out.println(integers);

    }
}
