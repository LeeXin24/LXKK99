
用方法做：
### 1.去除上述数组中的重复数据，并且对去除之后的数组进行排序
### 2.将数组中的数据进行首尾交换    

```java
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        
        思考: 如果使用方法对a   b 两个数进行交换，会得到什么结果

```

### 3.对指定的数组里面的数据做添加，删除操作 提供以下方法
```java
//在做此练习时，要考虑数组的的长度是否足够新添加的数据存放

/**
    arr 目标数组
    number 要添加的数据
    index  指定的位置
*/
public  static  String [] add(String [] arr,String number,int index){

        return null;
}

/**
    arr 目标数组
    number 要删除的数据的下标
*/

public static  String [] delete(String [] arr,int number){
    
    return null;
}
```
### 4. 编写一个方法不使用 * 完成两个数相乘   6*8
```
int multiply(int n1, int n2) {
        
}
```
### 5. 编写一个main方法用来测试上述两个方法，定义一个数组，内容 {13,26,-3,4,54,26,37,18,69,-10}，
###	   编写一个print方法，使用字符串拼接的方式，将数组内容数组输出为如下格式，每5个换行
```
[0]=13 [1]=26 [2]=-1 [3]=4 [4]=54
[5]=26 ....
```
### 6. 编写一个sortArr方法
```
/**
* 根据传入的参数来将数组升序或降序排列
*
* @param isAsc true 升序， false 降序
* @param arr
*/
static void sort(int arr[], boolean isAsc) {
    
    if(isAsc){
        //升序
    }else{
        //降序
    }
    
}
```

