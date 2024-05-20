package lab12.mylist;

public abstract class MyAbstractList implements MyList {
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        MyIterator iterator = iterator();
        while (iterator.hasNext()) {
            result.append("[").append(iterator.next()).append("] ");
        }
        return result.toString().trim();
    }
}
