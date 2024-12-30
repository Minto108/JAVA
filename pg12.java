//multi-dimensional array in java
public class pg12 {
    public static void main(String[] args){
        // declaring the multi-dimensional array myNum
        int[][] myNum = {
            {1,2,3,4},{5,6,7}
        };
        // looping through the multi-dimensional array
        for (int i =0; i<myNum.length; i++){
            for(int j=0; j<myNum[i].length; j++){
                System.out.println(myNum[i][j]);
            }
        }
        // looping through the multi-dimensuional array using for-each
        for(int [] i : myNum){
            for(int j : i){
                System.out.println(j);
            }
        }
    }
}
