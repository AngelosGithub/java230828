package CodingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Solution1046 {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for(int stone : stones) {
            list.add(stone);
        }
        //sort
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        //remove
        int stone1 = list.remove(0);
        int stone2 = list.remove(0);
        //add
        while (list.size()>1) {
            int diff = stone1 - stone2;
            if (diff>0) {
                list.add(diff);
            }
        }
        //list
        //sort, remove, add, size
        if (list.size() == 1) {
            return list.get(0);
        }
        return 0;
    }
}
