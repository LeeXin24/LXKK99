### 以下程序的输出结果是
#### 1.
```
interface A {
    void myMethod();
}
 
class B {
    public void myMethod() {
        System.out.println("My Method");
    }
}
 
class C extends B implements A
{
     
}
 
class MainClass {
    public static void main(String[] args) {
        A a = new C();
         
        a.myMethod();
    }
}
```
运行结果:
My Method

#### 2.
```
interface A { 
    void myMethod(); 
    void getInfo(); 
} 
  
abstract class B implements A { 
    void getData() { 
        System.out.println("B"); 
    } 
} 
  
public class Test extends B { 
    public void myMethod() { 
        System.out.println("myMethod"); 
    } 
    public void getInfo() 
    { 
        System.out.println("getInfo"); 
    } 
      
    public static void main(String[] args) 
    { 
        B obj = new Test(); 
        obj.getInfo(); 
    } 
}
```
运行结果:
getInfo

#### 3.
```
interface A
{
    int i = 111;
}
 
class B implements A 
{
    void methodB()
    {
        i = 222;    //无法为最终变量i分配值
    }
}
```
运行结果:
无法运行

#### 4.以下内容是否编译通过，如果不能请指出错误原因
```
class A {
    //Class A
}
 
interface B extends A {     //接口只能继承接口
    //Interface B extending Class A
}
```
运行结果:
无法运行

#### 5.
```
interface P {
    String p = "PPPP";  
    String methodP();
}
 
interface Q extends P {
    String q = "QQQQ"; 
    String methodQ();
}
 
class R implements P, Q {
    public String methodP() {
        return q+p;
    }
     
    public String methodQ() {
        return p+q;
    }
}
 
public class MainClass {
    public static void main(String[] args) {
        R r = new R();
         
        System.out.println(r.methodP());
         
        System.out.println(r.methodQ());
    }
}
```
运行结果:
QQQQPPPP 
PPPPQQQQ

#### 6.
```
class A implements B
{   
    public int methodB(int i)
    {
        return i =+ i * i;
    }
}
 
interface B
{
    int methodB(int i);
}
 
public class MainClass 
{
    public static void main(String[] args)
    {
        B b = new A();
         
        System.out.println(b.methodB(2));
    }
}
```
运行结果:
4

####  7.以下内容是否编译通过，如果不能请指出错误原因
```
interface A     //类型错误 && 非法类型开始
{
    {
        System.out.println("Interface A");
    }
     
    static
    {
        System.out.println("Interface A");
    }
}
```
运行结果:
编译错误
无法运行

####  8.以下内容是否编译通过，如果不能请指出错误原因
```
interface ABC
{
	public void methodOne();
	
	public void methodTwo();
}

interface PQR extends ABC
{
	public void methodOne();
	
	public void methodTwo();
}
```
运行结果:
编译通过
无法运行输出结果

#### 9.
```
interface ABC {
	void methodOne();
}

interface PQR extends ABC {	
	void methodTwo();
}

abstract class XYZ implements PQR {
	public void methodOne() {
		methodTwo();
	}
}

class MNO extends XYZ {
	public void methodTwo() {
		methodOne();
	}
}

public class MainClass {
	public static void main(String[] args) {
		ABC abc = new MNO();
		
		abc.methodOne();
	}
}
```
运行结果:
编译通过
输出结果错误


#### 10.
```
interface X {
    char c = 'A';
     
    char methodX();
}
 
class Y implements X {
    {
        System.out.println(c);
    }
     
    public char methodX() {
        char c = this.c;
         
        return ++c;
    }
}
 
public class MainClass {
    public static void main(String[] args) {
        Y y = new Y();
         
        System.out.println(y.methodX());
         
        System.out.println(y.c);
         
        System.out.println(X.c);
    }
}
```
运行结果:
A
B
A
A

