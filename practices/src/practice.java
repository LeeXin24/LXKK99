import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入学校的班级数:");
        int n = scanner.nextInt();
        System.out.println("请输入每个班级的人数:");
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        int avg;
        while (n > 0) {
            for (int i = 1; i <= n; i++) {
                int sum = 0;
                for (int j = 1; j <= m; j++) {
                    System.out.print("请输入第" + i + "个班级的第" + j + "个人的成绩:");
                    int score = scanner.nextInt();
                    sum += score;
                }
            }
        }
    }
}
