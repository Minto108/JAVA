public class pg14 {

    static int remAge(int age){
        return 18 - age;
    }

    static void checkAge(int age){
        if(age > 18){
            System.out.println("You are old enough to vote!!!");
        }
        else{
            System.out.println("You are not old enough to vote");
        }
    }

    public static void main(String[] args){
        checkAge(20);
        System.out.println(remAge(20));   }
}
