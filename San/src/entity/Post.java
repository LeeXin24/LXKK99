package entity;

/**
 * @author jitwxs
 * @date 2021年07月01日 14:19
 */
public class Post {
    /*id，title(标题),context(帖子内容),ctreatetime(帖子发布时间:格式如下:yyyy-MM-dd HH:mm:ss) 用户id*/
    //帖子编号
    private String id;
    //帖子标题
    private String title;
    //帖子内容
    private String context;
    //帖子发布时间
    private String ctreatetime;
    //用户id
    private String userId;

    public Post() {
    }

    public Post(String id, String title, String context, String ctreatetime, String userId) {
        this.id = id;
        this.title = title;
        this.context = context;
        this.ctreatetime = ctreatetime;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
                "title='" + title + '\'' +
                ", context='" + context + '\'' +
                ", ctreatetime='" + ctreatetime + '\'' +
                '}';
    }
}
