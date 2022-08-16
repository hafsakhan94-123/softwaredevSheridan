package Array;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myIntArray = new int[10]; //{1,2,3,4,5,6,7,8,9,10};
////        myIntArray[5] = 50;
////        myIntArray[0]= 45;
////        myIntArray = {1,2,3,4,5,6,7,8,9,10};
//       // double[] myDoubleArray = new double[10];
//        for (int i=0 ; i < (myIntArray.length) ; i++){
//            myIntArray[i] = i*10;
//            //System.out.println(myIntArray[i]);
//        }
//        printArray(myIntArray);
//
//    }
//    public static void printArray(int[] array){
//        for(int i = 0; i<array.length; i++){
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", value entered is " + myIntegers[i]);
        }

        System.out.println("Average is " + getAvg(myIntegers));


    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer value.\r");
        int[] val = new int[number];

        for (int i = 0; i < val.length; i++) {
            val[i] = scanner.nextInt();
        }
        return val;
    }

    public static double getAvg(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
