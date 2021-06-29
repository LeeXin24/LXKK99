package src.com.yuanren.mapDemo;

import java.util.*;

public class MapPra {


    public static void main(String[] args) {
        Map<String, Set<Wife>> map=new HashMap<>();

        HashSet<Wife> set = new HashSet<>();
        set.add(new Wife("张大炮",34,456.0));
        set.add(new Wife("张若楠",24,56.0));

        map.put("张飞",set);


        Set<String> strings = map.keySet();
        for (String string : strings) {
            Set<Wife> wives = map.get(string);
            System.out.println("名字叫:"+string);
            for (Wife wife : wives) {
                System.out.println("老婆有:"+wife.toString());
            }

        }
        //吕布  关羽 自己补全



       /* Queue<Integer>  queue=new LinkedList<>();
        queue.add(21312);
        queue.add(12);
        queue.add(2);
        queue.add(1);
        queue.add(5);

        System.out.println(queue.remove());

        System.out.println(queue);
*/






    }

}

class  Wife{

    private String name;
    private Integer age;
    private Double weight;

    public Wife() {
    }

    public Wife(String name, Integer age, Double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wife wife = (Wife) o;
        return Objects.equals(name, wife.name) && Objects.equals(age, wife.age) && Objects.equals(weight, wife.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}


/**
 *      张飞
 *          大老婆   -------
 *          二老婆   -------
 *      吕布
 *          ---------
 *      关羽
 *          --------
 *
 *
 *
 *
 *
 */
