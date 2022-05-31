import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int size;
        size = input.nextInt();
        String [][] arr = new String[size][size];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                arr[i][j] = ".";
                if (i==j)
                    arr[i][j]="*";
                else if (i==size-j-1)
                    arr[i][j]="*";
                else if (i==size/2)
                    arr[i][j]="*";
                else if (j==size/2)
                    arr[i][j]="*";
                System.out.print(arr[i][j]+" ");




            }
            System.out.println();
        }
    }
}