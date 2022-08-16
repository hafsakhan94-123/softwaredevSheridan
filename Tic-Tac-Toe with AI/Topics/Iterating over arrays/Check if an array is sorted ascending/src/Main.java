import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int size;
        boolean sort = true;
        size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                sort = false;

        }
        System.out.println(sort);
    }
}