import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

//1m的字节数组 读取四次
public class ReadVideo {
    public static void main(String[] args) throws IOException {
        mp3Split();
        mp3Merge();
    }
    //切割
    public static void mp3Split() throws IOException{
        File file=new File("少年 - 梦然.mp3");
        File dir=new File("upload");

        FileInputStream fileInputStream=new FileInputStream(file);

        int len=0;
        byte []buf=new byte[1024*1024];
        for(int i=0;(len=fileInputStream.read(buf))!=-1;i++){
            FileOutputStream fileOutputStream=new FileOutputStream(new File(dir,"WIN"+i+".mp3"));
            fileOutputStream.write(buf, 0, len);
            fileOutputStream.close();//立即关
        }
        fileInputStream.close();
    }

    public static void mp3Merge() throws IOException{
        File dir=new File("upload");
//找到文件
        Vector <FileInputStream>vector=new Vector<FileInputStream>();

        File[] files=dir.listFiles();
//把传输通道加入vector
        for(File file:files){   //增强for遍历数组
            if(file.getName().endsWith(".mp3")){
                vector.add(new FileInputStream(file));
            }
        }
//通过vector获取迭代器
        Enumeration<FileInputStream> e=vector.elements();
        SequenceInputStream inputStream=new SequenceInputStream(e);
        FileOutputStream fileOutputStream=new FileOutputStream("upload/WIN.mp3");//文件夹注意了

        byte[]buf=new byte[1024];
        int len=0;
        while((len=inputStream.read(buf))!=-1){
            fileOutputStream.write(buf, 0, len);
        }
        fileOutputStream.close();
        inputStream.close();
    }
}