abstract class Vehicle {
    abstract void engine();
}

class Car extends Vehicle {
    void engine() {
        System.out.println("Wroom!!!");
    }
}

public class Main {
    public static void main(String[] args){
        Car c = new Car();
        c.engine();
    }
}