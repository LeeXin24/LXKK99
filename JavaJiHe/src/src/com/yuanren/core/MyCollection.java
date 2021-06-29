package src.com.yuanren.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection {

    /**
     *  1.1.什么是集合
     * 存储对象的容器，面向对象语言对事物的体现都是以对象的形式，
     * 所以为了方便对多个对象的操作，存储对象，集合是存储对象最常用的一种方式。
     * 集合的出现就是为了持有对象。集合中可以存储任意类型的对象, 而且长度可变。
     * 在程序中有可能无法预先知道需要多少个对象, 那么用数组来装对象的话, 长度不好定义, 而集合解决了这样的问题。
     *
     * 1.2.集合和数组的区别
     *  数组和集合类都是容器
     *  数组长度是固定的，集合长度是可变的。数组中可以存储基本数据类型，集合只能存储对象
     *  数组中存储数据类型是单一的，集合中可以存储任意类型的对象。
     * 集合类的特点
     *  用于存储对象，长度是可变的，可以存储不同类型的对象。
     *
     *  集合中存储的肯定是引用类型的数据
     *
     */
    public static void main(String[] args) {
        Collection  collection=new ArrayList();
        collection.add(1);  //基本数据类型只能是包装类
        collection.add(true);
        collection.add('c');
        collection.add(56.36);
        collection.add("张三风");
        collection.add(new User("张大炮",213));
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));
        System.out.println("》》》》》》》》》》》》》》》》》》》》》》》》》》》");
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        System.out.println("》》》》》》》》》》》》》》》》》》》》》》》》");

        /**
         * 增强for循环  底层是迭代器
         *     for(数组或者集合里面元素的类型   变量名 : 数组名或者是集合名 ){
         *
         *     }
         *
         */

        for (Object object : objects) {
            System.out.println(object);
        }

        System.out.println("下面是对集合输出:");
        for (Object o : collection) {
            System.out.println(o);
        }
        System.out.println("》》》》》》》》》》》》》》》》》》》》》》》》");

        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // System.out.println(collection.contains("张三风"));








    }

}
