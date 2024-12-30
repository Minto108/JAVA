// arrays in java
public class pg11{
    public static void main(String[] args){
        // Initializing the array cars
        String[] cars = {"Volvo", "BMW", "Toyota"};
        // looping through the array using for loop
        for(int i=0; i < cars.length; i++){
            System.out.println(cars[i]);
        }
        // looping thrigth the array using for-each loop
        for(String i : cars){
            System.out.println(i);
        }
    }
}