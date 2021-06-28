package practice.service;


import practice.pojo.Business;

public  abstract class BusinessService {

    /**
     * 商家登录系统
     * @param name
     * @param password
     * @return
     */
  public   abstract boolean  login(String  name,String password);

    /**
     * 商家注册
     * @param business
     */
  public  abstract void  register(Business business);


    /**
     * 商家注销账户
     */
   public  abstract  void  deleteBusiness(String  IDCard);


    /**
     * 商家修改信息
     */
    public  abstract void  updateBusiness(String  IDCard);


}
