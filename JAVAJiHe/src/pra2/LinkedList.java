package pra2;

public class LinkedList {

  // 头结点中的value保存链表的长度
  private Node head;
  private int count = 0;

  public LinkedList(){
  }

  /**
   * 更新数组指定下标的元素
   *
   * @param index   待更新的元素下标
   * @param element 更新后的元素对象
   * @return 被替换掉的旧对象
   */
  public Object set(int index, Object element) {
    //TODO
    return null;
  }

  /**
   * 查询指定位置下标的元素
   *
   * @param index 需要判断index是否合法
   * @return 返回查找到的元素，找不到返回null
   */
  public Object get(int index) {
    //TODO
    return null;
  }

  private Node getNode(int index) {
    //TODO
    return null;
  }

  /**
   * 清空集合内容
   */
  public void clear() {

  }

  /**
   * 删除指定下标的元素
   *
   * @param index 元素下标
   * @return 将删除的元素返回，如果下标不合理，返回null
   */
  public Object remove(int index) {
    //TODO
    return null;
  }

  /**
   * 查找并删除元素
   *
   * @param o 通过目标元素 equals 方法判断是否匹配，
   *          需要判断o是否为null，如果传入null，则用== 进行比较
   * @return
   */
  public boolean remove(Object o) {
    return false;
  }

  /**
   * 删除传入的节点元素
   * 将当前节点的前一个节点的下一个节点，设置为当前节点的下一个节点
   * 将当前节点的下一个节点的前一个节点，设置为当前节点的前一个节点
   *
   * @param node
   */
  private void removeNode(Node node) {
   //TODO
  }


  /**
   * 添加一个元素
   *
   * @param o
   * @return 添加成功后返回true 失败返回false
   */
  public boolean add(Object o){
    //TODO
    return false;
  }

  private void addCount(int count) {
    this.count += count;
  }

  private void appendNode(Node node, Object o) {
    //TODO
  }

  /**
   * @return 数组中没有元素，返回true
   */
  public boolean isEmpty() {
    return size() == 0;
  }

  /**
   * 返回数组中保存的元素个数
   *
   * @return
   */
  public int size() {
    return count;
  }

  public static void main(String[] args) {

    LinkedList linkedList = new LinkedList();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    linkedList.add(5);

    for (int i = 0; i < linkedList.size(); i++) {
      System.out.println(linkedList.get(i));
    }

    System.out.println(linkedList.isEmpty());

    System.out.println(linkedList.remove(1));

    System.out.println(linkedList.remove(Integer.valueOf(4)));

    System.out.println("============");

    for (int i = 0; i < linkedList.size(); i++) {
      System.out.println(linkedList.get(i));
    }
    linkedList.set(0, 200);
    System.out.println("+++++++++++++");
    for (int i = 0; i < linkedList.size(); i++) {
      System.out.println(linkedList.get(i));
    }

    linkedList.clear();

    System.out.println(linkedList.isEmpty());
    System.out.println(linkedList.head);

  }
}
