package lab08.ex3p3;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contain(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map,
                                           int key,
                                           int value) {
        for (int tempKey : map.keySet()) {
            if (tempKey == key && map.get(tempKey) == value) return true;
        }
        return false;
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        if (value > 2 || value < 0) {
            return null;
        }

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(0, "black");
        map.put(1, "white");
        map.put(2, "red");

        return map.get(value);
    }
}