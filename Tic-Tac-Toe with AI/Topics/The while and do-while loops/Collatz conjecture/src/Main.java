import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int n1 = n;
        while (n != 1) {
            System.out.print("" + n + " ");
            if (n % 2 == 0)
                n = n / 2;
            else
                n = (n * 3) + 1;


        }
        System.out.print("" + n + "");

    }
}