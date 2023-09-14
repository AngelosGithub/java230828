package ch11exception.book.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] arr = {"100", "1oo"};

        for (int i=0; i<=arr.length; i++){
            try {
                int value = Integer.parseInt(arr[i]);
                System.out.println("arr["+i+"] = " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("인덱스 초과됨 : "+e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("숫자 변환 불가 : "+e.getMessage());
            }
        }
    }
}
