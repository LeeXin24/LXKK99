package service;

import entity.User;

/**
 * @author jitwxs
 * @date 2021年07月01日 15:59
 */
public interface UserService {

    /**
     * 用户登录
     * @param name
     * @param password
     * @return
     */
    public   abstract User login(String  name, String password);

}
