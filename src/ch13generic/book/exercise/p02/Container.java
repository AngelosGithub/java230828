package ch13generic.book.exercise.p02;

public class Container<T> {
    private T field;
    public void setField(T p) {
        this.field = p;
    }

    public T getField() {

        return field;
    }
}
