package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C11equals {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("java");
        System.out.println("set.size() = " + set.size());
    }
    
}

class MyClass11 {
    private String name;
}
