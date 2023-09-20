package ch12api.lecture;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class C26reflection {
    public static void main(String[] args) {
        MyClass26 o1 = new MyClass26("son");
        
        Class c = o1.getClass();

        System.out.println("c.getName() = " + c.getName());
        System.out.println("c.getSimpleName() = " + c.getSimpleName());
        System.out.println("c.getPackageName() = " + c.getPackageName());

//        Field[] fields = c.getDeclaredField();
//        System.out.println("fields.length = " + fields.length);

        Constructor[] Constructors = c.getDeclaredConstructors();
        System.out.println("Constructors = " + Constructors.length);
    }
    
}

class MyClass26 {
    private String name;

    public MyClass26(String name) {
        this.name = name;
    }
}