#### 11.
```
interface One {
    String s = "FINAL";    
    String methodONE();
}
 
interface Two {
    String methodONE();
}
 
abstract class Three {
    String s = "NOT FINAL";
     
    public abstract String methodONE();
}
 
class Four extends Three implements One, Two {
    public String methodONE() {
        String s = super.s + One.s;
        return s;
    }
}
 
public class MainClass {
    public static void main(String[] args) {
        Four four = new Four();    
        System.out.println(four.methodONE());
        One one = four;
        System.out.println(one.s);
    }
}
```
运行结果:
NOT FINALFINAL
FINAL

#### 12.
```
interface X {
    void method();
}
 
class Y {
    public void method() {
        System.out.println("CLASS Y");
    }
}
 
class Z extends Y implements X {
     
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        X x = new Z();
         
        x.method();
    }
}
```
运行结果:
CLASS Y

#### 13.
```
interface A {
    int methodA();
}
interface B {
    int methodB();
}
interface C {
    int methodC();
}
class D implements A, B, C {
    int i = 999+111;        //999+111 = 1110
    public int methodA() {
        i =+ i / i;         //1110/1110 = 1
        return i;           //1
    }
    public int methodB() {
        i =- i * i;         //-1*1
        return i;           //-1
    }
    public int methodC(){
        i = ++i - --i;      //0-(-1)
        return i;           //1
    }
}
public class MainClass{
    public static void main(String[] args) {
        D d = new D();       
        System.out.println(d.i);            //1110
        System.out.println(d.methodA());    //1
        System.out.println(d.methodB());    //-1
        System.out.println(d.methodC());    //1
    }
}
```
运行结果:
1110
1
-1
1

#### 14.
```
interface A {
	String A = "AAA";
	String methodA();
}

interface B {
	String B = "BBB";
	String methodB();
}

class C implements A, B {
	public String methodA() {
		return A+B;
	}
	public String methodB() {
		return B+A;
	}
}
class D extends C implements A, B {
	String D = "DDD";
	public String methodA() {
		return D+methodB();
	}
}
public class MainClass {
	public static void main(String[] args) {
		C c = new C();		
		System.out.println(c.methodA());    //A+B
		System.out.println(c.methodB());    //B+A
		c = new D();
		System.out.println(c.methodA());    //D+B+A
		System.out.println(c.methodB());    //B+A
	}
}
```
运行结果:
AAABBB
BBBAAA
DDDBBBAAA
BBBAAA

#### 15.
```
interface X {
    void methodX();
}
 
interface Y extends X {
    void methodY();
}
 
class Z implements Y {      //Z不是抽象的, 并且未覆盖X中的抽象方法methodX()     //接口的方法要全部实现
    public void methodY() {
        System.out.println("Method Y");
    }
}
```
运行结果:
无法运行    //找不到或无法加载主类 MainClass

#### 16.
```
abstract class A {
    abstract void myMethod(Number N);
}
 
interface B {
    abstract void myMethod(Object O);
}
 
class C extends A implements B {
    public void myMethod(Number N) {
        System.out.println("Number");
    }
     
    public void myMethod(Object O) {
        System.out.println("Object");
    }
}
 
public class MainClass {
    public static void main(String[] args) {
        A a = new C();
        a.myMethod(new Integer(121));
        B b = new C();
        b.myMethod(new Integer(121));
        C c = new C();
        c.myMethod(new Integer(121));
    }
}
```
运行结果:
Number
Object
Number

#### 17.
```
class A { }
 
class B extends A { }
 
class C extends B { }
 
interface ABC {
    void method(A a);
}
 
interface PQR {
    void method(B b);
}
 
class M implements ABC, PQR {   
    public void method(A a) {
        System.out.println(2);
    }
     
    public void method(B b) {
        System.out.println(3);
    }
}
 
public class MainClass {
    public static void main(String[] args) {
        M m = new M();
        m.method(new A());
        m.method(new B());
        m.method(new C());
    }
}
```
运行结果:
2
3
3