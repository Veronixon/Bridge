public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Toyota());
        vehicle.drive();
        Vehicle vehicle2 = new Car(new Audi());
        vehicle2.drive();
    }
}

abstract class Vehicle {
    Model model;

    public Vehicle(Model model) {
        this.model = model;
    }

    abstract void drive();
}

interface Model {
    void drive(String str);
}

class Car extends Vehicle {
    public Car(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("drive car");
    }
}

class Truck extends Vehicle {
    public Truck(Model model) {
        super(model);
    }

    @Override
    void drive() {
        model.drive("drive truck");
    }
}

class Audi implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + " audi");
    }
}

class Toyota implements Model {
    @Override
    public void drive(String str) {
        System.out.println(str + " toyota");
    }
}
