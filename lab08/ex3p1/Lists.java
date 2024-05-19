package lab08.ex3p1;

import java.util.*;

public class Lists {
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(List<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(List<Integer> list, int value) {
        list.set(2, value);
    }


    public static void removeThird(List<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(List<Integer> list) {
        list.remove(Integer.valueOf(666));
    }

    public static List<Integer> generateSquare() {
        List<Integer> squareList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            squareList.add(i * i);
        }
        return squareList;
    }

    public static boolean contains(List<Integer> list, int value) {
        for (int element : list) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    public static void copy(List<Integer> source, List<Integer> target) {
        target.clear();
        for (int element: source) {
            target.add(element);
        }
    }


    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(List<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            int value1 = list.get(i);
            int value2 = list.get(size - i - 1);
            list.set(i, value2);
            list.set(size - i - 1, value1);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.add(0, value);
        list.add(value);
    }
}