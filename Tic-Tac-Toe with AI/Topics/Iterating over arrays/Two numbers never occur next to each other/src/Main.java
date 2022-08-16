import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int size;
//        System.out.println("Enter size of array:");
        size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int n = input.nextInt();
        int m = input.nextInt();
        boolean condition_next = true;

        for (int i = 0; i < arr.length - 1; i++) {
            int sum = n + m;
            int sum_arr = arr[i] + arr[i + 1];
            if (sum_arr == sum) {
                if (arr[i] == n || arr[i + 1] == n)
                    condition_next = false;
            }

        }
        System.out.println(condition_next);

    }
}