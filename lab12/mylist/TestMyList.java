package lab12.mylist;

public class TestMyList {
    public static void main(String[] args) {
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        MyArrayList arrayList = new MyArrayList();
        arrayList.append(1.0);
        arrayList.append(2.0);
        arrayList.append(3.0);
        arrayList.append(4.0);

        BasicStatistic stats = new BasicStatistic(arrayList);
        System.out.println("MyArrayList: " + arrayList);
        System.out.println("Max: " + stats.max());
        System.out.println("Min: " + stats.min());
        System.out.println("Mean: " + stats.mean());
        System.out.println("Variance: " + stats.variance());
    }

    public static void testMyLinkedList() {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.append(1.0);
        linkedList.append(2.0);
        linkedList.append(3.0);
        linkedList.append(4.0);

        BasicStatistic stats = new BasicStatistic(linkedList);
        System.out.println("MyLinkedList: " + linkedList);
        System.out.println("Max: " + stats.max());
        System.out.println("Min: " + stats.min());
        System.out.println("Mean: " + stats.mean());
        System.out.println("Variance: " + stats.variance());
    }
}
