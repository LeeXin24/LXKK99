public abstract class Test {
    private int index;
    private Object element;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    abstract Object set(int index, Object element);

    public static void main(String[] args) {
        System.out.println();
    }
}