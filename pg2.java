public class pg2 {
    public static void main(String[] args){
        int items = 50;
        float costperitem = 9.99f;
        float totalcost = items * costperitem;
        char currency = '$';
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costperitem);
        System.out.println("Total cost = " + totalcost + currency);

        // narrow casting
        double myValue = 12.3d;
        int myInt = (int) myValue;
        System.out.println(myInt);
    }
}
// 