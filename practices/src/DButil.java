public class DButil {
    private User[] users=new User[5]; //user      null

    private  int index=0;


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }
}
