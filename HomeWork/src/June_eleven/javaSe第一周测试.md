### 一、选择题（4*15）

##### 1.运行完上面代码之后输出i的值是多少？

class Happy {

  public static void main(String args[])   {

​    int i = 1 ;  

​    int j = i++ ;

​    if((i==(++j))&&((i++)==j))   {

​      i += j ;

​    }

​    System.out.println("i = "+i);

  }

}

A. 4

B. 5

C. 3

D. 6

2. ##### 下面的数据声明及赋值那一个是没有错误的？

A. float f = 1.3;

B. char c = "a"

C. byte b = 257

D. int i = 10

3. ##### 编译Java源程序文件产生的字节码文件的扩展名为？

A. java

B. class

C. html

D. exe

4. ##### 现在假设有如下程序：

public class Demo {

  public static void main(String args[]) {

​    boolean flag = 10%2 == 1 && 10 / 3 == 0 && 1 / 0 == 0 ;

​    System.out.println(flag ? "aliyunedu" : "yootk") ;

  }

}

以上程序的最终执行结果是什么？

A. aliyunedu

B. yootk

C. true

D. 程序出错

5. ##### 现在假设有如下程序：

public class Demo {

  public static void main(String args[]) {

​    int x = 10 ;

​    double y = 20.2 ;

​    long z = 10L;

​    String str = "" + x + y * z ;

​    System.out.println(str) ;

  }

}

以上程序的最终执行结果是什么？

A. 10202.0

B. 0212.0

C. 302.0

D. 1020.210

6. ##### 现在假设有如下程序：

public class Demo {

  public static void main(String args[]) {

​    String str = "" ;

​    for (int x = 0 ; x < 5 ; x ++) {

​      str += x ;

​    }

​    System.out.println(str) ;

  }

}

以上程序最终的执行结果是什么？

A. 01234

B. 10

C. 14

D. 25

7. ##### 现在假设有如下程序：

public class Demo {

  public static void main(String args[]) {

​    System.out.println(inc(10) + inc(8) + inc(-10)) ;

  }

  public static int inc(int temp) {

​    if (temp > 0) {

​      return temp * 2 ;

​    }

​    return -1 ;

  }

}

以上程序的最终执行结果是什么？

A. 35

B. 8

C. 28

D. 12

8. ##### 现在假设有如下程序：

public class Demo {

  public static void main(String args[]) {

​    char c = 'A' ;

​    int num = 10 ;

​    switch(c) {

​      case 'B' :

​        num ++ ;

​      case 'A' :

​        num ++ ;

​      case 'Y' :

​        num ++ ;

​        break ;

​      default :

​        num -- ;

​    }

​    System.out.println(num) ;

  }

}

以上程序的最终执行结果是什么？

A. 11

B. 13

C. 12

D. 10

9. ##### 现在假设有如下程序：

public class Demo {

  public static void main(String args[]) {

​    int sum = 0 ;

​    for (int x = 1 ; x < 10 ; x ++) {

​      sum += x ;

​      if (x % 3 == 0) {

​        continue ;

​      }

​    }

​    System.out.println(sum) ;

}

}

以上程序的最终执行结果是什么？

A. 6

B. 0

C. 程序错误，死循环

D. 45

10. ##### 现在假设有如下程序：

public class Demo {

  public static void main(String args[]) {

​    int sum = 0 ;

​    for (int x = 0 ; x < 10 ; x ++) {

​      sum += x ;

​      if (x % 3 == 0) {

​        break ;

​      }

​    }

​    System.out.println(sum) ;

  }

}以上程序的最终执行结果是什么？

A. 6

B. 0

C. 程序错误，死循环

D. 45

##### 11 .和下面代码能完成相同的选项是（ ）

　　int i=1;

　　intsum=0;

　　while(i<=100)

　　{

　　if(i%2==0)

　　{

　　sum=sum+i;

　　}

　　i++;

　　}

