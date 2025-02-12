import java.util.Scanner;

public class Scan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        if (a == 10) {
            System.out.println("10");
        }
        else if (a == 20) {
            System.out.println("20");
        }
        else {
            System.out.println("Some other number");
        }
    }
}