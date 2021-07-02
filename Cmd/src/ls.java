import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ls {
    public static void main(String[] args)
    {
/*        System.out.println(new File(" ").getAbsolutePath());
        String curruntPath=System.getProperty("user.dir");
        File dir=new File(curruntPath);
        String[] filelist=dir.list();
        assert filelist != null;
        for (String string : filelist)
        {
            System.out.printf("%-10s",string);
        }*/

    }


    public File[] getAll(File file){
        return file.listFiles();
    }


    public void cp (File file,File directory){
        if(!file.isFile()){
            try {
                throw new Exception("输入正确的文件名:");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!directory.isDirectory()){
            try {
                throw new Exception("输入正确的文件夹名");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        byte[] bytes = new byte[(int) file.length()];


    }
}
