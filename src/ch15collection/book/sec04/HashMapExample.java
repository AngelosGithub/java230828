package ch15collection.book.sec04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("map.size() = " + map.size());
        System.out.println();

        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + " : " + value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k+" : "+v);
        }
        System.out.println();

        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k+ " : " +v);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("map.size() = " + map.size());
        System.out.println();

        // 향상된 for문
        for(Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println();

        // forEach
        map.forEach((key1, value1) -> System.out.println(key1+" : "+value1));
    }
}
