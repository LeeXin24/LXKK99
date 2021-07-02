package service;

import pojo.User;

public  abstract class UserService {

        //登录系统
        public static boolean login(String username, String password) {
                return false;
        }

        //注册用户
        public  abstract void  register(User user);

        //注销用户
        public  abstract  void  deleteuser(String  Userid);

        //修改帖子
        public  abstract void  updateuser(String  Userid);


    }