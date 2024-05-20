package lab12.mylist;

public class MyLinkedList extends MyAbstractList {
    private MyLinkedListNode head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        return getNodeByIndex(index).getPayload();
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            head = head.getNext();
        } else {
            MyLinkedListNode previousNode = getNodeByIndex(index - 1);
            MyLinkedListNode nodeToRemove = previousNode.getNext();
            previousNode.setNext(nodeToRemove.getNext());
        }
        size--;
    }

    @Override
    public void append(Object payload) {
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        if (head == null) {
            head = newNode;
        } else {
            MyLinkedListNode lastNode = getNodeByIndex(size - 1);
            lastNode.setNext(newNode);
        }
        size++;
    }

    @Override
    public void insert(Object payload, int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        MyLinkedListNode newNode = new MyLinkedListNode(payload);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            MyLinkedListNode previousNode = getNodeByIndex(index - 1);
            newNode.setNext(previousNode.getNext());
            previousNode.setNext(newNode);
        }
        size++;
    }

    @Override
    public MyIterator iterator() {
        return new MyLinkedListIterator(head);
    }

    private MyLinkedListNode getNodeByIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        MyLinkedListNode currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }
}
