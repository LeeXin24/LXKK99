import java.io.IOException;

public class TestTime {
    public static void main(String[] args) throws IOException {
        long beginTime = System.currentTimeMillis();
//		method_01();
//		method_02();
//		method_03();
//		method_04();
        long endTime = System.currentTimeMillis();
        System.out.println("耗时： " + (endTime - beginTime) + " 毫秒");
    }
}