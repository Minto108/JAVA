public class pg3 {
    public static void main(String[] args){
        String text = "apple";
        String fname = "Minto";
        String lname = "kuruvilla";
        System.out.println("The length is: " + text.length());
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.indexOf('p'));
        System.out.println(fname + " " + lname);
        System.out.println(fname.concat(lname)); // add space in the first string while using it
    }
}
