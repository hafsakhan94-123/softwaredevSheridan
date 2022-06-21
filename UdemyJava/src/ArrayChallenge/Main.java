package ArrayChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println(getIntegers(5));
        int myInteger[] = getIntegers(5);
        int[] sorted = sortIntegers(myInteger);
        printArray(sorted);

    }


    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number){
        int[] value = new int[number];
        System.out.println("Enter " + number + " integer values");
        for (int i=0; i<value.length; i++){
            value[i] = scanner.nextInt();
        }
        return value;
    }

    public static void printArray(int[] myIntegers){

        for (int i = 0 ; i< myIntegers.length; i++){
            System.out.println("Element " + i + ", value entered is " + myIntegers[i]);
        }

    }
    public static int[] sortIntegers(int[] myIntegers){
        int[] sortedArray = new int[myIntegers.length];
        for (int i=0 ; i<sortedArray.length ; i++ ){
            sortedArray[i]= myIntegers[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i =0; i<sortedArray.length-1; i++){
                if (sortedArray[i]< sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
