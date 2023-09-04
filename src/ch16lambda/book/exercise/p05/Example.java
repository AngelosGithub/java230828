package ch16lambda.book.exercise.p05;

public class Example {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() -> System.out.println("ok 버튼 클릭"));
        // 위 람다식
        // 아래 익명클래스 호출식
        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("ok 버튼 클릭");
            }
        });
        btnOk.click();

        Button btnCancel = new Button();
        btnCancel.setClickListener(() -> System.out.println("cancle 버튼 클릭"));
        btnCancel.click();
    }
}
