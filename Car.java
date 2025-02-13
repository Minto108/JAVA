abstract class Vehicle {
     abstract void engine();
}



public class Car extends Vehicle {
    void engine() {
        System.out.println("Wrooom!!!");
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.engine();

    }
}