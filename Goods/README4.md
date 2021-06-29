### 写出以下程序的输出结果
#### 1. 以下代码能否通过编译，为什么
```
class Outer{
 public static void main(String[] args){   //去掉static
  new Inner();  //报错
 } 
 class Inner {                            //或者class前加static     
  Inner() {} 
 }  
}
```
编译错误，静态变量无法引用非静态变量。
#### 2. 以下代码能否通过编译，为什么
```
static class Outer{         // 此处不允许使用修饰符static
 public static void main(String[] args){
 }
 private class Inner{
  Inner() {} 
 }
}
```
编译错误，static只能写在函数的返回值类型前面。
#### 3.
```
class Outer {
 String s1 = "Java";
 String s2 = "2";
 public static void main(String[] args) { 
  Outer outer = new Outer();  
 }
 Outer() { 
  Inner inner = new Inner();  
 }
 class Inner {
  String s1 = "Certification";
  String s2 = "Exam";
        
  Inner() {
   System.out.println(Outer.this.s1);
   System.out.println(s1);
   System.out.println(s2);
  }
 }
}
```
运行结果:
Java
Certification
Exam

#### 4. 以下代码能否通过编译，为什么
```
class A
{
    class B
    {
        static void methodB()
        {
            System.out.println("Method B");
        }
    }
}
```
编译错误，内部类A.B中的静态声明非法，修饰符 'static' 仅允许在常量变量声明中使用。

#### 5.
```
class OuterInnerStatic {
 static String s1 = "Java"; 
 static String s2 = "2";
 public static void main(String[] args) { 
  Inner inner = new Inner();  
}
 static class Inner {
  String s1 = "Certification";
  String s2 = "Exam";
  Inner() {
   System.out.println(OuterInnerStatic.s1);
   System.out.println(this.s1);
   System.out.println(s2);
  }
 }
}
```
运行结果:
Java
Certification
Exam

#### 6. 在下面的示例中，如何访问"XYZ"类的"i"字段？
```
class ABC
{
    class XYZ
    {
        int i = 111;
    }
}
```


#### 7. 运行以下程序时，它是否在控制台上打印“SUCCESS”？
```
class A {
    {
        new B();
    }
     
    static class B {
        {
            new A().new C();
        }
    }
     
    class C
    {
        {
            System.out.println("SUCCESS");
        }
    }
}
 
public class MainClass {
    public static void main(String[] args) {
        new A();
    }
}
```
编译通过
不能打印，
#### 8. 以下代码能否通过编译，为什么
```
class A
{
    String s = "AAA";
     
    void methodA()          //void前加上static
    {
        System.out.println(s);
    }
     
    static class B          //或者去掉static
    {
        void methodB()
        {
            methodA();  //报错
        }
    }
}
```
不能，因为静态函数不能调用非静态成员。
#### 9.
```
abstract class A
{
    {
        System.out.println(1);
    }
     
    static
    {
        System.out.println(2);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new A() { };
    }
}
```
运行结果:
2
1

#### 10.
```
class A
{
    static String s = "AAA";
     
    class B
    {
        String s = "BBB";
         
        void methodB()
        {
            System.out.println(s);
        }
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new A();
         
        System.out.println(a.s);
         
        A.B b = a.new B();
         
        System.out.println(b.s);
         
        b.methodB();
    }
}
```
运行结果:
AAA
BBB
BBB

#### 11. 以下代码能否通过编译，为什么
```
class A
{
    void methodOne()
    {
        class B
        {
            void methodTwo()
            {
                System.out.println("Method Two");
            }
        }
    }
     
    void methodThree()
    {
        new B().methodTwo();    //
    }
}
```
编译错误，因为类不能在方法里面。

#### 12. 以下代码能否通过编译，为什么
```
class A
{
    class B
    {
        {
            System.out.println(1);
        }
         
        static          //
        {
            System.out.println(2);
        }
    }
}
```
编译错误，因为内部类A.B中的静态声明非法，修饰符 'static' 仅允许在常量变量声明中使用。

#### 13.

```
class A {
    void methodA1(int i) {
        System.out.println(i+++i);
    }
     
    void methodA2(int i) {
        System.out.println(--i-i--);
    }
}
 
class B {
    A a = new A() {
        void methodA1(int i) {
            System.out.println(++i+i++);
        }
        void methodA2(int i){
            System.out.println(i---i);
        }
    };
}
 
public class MainClass {
    public static void main(String[] args) {
        A a = new A();
        a.methodA1(10);     //21
        a.methodA2(10);     //0
        B b = new B();
        b.a.methodA1(10);   //22
        b.a.methodA2(10);   //1
    }
}
```
运行结果:
21
0
22
1

#### 14. 以下代码能否通过编译，为什么
```
class A
{
    class B extends A
    {
        class C extends B
        {
            class D extends C
            {
                 
            }
        }
    }
}
```
编译通过，因为可以多重继承。


#### 15. 在下面的示例中，如何访问“内部类”的“i”字段？
```
class OuterClass
{
    static class InnerClass
    {
        int i;
    }
}
```


#### 16.
```
class A
{   
    abstract class B
    {
        abstract void method();
    }
     
    {
        new B() {
            @Override
            void method(){
                System.out.println("BBB");
            }
        }.method();
    }
}
 
public class MainClass {
    public static void main(String[] args) {
        new A();
    }
}
```
运行结果:
BBB


#### 17. 如何在class A以外的其他类中实例化 class B
```
class A
{
    void methodA()
    {
        class B
        {
             
        }
    }
}
```

#### 18.
```
public class Outer {                //
	public static int temp1 = 1; 
	private static int temp2 = 2; 
	public int temp3 = 3;           //
	private int temp4 = 4;          //
	
	public static class Inner 
	{ 
		private static int temp5 = 5; 
		
		private static int getSum() 
		{ 
			return (temp1 + temp2 + temp3 + temp4 + temp5);     //
		} 
	} 
	
	public static void main(String[] args) 
	{ 
		Outer.Inner obj = new Outer.Inner(); 
		System.out.println(obj.getSum()); 
	} 
	
} 
```
运行结果:
15

#### 19.
```
interface Anonymous 
{ 
	public int getValue(); 
} 
public class Outer 
{ 
	private int data = 15; 
	public static void main(String[] args) 
	{ 
		Anonymous inner = new Anonymous() 
				{ 
					int data = 5; 
					public int getValue() 
					{ 
						return data; 
					} 
					public int getData() 
					{ 
						return data; 
					} 
				}; 
		Outer outer = new Outer(); 
		System.out.println(inner.getValue() + inner.getData() + outer.data); 
	} 
} 
```
运行结果:
25