package lab12.mylist;

public class MyArrayListIterator implements MyIterator {
    private Object[] data;
    private int currentPosition;

    public MyArrayListIterator(Object[] data) {
        this.data = data;
        this.currentPosition = 0;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < data.length && data[currentPosition] != null;
    }

    @Override
    public Object next() {
        return data[currentPosition++];
    }
}
