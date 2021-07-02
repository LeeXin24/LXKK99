import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class rm {
    public static void main(String[] args) {
        if(!args[0].equals("")&&!args[1].equals("")&&args[0]!=null&&args[1]!=null) {
            //获取当前工作目录
            String curruntPath=System.getProperty("user.dir");
            String fileStr=args[0];
            String copyToStr=args[1];
            File infile=new File(curruntPath+"\\"+fileStr);
            File outFile=new File(curruntPath+"\\"+copyToStr);
            PrintStream fileOut=null;
            PrintStream out=System.out;
            if(infile.exists()&&infile.isFile()) {
                try {
                    if(!outFile.exists()) {
                        outFile.createNewFile();
                    }
                    //完成文件的复制操作
                    fileOut=new PrintStream(outFile);
                    Scanner scanner=new Scanner(infile);
                    scanner.useDelimiter("\r\n");
                    System.setOut(fileOut);
                    String line=null;
                    while(scanner.hasNext()) {
                        line=scanner.next();
                        //scanner.next()
                        System.out.println(line);
                    }
                    //先关闭scanner,不然文件无法删除
                    scanner.close();
//                  //复制完成后删除源文件
                    infile.delete();
//                  System.out.println(infile.delete());
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                finally {
                    if(fileOut!=null) {
                        fileOut.close();
                    }

                    System.setOut(out);
                }
            } else {
                System.out.println("参数1错误"+infile.getAbsolutePath()+" 不是一个文件");
            }
        } else {
            System.out.println("参数错误！");
        }
    }
}