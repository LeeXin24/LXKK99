package pojo;

public class Post {
    //帖子Post id，title(标题),context(帖子内容),ctreatetime(帖子发布时间:格式如下:yyyy-MM-dd HH:mm:ss) 用户id
    private String postid;
    private String title;
    private String context;
    private String ctreatetime;
    private String userId;

    public Post(String postid, String title, String context, String ctreatetime, String userId) {
        this.postid = postid;
        this.title = title;
        this.context = context;
        this.ctreatetime = ctreatetime;
        this.userId = userId;
    }

    public String getPostid() {
        return postid;
    }

    public void setPostid(String postid) {
        this.postid = postid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getCtreatetime() {
        return ctreatetime;
    }

    public void setCtreatetime(String ctreatetime) {
        this.ctreatetime = ctreatetime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postid='" + postid + '\'' +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", ctreatetime='" + ctreatetime + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}