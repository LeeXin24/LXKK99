package pra2;

public class LinkedList {

    // 头结点中的value保存链表的长度
    private Node head;
    private int count = 0;

    public LinkedList() {
        this.head = new Node();
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

        if (index < 0 || index > count) {
            throw new MyException("输入的位置有误");
        }
        Node node = getNode(index);
        return node.getValue();
    }

    private Node getNode(int index) {
        //TODO
        Node node = head;
        int i = 0;
        while (i < index) {
            node = node.getNext();
            i++;
        }
        return node;
    }

    /**
     * 清空集合内容
     */
    public void clear() {
        Node node = head;
        while (node != null) {
            node = node.getNext();
        }
        while (node.getPrev()!=null) {
            //找到最后一个节点
            node.setNext(null);
            node.setValue(null);
            node = node.getPrev();  // 获取上一个节点
            node.getNext().setPrev(null);
            node.setNext(null);
            addCount(-1);
        }
        node.setValue(null);  //nod最终就是head节点

    }

    /**
     * 删除指定下标的元素
     *
     * @param index 元素下标
     * @return 将删除的元素返回，如果下标不合理，返回null
     */
    public Object remove(int index) {

        Node node = getNode(index);
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());

        node.setPrev(null);
        node.setNext(null);
        Node   newNode=node;
        node.setValue(null);
        //TODO
        addCount(-1);
        return newNode.getValue();
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
    public boolean add(Object o) {
        //TODO

        if (o == null) {
            throw new MyException("数据不能为空");
        }
        if(head.getValue()==null){
            head.setValue(o);
            addCount(1);
            return true;
        }
        Node newNode = new Node();
        appendNode(newNode, o);
        addCount(1);
        return true;
    }

    //添加链表数据个数
    private void addCount(int count) {
        this.count += count;
    }

    private void appendNode(Node node, Object o) {
        //TODO
        Node node1 = head;
        for (int i = 0; i < count; i++) {
            if (node1.getNext() != null) {
                node1 = node1.getNext();
            }
        }
        node.setValue(o);
        node.setPrev(node1);
        node.setNext(null);
        node1.setNext(node);

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


       /* System.out.println(linkedList.isEmpty());

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
        System.out.println(linkedList.head);*/

    }
}
