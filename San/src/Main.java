import entity.Post;
import entity.Type;
import entity.User;
import service.UserService;
import service.impl.UserServeltImpl;
import util.UtilClass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author jitwxs
 * @date 2021年07月01日 14:35
 */
public class Main {
    public static void main(String[] args) {
        /*完成:1.程序启动后可以看到所有的帖子（未登录的状态下）,包括要显示帖子的作者 （6分）
        如: 帖子名称   帖子内容  帖子作者  帖子发布的时间  帖子类型*/
        System.out.println("欢迎进入XXXXXXXXXXX论坛。。。。。。");
        System.out.println("本站有如下帖子：");
        File postFile = new File("San/post.json");
        File userFile = new File("San/user.json");
        File typeFile = new File("San/type.json");
        List<User> users = UtilClass.userList(userFile);
        List<Post> posts = UtilClass.postList(postFile);
        List<Type> types = UtilClass.typeList(typeFile);
        UtilClass.printPost(users,posts,types);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*2.登录之后可以查看自己所有的帖子 （4分）*/
        System.out.println("进行登录。。。。。");
        Scanner scanner = new Scanner(System.in);
        UserService userServelt = new UserServeltImpl();
        List<String> strings =null;
        while (true) {
            System.out.println("请输入用户名:");
            String name = scanner.next();
            System.out.println("请输入密码:");
            String password = scanner.next();
            User user = userServelt.login(name, password);
            if(user!=null){
                System.out.println("欢迎"+name+"登录论坛。。。。");
                /*2查看自己所有的帖子 （4分）
                3.用户可以删除自己的帖子  （4分）
                4.用户可以添加帖子（注意添加的帖子属于哪个类型） （4）
                5.可以修改帖子 （3分）
                6.查看指定类型的帖子（4分）*/
                int i=0;
                while(i!=5) {
                    try{
                        System.out.println("请输入需要的功能:");
                        System.out.println("1.删除自己的帖子 \t 2.添加帖子 \t 3.修改帖子  \t 4.查看指定类型的帖子 \t 5.退出");
                        strings = UtilClass.printUserPost(user, posts, types);
                        String in=scanner.next();
                        i=Integer.parseInt(in);
                        switch (i){
                            case 1:
                                //根据标题删除
                                while(true) {
                                    System.out.println("请输入需要删除帖子的id:");
                                    String PID=scanner.next();
                                    boolean existsPID=false;
                                    for (String string : strings) {
                                        if(PID.equals(string)){
                                            existsPID=true;
                                        }
                                    }
                                    if (existsPID) {//如果存在
                                        //删除post  和 type下的文件
                                        int postIndex = UtilClass.indexPostID(PID, posts);
                                        int typeIndex = UtilClass.indexTypeID(PID, types);
                                        posts.remove(postIndex);
                                        types.remove(typeIndex);
                                        //然后向文件推送新的list覆盖掉
                                        UtilClass.addPostList(posts,postFile);
                                        UtilClass.addTypeList(types,typeFile);
                                        System.out.println("删除成功！");
                                        break;
                                    } else {//如果不存在
                                        System.out.println("您输入的帖子ID不存在 请重新输入....");
                                    }
                                }
                                break;
                            case 2:
                                Post post = new Post();
                                Type type = new Type();
                                System.out.println("帖子id:");
                                String id = scanner.next();
                                System.out.println("帖子标题:");
                                String title = scanner.next();
                                System.out.println("帖子内容:");
                                String context = scanner.next();
                                System.out.println("帖子类型:");
                                String postType = scanner.next();
                                post.setId(id);
                                post.setTitle(title);
                                post.setContext(context);
                                Date date = new Date();
                                String time = format.format(date);
                                post.setCtreatetime(time);
                                post.setUserId(user.getId());
                                type.setId(id);
                                type.setType(postType);
                                posts.add(post);
                                types.add(type);
                                UtilClass.addPostList(posts,postFile);
                                UtilClass.addTypeList(types,typeFile);
                                System.out.println("添加成功！");
                                break;
                            case 3:
                                //根据标题删除
                                while(true) {
                                    System.out.println("请输入需要修改帖子的id:");
                                    String PID=scanner.next();
                                    boolean existsPID=false;
                                    for (String string : strings) {
                                        if(PID.equals(string)){
                                            existsPID=true;
                                        }
                                    }
                                    if (existsPID) {//如果存在
                                        //删除post  和 type下的文件
                                        int postIndex = UtilClass.indexPostID(PID, posts);
                                        int typeIndex = UtilClass.indexTypeID(PID, types);
                                        System.out.println("帖子标题:");
                                        title = scanner.next();
                                        System.out.println("帖子内容:");
                                        context = scanner.next();
                                        System.out.println("帖子类型:");
                                        postType = scanner.next();
                                        posts.get(postIndex).setTitle(title);
                                        posts.get(postIndex).setContext(context);
                                        types.get(typeIndex).setType(postType);
                                        //然后向文件推送新的list覆盖掉
                                        UtilClass.addPostList(posts,postFile);
                                        UtilClass.addTypeList(types,typeFile);
                                        System.out.println("修改成功！");
                                        break;
                                    } else {//如果不存在
                                        System.out.println("您输入的帖子ID不存在 请重新输入....");
                                    }
                                }
                                break;
                            case 4:
                                /*6.查看指定类型的帖子（4分）*/
                                while(true) {
                                    System.out.println("请输入查看的帖子类型:");
                                    postType=scanner.next();
                                    boolean existspostType=false;
                                    for (Type type1 : types) {
                                        if(postType.equals(type1.getType())){
                                            existspostType=true;
                                            break;
                                        }
                                    }
                                    if (existspostType) {//如果存在
                                        List<String> strings1 = UtilClass.indexTypeList(postType, types);
                                        UtilClass.printTypeListPost(postType,strings1,posts,users);
                                        break;
                                    } else {//如果不存在
                                        System.out.println("您输入的帖子类型不存在 请重新输入....");
                                    }
                                }

                                break;
                            case 5:
                                System.exit(0);
                                break;
                            default:
                                System.out.println("请输入正确内容。。。。。。");
                                break;
                        }
                    }catch (NumberFormatException e){
                        System.out.println("请根据提示输入正确内容。");
                    }
                }

                break;
            }else{
                //判断一下 原本的数组中是否已经存在注册过的名字了
                boolean existsName = UtilClass.isName(name,users);
                if(existsName){//如果存在
                    System.out.println("您输入的密码不正确 请重新输入....");
                }else {//如果不存在
                    System.out.println("您的账户不存在 请先注册用户....");
                }
            }


        }

    }
}
