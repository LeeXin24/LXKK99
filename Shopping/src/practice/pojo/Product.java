package practice.pojo;

import java.util.Date;

public class Product {
    private String pid;
    private String pName;
    private String pAddress;//产地
    private Date date;  //生产时间
    private String  pRecipe; //配方
    private Integer pCount;//库存
    private Double price;//价格

    private static int number;

    public Product() {
        pid = ""+ ++number;
    }

    public Product( String pName, String pAddress, Date date, String pRecipe, Integer pCount, Double price) {
        this.pName = pName;
        this.pAddress = pAddress;
        this.date = date;
        this.pRecipe = pRecipe;
        this.pCount = pCount;
        this.price = price;
        pid = ""+ ++number;

    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getpRecipe() {
        return pRecipe;
    }

    public void setpRecipe(String pRecipe) {
        this.pRecipe = pRecipe;
    }

    public Integer getpCount() {
        return pCount;
    }

    public void setpCount(Integer pCount) {
        this.pCount = pCount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid='" + pid + '\'' +
                ", pName='" + pName + '\'' +
                ", pAddress='" + pAddress + '\'' +
                ", date=" + date +
                ", pRecipe='" + pRecipe + '\'' +
                ", pCount=" + pCount +
                ", price=" + price +
                '}';
    }
}