package test02;
//### 2.两个加线程    两个减线程   分别执行++  --操作      加线程  要么全部执行   要么减线程全部执行
//### 不能加线程一个 减线程一个 如   threadA ++  threadC --
//###  应该是  threadA ++ threadB ++  或者 是 threadB++  threadA++  减线程也是一样
public class TestThread {
    public static void main(String[] args) {
        AddThread addThread = new AddThread();
        DelThread delThread = new DelThread();
        new Thread(addThread,"加加").start();
        new Thread(delThread, "减减").start();
    }
}
