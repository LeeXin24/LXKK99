package service.impl;


import entity.User;
import service.UserService;
import util.UtilClass;

import java.io.File;
import java.util.List;

/**
 * @author jitwxs
 * @date 2021年07月01日 16:00
 */
public class UserServeltImpl implements UserService {
    @Override
    public User login(String name, String password) {
        File userFile = new File("examination/user.json");
        List<User> users = UtilClass.userList(userFile);
        for (User user : users) {
            if(name.equals(user.getUsername()) && password.equals(user.getPassWord())){
                return user;
            }
        }
        return null;
    }
}
