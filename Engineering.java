abstract class Inheritance{
    // abstract method will not have a definition
    abstract void study(); //{
        //System.out.println("B.Tech");
  //  }
}

public class Engineering extends Inheritance {
    void study() {
        System.out.println("B.Tech");
    }
    public static void main(String[] args){
        Engineering e = new Engineering();
        e.study();
    }
}