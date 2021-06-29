### 编程练习
使用java类描述一个学生类和其子类(小学生类、 中学生类， 高中生类)。
* 学生都具备名字成员和对应的get和set方法，get和set方法不能够被子类重写。
  学生具备一个传入String名字的构造方法。
* 都具备学习的方法。调用学习的方法
* 编写一个main方法测试编写的类，依次创建小学生、中学生、高中生对象，分别调用学习的方法。

### 以下程序的输出结果是
要加上注释说明程序运行结果的原因。题目先自己想答案，然后运行代码查看结果和自己想的是否一致，然后记录注释
#### 例.
```
class A 
{ 
	public A(String s) 
	{ 
		System.out.print("A"); 
	} 
} 
public class B extends A 
{ 
    // 编译报错，因为类A中没有无参构造方法，子类构造方法中没有显式调用父类的构造方法
	public B(String s) 
	{ 
		System.out.print("B"); 
	} 
	public static void main(String[] args) 
	{ 
		new B("C"); 
		System.out.println(" "); 
	} 
} 
```
运行结果:
AB

#### 1.
```
class A {
    {
        System.out.println(1);
    }
}
 
class B extends A {
    {
        System.out.println(2);
    }
}
 
class C extends B {  //static
    {
        System.out.println(3);
    }
}
 
public class MainClass {   //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
    public static void main(String[] args) {
        C c = new C();
    }
}
```
运行结果:
1
2
3

#### 2.
```
class A {
    public A() {
        System.out.println("Class A Constructor");
    }
}
 
class B extends A {
    public B() {
        System.out.println("Class B Constructor");
    }
}
 
class C extends B {
    public C() {
        System.out.println("Class C Constructor");
    }
}
 
public class MainClass {  //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
    public static void main(String[] args) {
        C c = new C();
    }
}
```
运行结果:
Class A Constructor
Class B Constructor
Class C Constructor

#### 3.
```
class X {
    public X(int i) {
        System.out.println(1);
    }
}
 
 /*    public X() {
    }*/
class Y extends X {
    public Y() {  //因为类X中没有无参构造方法，子类构造方法中没有显式调用父类的构造方法
                //super();
        System.out.println(2);
    }
}
```
运行结果:
错误

#### 4.
```
public class A {
    public A() {
        System.out.println(1);
 
        super();  // 
 
        System.out.println(2);
    }
}
```
运行结果:
无法运行

#### 5.
```
public class A {  //类A是公共的, 应在名为 A.java 的文件中声明
    public A(int i) {
 
    }
}
 
class B extends A {     //需要创建匹配super的构造函数
    /*public B(int i) {
        super(i);
    }*/
 
}
```
运行结果:
无法运行

#### 6.
```
public class A {
    public A() {
        super();
 
        this(10);   //this语句不能和调用父类构造函数的super语句共存
    }
 
    public A(int i) {
        System.out.println(i);
    }
}
```
运行结果:
无法运行

#### 7.

```
class M {
    int i;
 
    public M(int i) {
        this.i = i--;
    }
}
 
class N extends M {
    public N(int i)
    {
        super(++i);
 
        System.out.println(i);
    }
}
 
public class MainClass    //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
{
    public static void main(String[] args)
    {
        N n = new N(26);
    }
}
```
运行结果:
27

#### 8.
```
class M {
    int i = 51;
 
    public M(int j) {
        System.out.println(i);
        this.i = j * 10;
    }
}
 
class N extends M {
    public N(int j) {
        super(j);
        System.out.println(i);
        this.i = j * 20;
    }
}
 
public class MainClass {    //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
    public static void main(String[] args) {
        N n = new N(26);
 
        System.out.println(n.i);
    }
}
```
运行结果:
51
260
520

#### 9.
```
class X {
    private int m = 48;     //把private去掉，子类不能调用父类的私有化的成员变量
}
 
class Y extends X {
    void methodOfY() {
        System.out.println(m);  //m报错
    }
}
```
运行结果:
48

#### 10.
```
class X {
    int m = 1111;
 
    {
        m = m++;
        System.out.println(m);
    }
}
 
class Y extends X {
    {
        System.out.println(methodOfY());
    }
 
    int methodOfY()    {
        return m-- + --m;
    }
}
 
public class MainClass    //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
{
    public static void main(String[] args)
    {
        Y y = new Y();
    }
}
```
运行结果:
1111
2220

