import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int size;
        Scanner input = new Scanner(System.in);
        size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = input.nextInt();

        }
        int n = input.nextInt();
        int count = 0;
        for (int i = 0 ; i < arr.length ; i++)
        {
            if (arr[i]==n)
                count++;
        }
        System.out.println(count);


    }
}