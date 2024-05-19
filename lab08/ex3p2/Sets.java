package lab08.ex3p2;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first,
                                                  Set<Integer> second) {
        Set<Integer> intersection = new LinkedHashSet<>();

        for (int element : first) {
            if (second.contains(element)) {
                intersection.add(element);
            }
        }

        return intersection;
    }

    public static Set<Integer> unionManual(Set<Integer> first,
                                           Set<Integer> second) {
        Set<Integer> union = new LinkedHashSet<>();

        for (int element : first) {
            union.add(element);
        }

        for (int element : second) {
            union.add(element);
        }
        return union;
    }

    public static Set<Integer> intersection(Set<Integer> first,
                                            Set<Integer> second) {
        Set<Integer> intersectionSet = new LinkedHashSet<>(first);
        intersectionSet.retainAll(second);
        return intersectionSet;
    }

    public static Set<Integer> union(Set<Integer> first,
                                     Set<Integer> second) {
        Set<Integer> unionSet = new LinkedHashSet<>(first);
        unionSet.addAll(second);
        return unionSet;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new LinkedList<>(source);
        return list;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new LinkedHashSet<>(source);
        List<Integer> list = new LinkedList<>(set);
        return list;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> list = new LinkedList<>();
        for (int element : source) {
            if (!list.contains(element)) {
                list.add(element);
            }
        }
        return list;
    }

    public static String firstRecurringCharacter(String s) {
        if (s.isEmpty()) {
            return "";
        }

        List<Character> list = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (list.contains(ch)) {
                return ch + "";
            } else {
                list.add(ch);
            }
        }
        return s.charAt(0) + "";
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] array = new Integer[source.size()];
        int i = 0;
        for (int element : source) {
            array[i] = element;
            i++;
        }
        return array;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}