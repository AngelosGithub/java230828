package ch13generic.book.exercise.p03;

public class Container<T, T1> {
    private T key;
    private T1 value;

    public T getKey() {
        return key;
    }

    public T1 getValue() {
        return value;
    }

    public void set(T key, T1 value) {
        this.key = key;
        this.value = value;
    }


}