#### 11.
```
class A {
	void A()
	{
		System.out.println(1);
	}
}
class B extends A {
	void B() {
		A();
	}
}
public class MainClass {    //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
	public static void main(String[] args) {
		new B().B();
	}
}
```
运行结果:
1

#### 12.
```
class A {
	int i = 1212;
}
class B extends A {
	A a;
	public B(A a) {
		this.a = a;
	}
}
public class MainClass {    //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
	public static void main(String[] args) {
		A a = new A();
		B b = new B(a);
		System.out.println(a.i);
		System.out.println(b.i);
		System.out.println(b.a.i);
		b.a.i = 2121;
		System.out.println("--------");
		System.out.println(a.i);
		System.out.println(b.i);
	}
}
```
运行结果:
1212
1212
1212
--------
2121
1212

#### 13.

```
class A
{
	int methodOfA(int i)
	{
		i /= 10;
		return i;
	}
}
class B extends A
{
	int methodOfB(int i)
	{
		i *= 20;
		
		return methodOfA(i);
	}
}
public class MainClass    //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
{
	public static void main(String[] args)
	{
		B b = new B();
		System.out.println(b.methodOfB(100));
	}
}
```
运行结果:
200

#### 14.
```
class One
{
	int x = 2121;
}
class Two extends One
{
	int x = 1212;
	
	{
		System.out.println(x);
	}
}
public class MainClass    //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
{
	public static void main(String[] args)
	{
		Two two = new Two();
	}
}
```
运行结果:
1212

#### 15.
```
class Clidder { 
    private final void flipper() { 
        System.out.println("Clidder"); 
    } 
} 
  
public class Clidlet extends Clidder {  //类Clidlet是公共的, 应在名为 Clidlet.java 的文件中声明
    public final void flipper() { 
        System.out.println("Clidlet"); 
    } 
    public static void main(String[] args) { 
        new Clidlet().flipper(); 
    } 
} 
```
运行结果:
Clidlet

#### 16.

```
class Alpha  
{ 
    static String s = " "; 
    protected Alpha()  
    { 
        s += "alpha "; 
    } 
} 
class SubAlpha extends Alpha  
{ 
    private SubAlpha()  
    { 
        s += "sub "; 
    } 
} 
  
public class SubSubAlpha extends Alpha    //类SubSubAlpha是公共的, 应在名为 SubSubAlpha.java 的文件中声明
{ 
    private SubSubAlpha()  
    { 
        s += "subsub "; 
    } 
    public static void main(String[] args)  
    { 
        new SubSubAlpha(); 
        System.out.println(s); 
        new SubAlpha();     //SubAlpha() 在 SubAlpha 中是 private 访问控制
    } 
} 
```
运行结果:
alpha subsub

#### 17.
```
class Grandparent { 
    public void Print() { 
        System.out.println("Grandparent's Print()");  
    }  
} 
  
class Parent extends Grandparent { 
    public void Print() { 
        System.out.println("Parent's Print()");  
    }  
} 
  
class Child extends Parent { 
    public void Print() { 
        super.super.Print();      //
        System.out.println("Child's Print()");  
    }  
} 
  
public class Main { 
    public static void main(String[] args) { 
        Child c = new Child(); 
        c.Print();  
    } 
} 
```
运行结果:
Parent's Print()
Child's Print()

#### 18.
```
final class Complex {
 
    private final double re;
    private final double im;
 
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
 
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
 
class Main {
  public static void main(String[] args) {
       Complex c = new Complex(10, 15);
       System.out.println("Complex number is " + c);
  }         
}
```
运行结果:
Complex number is (10.0 + 15.0i)

#### 19.
```
class A {
    String s = "Class A";
}
 
class B extends A {
    String s = "Class B";
 
    {
        System.out.println(super.s);
    }
}
 
class C extends B {
    String s = "Class C";
 
    {
        System.out.println(super.s);
    }
}
 
public class MainClass {    //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.s);
    }
}
```
运行结果:
Class A
Class B
Class C

