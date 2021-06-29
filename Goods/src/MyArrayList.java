public abstract class MyArrayList implements MyList{

    private Object [] objects;
    private int count = 0;  //用来统计数组的个数

    public MyArrayList(){
        this.objects = new Object[1];
    }

    @Override
    public Object set(int index, Object element) {
        if (index < 0 || index > count-1) {
            return null;
        }
        Object obj = objects[index];
        objects[index] = element;
        return obj;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index > count-1) {
            return null;
        }
        return objects[index];
    }

    @Override
    public void clear() {
        this.objects = new Object[0];
        count = 0; //如果清空  count为0
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index > count-1) {
            return null;
        }
        Object obj = new Object[index];
        for (int i = index; i <count-1 ; i++) {
            Object temp = objects[i];
            objects[i] = objects[i+1];
            objects[i+1] = temp;
        }
        objects[objects.length-1] = null;
        count--;
        return obj;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < count; i++) {
            if (o.equals(objects[i])) {
                Object remove = remove(i);
                if (remove != null) {
                    count--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}