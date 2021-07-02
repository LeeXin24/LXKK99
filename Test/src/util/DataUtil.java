package util;

import pojo.Post;
import pojo.User;

import java.util.Arrays;

public class DataUtil {

    private DataUtil(){

    }
    public static User[] user = new User[0];
    public static Post[] post = new Post[0];


    public  static  void  changeBusinessesArrayLength(){
        user=  Arrays.copyOf(user,user.length+1);
    }
    public  static  void  changeProductArrayLength(){
        post=  Arrays.copyOf(post,post.length+1);
    }


    public  static  void  del(User[] bus){
        user=Arrays.copyOf(bus,bus.length-1);
    }


    public static  void  print(){
        System.out.println(Arrays.toString(user));
    }
}