#### 20.
```
class A {
    static {
        System.out.println("THIRD");
    }
}
 
class B extends A {
    static {
        System.out.println("SECOND");
    }
}
 
class C extends B {
    static {
        System.out.println("FIRST");
    }
}
 
public class MainClass {    //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
    public static void main(String[] args) {
        C c = new C();
    }
}
```
运行结果:
THIRD
SECOND
FIRST

#### 21.
```
class X {
    static void staticMethod() {
        System.out.println("Class X");
    }
}
 
class Y extends X {
    static void staticMethod() {
        System.out.println("Class Y");
    }
}
 
public class MainClass {    //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
    public static void main(String[] args) {
        Y.staticMethod();
    }
}
```
运行结果:
Class Y

#### 22.

```
class M {
    static {      //static修饰的类加载完成，就分配完空间
        System.out.println('A');
    }
 
    {
        System.out.println('B');
    }
 
    public M() {
        System.out.println('C');
    }
}
 
class N extends M {
    static {      //static修饰的类加载完成，就分配完空间
        System.out.println('D');
    }
 
    {
        System.out.println('E');
    }
 
    public N() {
        System.out.println('F');
    }
}
 
public class MainClass {    //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
    public static void main(String[] args) {
        N n = new N();
    }
}
```
运行结果:
A
D
B
C
E
F

#### 23.

```
class A {
	static String s = "AAA";
	static {
		s = s + "BBB";
	}
	{
		s = "AAABBB";
	}
}
class B extends A {
	static {
		s = s + "BBBAAA";
	}
	{
		System.out.println(s);
	}
}
public class MainClass    //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
{
	public static void main(String[] args) {
		B b = new B();
	}
}
```
运行结果:
AAABBB

#### 24.
```
class X
{
	int i = 101010;
	public X() {
		i = i++ + i-- - i;
	}
	static int staticMethod(int i) {
		return --i;
	}
}
class Y extends X
{
	public Y()
	{
		System.out.println(staticMethod(i));
	}
}
public class MainClass {    //类MainClass是公共的, 应在名为 MainClass.java 的文件中声明
	public static void main(String[] args)
	{
		Y y = new Y();
	}
}
```
运行结果:
101010

#### 25.
```
class ClassOne {
     static int i, j = 191919;
 
     {
         --i;
     }
 
     {
         j++;
     }
}
 
public class ClassTwo extends ClassOne
{
    static {
        i++;
    }
 
    static
    {
        --j;
    }
 
    public static void main(String[] args) {
        System.out.println(i);
 
        System.out.println(j);
    }
}
```
运行结果:
1
191918

#### 26.
```
class A
{
	int[] a = new int[5];
	{
		a[0] = 10;
	}
}
public class MainClass extends A {
	{
		a = new int[5];
	}
	{
		System.out.println(a[0]);
	}
	public static void main(String[] args)
	{
		MainClass main = new MainClass();
	}
}
```
运行结果:
0

#### 27.
```
class A {
	static int i;
	static {
		i++;
	}
	{
		++i;
	}
}
class B extends A
{
	static
	{
		--i;
	}
	{
		i--;
	}
}
public class MainClass
{
	public static void main(String[] args)
	{
		System.out.println(new B().i);
	}
}
```
运行结果:
0

#### 28.
```
public class MainClass
{
	public MainClass(int i, int j)
	{
		System.out.println(method(i, j));
	}
	
	int method(int i, int j)
	{
		return i++ + ++j;
	}
	
	public static void main(String[] args) 
	{
		MainClass main = new MainClass(10, 20);
	}
}
```
运行结果:
31

#### 29.
```
class X
{
	static
	{
		Y.methodOfY();
	}
}
class Y extends X
{
	static void methodOfY()
	{
		System.out.println("Hi....");
	}
}
public class MainClass
{
	public static void main(String[] args)
	{
		Y.methodOfY();
	}
}
```
运行结果:
Hi....
Hi....

#### 30.
```
class ClassOne {
  static int i = 111;
  int j = 222;
  {
    i = i++ - ++j;
  }
}
class ClassTwo extends ClassOne {
  {
    i = -113;
    j = i-- + --j;
  }
}
class Main {
  public static void main(String args[]) {
    ClassTwo clsTwo = new ClassTwo();
    System.out.println(clsTwo.i);
    System.out.println(clsTwo.j);
  }
}
```
运行结果:
-114
109