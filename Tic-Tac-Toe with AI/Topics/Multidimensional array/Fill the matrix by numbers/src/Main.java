import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int size, count = 1;
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Math.abs(j - i);
                System.out.print((arr[i][j]) + " ");

            }
            System.out.println();
            //System.out.println(Arrays.toString(arr[i])+" ");

        }


    }
}

//00 01 02
//10 11 12
//20 21 22
//if (i==j)
//        arr[i][j]=0;
//        else if (Math.abs(j-i)==1)
//        arr[i][j]=1;
//        else if (Math.abs(j-i)==2)
//        arr[i][j]=2;