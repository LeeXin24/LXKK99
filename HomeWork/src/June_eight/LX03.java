package June_eight;

public class LX03 {

    public static void main(String[] args) {

        printXing(25);

    }
    /*1.做一个画*矩形的函数
        主函数调用画一个10行8列；20行3列；3行20列
 */

    public static void draw(int x,int  y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

  /*  2. 封装函数功能：最后一行星星是输入的（基数）
    在主函数中测试分别输入最后一行的星星数为51、25、15  所打印出的结果
             *      2-1
            ***     2*2-1
           *****       2*i-1=星星数
          *******
         *********
*/

    public  static  void printXing(int  number){
        for (int i = 1; i <=(number+1)/2; i++) {
            //首先打印空白的函数
            for (int j = (number-1)/2; j > i-1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
