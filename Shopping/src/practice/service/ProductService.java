package practice.service;

import practice.pojo.Product;

public abstract   class ProductService {

    //对产品的操作
    /**
     * 商家添加商品
     * @param product
     */
    public abstract void  addProduct(Product product);
    /**
     * 商家修改产品信息
     */
    public  abstract  void  updateProduct(Product  product);
    /**
     * 商家根据名字来查询产品
     * @param pName
     * @return
     */
    public  abstract Product  getByProductName(String  pName);
    /**
     * 商家可以根据产品的生产时间来查询满足条件的商品
     *
     */
    public abstract Product[] getAllByDate(String   date);

    /**
     * 根据产品id来删除
     * @param pid
     */
    public  abstract void  deleteProduct(String  pid);


}