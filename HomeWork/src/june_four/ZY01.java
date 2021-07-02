package June_four;

public class ZY01 {
    public static void main(String[] args) {
        int n=5786;
        int n1=n%10;
        int n2=n%100/10;
        int n3=n%1000/100;
        int n4=n%10000/1000;
        /*System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);*/
        System.out.println(n1+n2+n3+n4);
    }
}