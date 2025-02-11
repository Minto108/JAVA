import java.util.Scanner;
public class first_char{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the word: ");
        char g = s.next().charAt(0);
        // or
        System.out.println("Enter the word: ");
        char word = s.next();
        char f = word.charAt(0);
    }
}