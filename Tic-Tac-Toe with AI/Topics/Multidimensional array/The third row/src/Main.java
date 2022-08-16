import java.lang.reflect.Array;
import java.util.Arrays;

class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        // write your code here
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
//            System.out.println(Arrays.toString(twoDimArray[i])+" ");
        }

    }


//    public static void main(String[] args){
//        int [][] array = new int[2][3];
//        System.out.println(array[0].length);
//        for (int i=0;i<array.length;i++){
//            for (int j=0;j< array[i].length; j++){
//                array[i][j]++;
//
//            }
//            System.out.println(Arrays.toString(array[i]));
//        }
//
//        for (int i=1;i<array.length;i++){
//            for (int j=0;j<array[i].length;j++){
//
//            }
//            System.out.println(Arrays.toString(array[i]));
//        }
//
//    }
}