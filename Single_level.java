// Single level inheritance in java
class transport {
    void display(){
        System.out.println("Choose your method of transport");
    }
}

class Single_level extends transport {
        public static void main(String[] args) {
            Single_level s = new Single_level();
            s.display();
        }
}