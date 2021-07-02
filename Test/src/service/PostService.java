package service;

import pojo.Post;

public abstract   class PostService {
    //对帖子的操作

    //用户可以添加帖子
    public abstract void  addPost(String title);

    //用户修改帖子标题
    public  abstract  void  updatePost(String PostId);

    //用户可以根据标题来查询帖子
    public abstract Post[] getPost(String title);

    //根据帖子Postid来删除帖子
    public  abstract void  deletePost(String Postid);

}