import java.util.Scanner;

public class string{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String word = s.next(); // fetch one word
        String line = s.nextLine(); // fetch one line
        System.out.println(word);
        System.out.println(line);
    }
}