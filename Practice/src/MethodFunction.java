public class MethodFunction {

    private DButil dButil = new DButil();  //保持dButil对象的唯一性 就是为了保持 dbutil对象的数组唯一
    /**
     * 对 User数组做添加操作
     * @param user
     */
    public void addUser(User user){
        //首先要获取users数组
        User[] users = dButil.getUsers();
        int index = dButil.getIndex();
        users[index]=user;
        index++;
        dButil.setIndex(index);//自加之后要把自加之后的索引重新赋值给dbutil对象的index   方便下一次调用addUser()获取index
    }

    public void deleteUser(String name){   //根据唯一条件删除
        //去判断对象数组中是否存在 姓名为name的 对象
        if(name==null){
            return;
        }
        User[] users = dButil.getUsers();
        for (int i = 0; i <users.length; i++) {
            if(name.equals(users[i].getName())){
                //如果在数组中找到这个对象   对其进行删除操作
                users[i]=null;
                for (int j = i; j < users.length-1; j++) {
                    users[j]=users[j+1];
                    if(j==users.length-1){
                        users[j]=null;
                        break;
                    }
                }
                break;
            }
        }
        int index = dButil.getIndex();
        //删除之后  index减少一次
        dButil.setIndex(index--);
    }
    /**
     * @param idCard 用户编号
     * @param password 密码
     * @param address  地址
     * @param phone  联系方式
     *
     */
    public  void updateUser(String idCard,String password,String address,String phone){
        if(idCard==null){
            return;
        }
        User[] users = dButil.getUsers();
        for (int i = 0; i <users.length ; i++) {
            if(idCard.equals(users[i].getIdCard())){
                users[i].setPassword(password);
                users[i].setPhone(phone);
                users[i].setAddress(address);
                break;
            }
        }
    }
    /**
     * 打印数组中所有的元素
     */
    public void  print(){
        User[] users = dButil.getUsers();
        for (int i = 0; i < dButil.getIndex(); i++) {
            System.out.println(users[i].toString());
        }
    }
}