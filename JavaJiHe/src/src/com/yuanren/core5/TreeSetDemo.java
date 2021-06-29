package src.com.yuanren.core5;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {


    public static void main(String[] args) {

        /**
         *1、TreeSet集合中保存的数据都是有序的，这里的有序指的是对元素进行了排序；
         * 2、排序使用的是元素的自然顺序或者是创建集合对象时提供的Comparator排序；
         * TreeSet集合之所以可以在添加数据时自动排序，是因为底层使用的是二叉树保存数据的；
         * 二叉树是树形数据结构的一种特殊情况；
         */

    /*    TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5412);
        treeSet.add(8);
        treeSet.add(31);
        treeSet.add(14);
        treeSet.add(87);
        treeSet.add(9);

        System.out.println(treeSet);
*/
        //测试对象进行排序
        TreeSet<Student>   treeSet=new TreeSet<>(new MyComparator());
        treeSet.add(new Student("张三132",67.9));
        treeSet.add(new Student("张发2票",96.9));
        treeSet.add(new Student("依法",99.9));
        treeSet.add(new Student("哈哈",87.9));
        treeSet.add(new Student("马蓝21bdds瘦",77.9));

        System.out.println(treeSet);

        /**
         *
         * Comparable：
             * 	它可以让一个对象自身具备比较功能。哪个对象需要具备比较功能，
             * 	这个对象所属的类就需要实现Comparable接口，实现其中的compareTo方法。
         * Comparator：
             它是单独的比较器，可以把这个接口的实现类对象单独传递给TreeSet集合，
             那么这时集合中的元素就会按照当前指定的这个比较器进行比较。开发者如果需要使用比较器的时候，
             需要定义类实现Comparator接口，同时实现其中的compare方法。
         *
         *      如果TreeSet集合中的元素所属的类实现类Comparable接口，同时这个集合对象中也传递了比较器对象，那么在比较时会使用的是比较器；
         *
         *      在使用TreeSet集合保存数据时，如果要保存的数据不能实现Comparable接口，或者已经实现了Comparable接口，
         *      但是比较方法不符合使用要求，此时就应该使用比较器；
         *
         */


    }
}

class  Student {


    private String   name;
    private Double   score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, Double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
/*
    @Override
    public int compareTo(Student o) {
        int  num=this.name.length()-o.getName().length();  //先比较名字长度是否一样

        int  num2 = num==0 ? (int)Math.ceil(this.score-o.getScore()) : num;

        return num2;
    }*/
}

class  MyComparator implements  Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {

        int  num=o1.getName().length()-o2.getName().length();  //先比较名字长度是否一样

        int  num2 = num==0 ? (int)Math.ceil(o1.getScore()-o2.getScore()) : num;

        return num2;
    }
}
