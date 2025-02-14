class transport {
    void display1(){
        System.out.println("Choose your method of transport");
    }
}

class car extends transport {
    void display2 () {
        System.out.println("I choose a car!!! ");
    }
}

public class Main_Multi extends car {
    public static void main(String[] args) {
        Main_Multi m = new Main_Multi();
        m.display1();
        m.display2();
    }
}