　　A、 for (int x=1; x<=100;x++){ sum=sum+x;}

　　B、 for (int x =0; x<=100;x+=2){ sum=sum+x;}  //偶数求和

　　C、 for (int x =1; x<=100;x+=2){ sum=sum+x;}  //奇数求和

　　D.上述全对

##### 12、以下代码输出是（    ）

　　int i=0;

　　int sum=0;

　　while(i<=10)

　　{

　　i++;

　　if( i%2!=0 )

　　continue;

　　sum+=i;

　　}

　　System.out.println(sum);   //sum=2+4+6+8+10

　　A、 55

　　B、 45

　　C、 35

　　D、 30

##### 13、给出下列代码片段:

　　if ( x> 0 ) { System.out.println(“Hello”); }

　　else if (x >-3 ) { System.out.pirntln ( “I am Tom”); }

　　else {System.out.println (“How are you?”); }

　　请问将打印字符串 “How are you ?”的x的范围是（  ）

　　A、  x>0

　　B、  x > -3

　　C、  x <= -3

　　D、  x <=0 x="">-3

##### 14、下列代码执行的结果为( )

　　classDemo

　　{

　　public static void main(String[] args)

　　{

　　int num =max(43,34);   //num=43

　　System.out.println(num);

　　}

　　public static int max(int a,int b)

　　{

　　returna>b?a:b;

　　}

　　}

　　A、 43

　　B、 23

　　C、 77

　　D、 9

##### 25、下面程序执行的结果是(  )

　　classDemo

　　{

　　public static void main(String [] args)

　　{

　　int a=10;

　　if(a++>10)

　　{

　　a=20;

　　}

　　System.out.println(a);

　　}

　　}

　　A、 11

　　B、 12

　　C、 20

​		D、 21



### 二、程序操作题(4*5)

```java
1.public class HomeWork09 {
 
    public static void main(String[] args) {
        // 用while循环，计算1~200之间所有3的倍数之和。
        int a=1;
        int sum=0;
        while(a<=200){
            if(a%3=0){
                sum=sum+a;
            }     
        }
        System.out.println("1~200之间所有3的倍数之和为:"+sum);
    }
}
```

```java
2.public class HomeWork10 {
    public static int main(String args) {
        int num=200;
        while (num<=500) {
            boolean tag;       //素数标记
            for(int d=2;d<=num-1;d++){
                if(num % d==0){
                    tag=false;
                    break;
                }
            }
            if(tag){                //如果是素数
                System.out.println(num);
            }
            num++;
        }
    }
}
```

###### 3.给出下列代码，第三行将输出什么？

```java
1.public class SwitchTest{//1
2.    public static void main(String[] args) {//2
3.        System.out.println("value="+switchit(4));//3
    }//4
    public static int switchit(int x) {
        int j=1;
        switch (x) {
        case 1:j++;
        case 2:j++;
        case 3:j++;
        case 4:j++;
        case 5:j++;
        default:j++;
        }
        return j+x;
    }
}
```

```java
4.public class Test01 {

public static void main(String[] args) {

int sum = 0;

for (int i = 0; i < 100; ) {

    if (i%2==1) {

    sum += i;

    }

}

System.out.println("累加和的值 " + sum);

}

}
```

```java
5.public class Test{
    
    public static void main(String[] args){
     
        int  number;
        while(number++>0){
           
            if(number%9==0 && number%5==0){
                break;
                System.out.println("number的值为："+number);
            }
        }
        
        
        
    }
}
```





## 注意 编程题用方法做

#### 1.某学校有n个班级，每个班级m个学生

a.对每个班级的学生的分数进行降序排序

b.求出每个班级的平均分，并且对平均分降序排序



#### 2.定义一个长度为10的整型数组,循环输入10个整数。然后输入一个整数，查找此整数，找到输出下标。没找到下标给出提示。