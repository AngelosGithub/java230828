package ch13generic.lecture;

public class C06wildcard {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a1 = d;
        Cat c = new Cat();
        Animal a2 = c;

        MyClass06<Dog> o1 = new MyClass06<>();
//        MyClass06<Animal> o2 = o1;
//        o2.set(new Animal());
        MyClass06<? extends Animal> o3 = o1;
        MyClass06<? extends Animal> o6 = new MyClass06<Animal>();
        MyClass06<? extends Animal> o7 = new MyClass06<Dog>(); // Cat도 대입 가능
//        MyClass06<? extends Animal> o8 = new MyClass06<Object>(); // 불가능
        Animal ani1 = o3.get(); // 안전 (in)
//        o3.set(new Dog());  // 안전하지 않음 (Dog != Cat)
//        o6.set(new Dog());  // 어떤 클래스를 넣어도 되지않는데??
        ani1.animalMethod();  // 안전하게 사용하기 위함

        MyClass06<? super Animal> o4 = new MyClass06<Animal>();
        MyClass06<? super Animal> o5 = new MyClass06<Object>();
        MyClass06<? super Animal> o10 = new MyClass06<Animal2>();
//        MyClass06<? super Animal> o9 = new MyClass06<Dog>();  // 불가능
        o4.set(new Dog());  // 안전 (out)

    }
}
class Animal2 {

}
class Animal extends Animal2{
    public void animalMethod() {

    }
}
class Dog extends Animal{

}
class Cat extends Animal {

}
class MyClass06<T> {
    public void set(T param) {}

    public T get() {
        return null;
    }
}