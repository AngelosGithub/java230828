package ch07extends.lecture;

public class C12polymorphism {
    public static void main(String[] args) {
        Malamute2 dog = new Malamute2();
        dog.breath();
        dog.sniff();

        Animal2 ani = dog;
        ani.breath();

        Animal2 ani2 = new Malamute2();
        ani2.breath();
    }

}

class Animal2 {
    public void breath() {
        System.out.println("숨쉬다");
    }
}
class Malamute2 extends Animal2 {
    public void sniff() {
        System.out.println("냄새맡다");
    }
}