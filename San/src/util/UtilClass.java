package util;

import com.alibaba.fastjson.JSONObject;
import entity.Post;
import entity.Type;
import entity.User;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jitwxs
 * @date 2021年07月01日 15:35
 */
public class UtilClass {

    /**
     * @author jitwxs
     * @date 2021/7/1 15:37
     * @param file
     * @return java.util.List<com.yuanren.ThressProgram.entity.User>
     *     返回User.json里面的集合
     */
    public static List<User> userList(File file){
        char[] chars=new char[(int)file.length()];
        List<User> users =null;
        try {
            FileReader fileReader = new FileReader(file);
            fileReader.read(chars);
            String s=new String(chars);
            fileReader.close();
            users = JSONObject.parseArray(s, User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    /**
     * @author jitwxs
     * @date 2021/7/1 15:41
     * @param file
     * @return java.util.List<com.yuanren.ThressProgram.entity.Post>
     *     返回Post.json里面的集合
     */
    public static List<Post> postList(File file){
        char[] chars=new char[(int)file.length()];
        List<Post> posts =null;
        try {
            FileReader fileReader = new FileReader(file);
            fileReader.read(chars);
            String s=new String(chars);
            fileReader.close();
            posts = JSONObject.parseArray(s, Post.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return posts;
    }

    /**
     * @author jitwxs
     * @date 2021/7/1 15:42
     * @param file
     * @return java.util.List<com.yuanren.ThressProgram.entity.Type>
     *     返回type.json里面的集合
     */
    public static List<Type> typeList(File file){
        char[] chars=new char[(int)file.length()];
        List<Type> types =null;
        try {
            FileReader fileReader = new FileReader(file);
            fileReader.read(chars);
            String s=new String(chars);
            fileReader.close();
            types = JSONObject.parseArray(s, Type.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return types;
    }

    /**
     * @author jitwxs
     * @date 2021/7/1 16:15
     * @param name
     * @param users
     * @return boolean
     *  判断姓名是否存在
     */
    public static boolean isName(String name,List<User> users){
        for (User user : users) {
            if(name.equals(user.getUsername())){
                return true;
            }
        }
        return false;
    }

    /**
     * @author jitwxs
     * @date 2021/7/1 16:17
     * @param users
     * @param posts
     * @param types
     *  输出所有帖子
     */
    public static void printPost(List<User> users,List<Post> posts,List<Type> types){
        for (int i = 0; i < posts.size(); i++) {
            System.out.println("帖子名称："+posts.get(i).getTitle());
            System.out.println("帖子内容："+posts.get(i).getContext());
            for (int j = 0; j < users.size(); j++) {
                if(posts.get(i).getUserId().equals(users.get(j).getId())){
                    System.out.println("帖子作者："+users.get(j).getUsername());
                    break;
                }
            }
            System.out.println("帖子发布时间：："+posts.get(i).getCtreatetime());
            for (int k = 0; k < types.size(); k++) {
                if(posts.get(i).getId().equals(types.get(k).getId())){
                    System.out.println("帖子类型："+types.get(k).getType());
                    break;
                }
            }
            System.out.println();
        }
    }

    /**
     * @author jitwxs
     * @date 2021/7/1 16:34
     * @param user
     * @param posts
     * @param types
     *  输出自己的所有帖子
     */
    public static List<String> printUserPost(User user,List<Post> posts,List<Type> types){
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < posts.size(); i++) {
            if(posts.get(i).getUserId().equals(user.getId())) {
                System.out.println("帖子名称：" + posts.get(i).getTitle());
                System.out.println("帖子内容：" + posts.get(i).getContext());
                System.out.println("帖子作者：" + user.getUsername());
                System.out.println("帖子发布时间：：" + posts.get(i).getCtreatetime());
                for (int k = 0; k < types.size(); k++) {
                    if (posts.get(i).getId().equals(types.get(k).getId())) {
                        System.out.println("帖子类型：" + types.get(k).getType());
                        break;
                    }
                }
                strings.add(posts.get(i).getId());
                System.out.println();
            }
        }
        return strings;
    }

    /**
     * @author jitwxs
     * @date 2021/7/1 16:50
     * @param id
     * @param posts
     * @return int
     * 根据id获取posts集合下的下标
     */
    public static int indexPostID(String id,List<Post> posts){
        for (int i = 0; i < posts.size(); i++) {
            if(id.equals(posts.get(i).getId())){
                return i;
            }
        }
        return -1;
    }

    /**
     * @author jitwxs
     * @date 2021/7/1 17:28
     * @param id
     * @param types
     * @return int
     * 根据id获取types集合下的下标
     */
    public static int indexTypeID(String id,List<Type> types){
        for (int i = 0; i < types.size(); i++) {
            if(id.equals(types.get(i).getId())){
                return i;
            }
        }
        return -1;
    }


    /**
     * @author jitwxs
     * @date 2021/7/1 17:28
     * @param posts
     * @param file
     * 推送集合到json文件
     */
    public static void addPostList(List<Post> posts,File file){
        String s = JSONObject.toJSONString(posts);
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(s);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @author jitwxs
     * @date 2021/7/1 17:28
     * @param types
     * @param file
     * 推送集合到json文件
     */
    public static void addTypeList(List<Type> types,File file){
        String s = JSONObject.toJSONString(types);
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(s);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @author jitwxs
     * @date 2021/7/1 17:33
     * @param type
     * @param types
     * @return java.util.List<java.lang.String>
     *     根据类型返回集合
     */
    public static List<String> indexTypeList(String type,List<Type> types){
        List<String> strings = new ArrayList<String>();
        for (int i = 0; i < types.size(); i++) {
            if(type.equals(types.get(i).getType())){
                strings.add(types.get(i).getId());
            }
        }
        return strings;
    }


    public static void printTypeListPost(String type,List<String> strings1,List<Post> posts,List<User> users){
        for (int i = 0; i < posts.size(); i++) {
            for (int j = 0; j < strings1.size(); j++) {
                if(posts.get(i).getId().equals(strings1.get(j))){
                    System.out.println("帖子名称：" + posts.get(i).getTitle());
                    System.out.println("帖子内容：" + posts.get(i).getContext());
                    for (int m = 0; m < users.size(); m++) {
                        if (posts.get(i).getUserId().equals(users.get(m).getId())) {
                            System.out.println("帖子作者：" + users.get(m).getUsername());
                            break;
                        }
                    }
                    System.out.println("帖子发布时间：：" + posts.get(i).getCtreatetime());
                    System.out.println("帖子类型：" + type);
                    System.out.println();
                }
            }


        }
    }


}
