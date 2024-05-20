package lab12.mylist;

public class MyArrayList extends MyAbstractList {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] data;
    private int size;

    public MyArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return data[index];
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null;
    }

    @Override
    public void append(Object payload) {
        if (size == data.length) enlarge();
        data[size++] = payload;
    }

    @Override
    public void insert(Object payload, int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (size == data.length) enlarge();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = payload;
        size++;
    }

    @Override
    public MyIterator iterator() {
        return new MyArrayListIterator(data);
    }

    private void enlarge() {
        Object[] newData = new Object[data.length * 2];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}
