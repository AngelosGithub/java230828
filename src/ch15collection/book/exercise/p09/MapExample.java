package ch15collection.book.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int scoreSum = 0;
        int totalScore = 0;


        Set<Map.Entry<String, Integer>> map1 = map.entrySet();

        for(Map.Entry<String , Integer > entry : map1) {
            scoreSum += entry.getValue();
        }
        System.out.println("scoreSum = " + scoreSum);

        totalScore = scoreSum/map.size();

        System.out.println("totalScore = " + totalScore);

        for(Map.Entry<String , Integer > entry : map1) {
            int v1 = entry.getValue();
            System.out.println(v1);
            if (maxScore < entry.getValue()) {
                maxScore = entry.getValue();
                name = entry.getKey();
            }

//            maxScore = Math.max(v1);
        }
        System.out.println("maxScore = " + maxScore);
        System.out.println("name = " + name);
    }
}
