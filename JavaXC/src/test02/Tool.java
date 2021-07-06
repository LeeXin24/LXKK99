package test02;

import java.util.concurrent.CountDownLatch;

public class Tool {
    public  static  int index=0;
    public static  CountDownLatch  countDownLatch=new CountDownLatch(2);
    public static boolean flag=true;
}
