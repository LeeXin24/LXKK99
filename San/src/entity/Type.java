package entity;

/**
 * @author jitwxs
 * @date 2021年07月01日 14:24
 */
public class Type {

    /*id  type(类型) 如:军事栏目   体育栏目   娱乐栏目   等*/
    //帖子id
    private String id;
    //帖子类型
    private String type;

    public Type() {
    }

    public Type(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type='" + type + '\'' +
                '}';
    }
}
