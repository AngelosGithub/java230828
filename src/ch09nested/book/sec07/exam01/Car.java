package ch09nested.book.sec07.exam01;

public class Car {
    private Tire tire1 = new Tire();

    private Tire tier2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명자식 Tire 객체 1이 굴러감");
        }
    };

    public void run1() {
        tire1.roll();
        tier2.roll();
    }

    public void run2() {
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명자식 Tire 객체 2가 굴러감");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }
}
