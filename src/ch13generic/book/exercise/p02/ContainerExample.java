package ch13generic.book.exercise.p02;


public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.setField("홍길동");
        String str = container1.getField();

        Container<Integer> container2 = new Container<>();
        container2.setField(6);
        int value = container2.getField();
    }
}

//class Container<T> {
//    private T field;
//
//    public void setField(T field) {
//        this.field = field;
//    }
//
//    public T getField() {
//        return field;
//    }
//}
