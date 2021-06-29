package src.com.yuanren.core4;

import java.util.LinkedList;

public class LinekdListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(35432);
        linkedList.add(353434432);
        linkedList.add(887);  //
        linkedList.offer(857);
        linkedList.offerFirst(213);   //[213, 35432, 353434432, 887, 857]

        Integer integer = linkedList.peekFirst();

      //  System.out.println(linkedList+"--"+integer);

        Integer poll = linkedList.poll();
        System.out.println(linkedList+":"+poll);

        linkedList.push(12321);
        Integer pop = linkedList.pop(); //出栈

        System.out.println(linkedList);




    }
}
