package ch12api.lecture;

public class C03toString {
    public static void main(String[] args) {
        Car car1 = new Car("tesla", 5000);
        Car car2 = new Car("kia", 5000);
        Car car3 = new Car("bmw", 5000);

        System.out.println(car1.getModel()+" : "+car1.getPrice());
        System.out.println(car2.getModel()+" : "+car2.getPrice());
        System.out.println(car3.getModel()+" : "+car3.getPrice());

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());

        System.out.println(car1);
    }
}

class Car {
    private String model;

    private int price;

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

//    @Override
//    public String toString() {
//        return this.model + " : " + this.price;
//    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
