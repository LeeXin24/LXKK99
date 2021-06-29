### 目的
通过练习来掌握类的声明和使用，熟悉引用变量的使用

### 练习
1. 在`class Fridge` 基础上进行修改，增加一个方法`Elephant remove()`，
   将大象从冰箱中取出来，调用这个方法将返回之前保存的大象对象，
   注意需要将冰箱中原本的大象对象的引用清除，请思考要如何做来清除一个变量的引用。
2. 构建一个狮子类，将冰箱类进行扩展，增加一个保存狮子类的成员变量。
   在Fridge.java 中重载`store()`方法用于保存狮子对象，
   在两个store 方法中增加判断，如果冰箱中已经装入了大象或者狮子，
   就不能再装了，向控制台输出`冰箱已经满了`。
3. 在`class Main`中增加一个方法
   `static Lion createLion(int heightInCM)`用于创建狮子对象。
   `main`方法中增加创建狮子类对象，
   调用`fridge.store()` 传入狮子对象，编译运行代码。
   程序最后将会输出`冰箱已经满了`


```java
/**
 * 为一个小型录象带出租店设计一个简单的库存控制系统。
 定义两个类:Video和VideoStore。
 Video对象至少具有以下属性（其他属性可以按需扩展）:
 - 片名
 - 是否被出租的标识
 - 用户的平均评分
 此外，需要定义一些方法操作这些属性。
 VideoStore类
 将包含一个Video数组。
 VideoStore中定义方法
 void addVideo(String): 添加一个新的电影
 boolean checkOut(String): 根据片名借出电影
 returnVideo(String): 归还电影
 receiveRating(String, int) : 设置用户对电影的评分(1~5)，收到评分之后，计算该电影的平均评分，然后保存到Video的评分属性中
 listInventory(): 列出整个库存的电影。
 创建VideoStoreLauncher类，作为程序入口，main方法将测试其他两个类的功能。
 新增《黑客帝国》、《教父》、《星球大战》3部影片。
 给每个视频打分。
 每个视频出租一次，然后归还。
 列出《教父》租出去后的库存。
 打印商店的库存，列出每个影片的:
 - 片名
 - 平均评分,
 - 是否借出
 *
 *
 */
public class Video {
    //- 片名
// - 是否被出租的标识
// - 用户的平均评分
    private String name;
    private boolean isRent;
    private int mark;//用户的平均评分
    private int markTimes; //用户评分次数

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRent() {
        return isRent;
    }

    public boolean setRent(boolean rent) {
        //TODO
        return true;
    }

    public int getMark() {
        return mark;
    }

    public int getMarkTimes() {
        return markTimes;
    }

    public void setMarkTimes(int markTimes) {
        this.markTimes = markTimes;
    }

    public void setMark(int mark) {
        //TODO
    }

    public class VideoStore {
        private Video[] videos = new Video[10];
        private int count;

        /**
         * 添加一个新的电影
         * 通过电影的名称创建一个video对象，将对象保存在数组中
         *
         * @param name 电影的名称
         */
        public void addVideo(String name) {
            //TODO
        }

        /**
         * 根据片名借出电影
         *
         * @return 成功借出电影，返回true,如果片名不存在，则返回false
         */
        public boolean checkOut(String videoName) {
            //TODO
            return false;
        }

        /**
         * 归还电影
         *
         * @return 成功归还电影，返回true,如果片名不存在，则返回false
         */
        public boolean returnVideo(String videoName) {
            //TODO
            return false;
        }

        /**
         * 根据 电影名称查询电影
         *
         * @param videoName
         * @return 匹配到的电影，如果找不到对应名称的电影，返回null
         */
        private Video findVideoByName(String videoName) {
            //TODO
            return null;
        }

        /**
         * 设置用户对电影的评分(1~5)，收到评分之后，计算该电影的平均评分，
         */
        public void receiveRating(String videoName, int mark) {
            //TODO
        }

        public void listInventory() {
            //TODO
        }

        public static void main(String[] args) {
            VideoStore videoStore = new VideoStore();
            videoStore.addVideo("黑客帝国");
            videoStore.addVideo("教父");
            videoStore.addVideo("沉默的羔羊");
            videoStore.listInventory();
            videoStore.checkOut("教父");
            videoStore.listInventory();
            videoStore.returnVideo("教父");
            videoStore.receiveRating("教父", 4);
            videoStore.listInventory();
        }
    }
}



```