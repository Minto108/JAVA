import java.util.Scanner;
public class test1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = s.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = s.nextInt();
        System.out.println("Sum= "+(num1 + num2));
    }
}