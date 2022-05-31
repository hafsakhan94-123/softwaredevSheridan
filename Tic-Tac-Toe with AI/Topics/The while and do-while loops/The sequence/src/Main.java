import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String c = "abc";
        Scanner scanner = new Scanner(System.in);
        // start coding here
        for (int i = 0; i < 5; i++) {
            System.out.println(i+"i");
            if (i < 3) {
                continue;
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.println(j+"j");
                }
            }
        }
//        int num_elements;
//        num_elements = scanner.nextInt();
//        int elements,max=0;
//        for(int i=0;i<num_elements;i++)
//        {
//            elements = scanner.nextInt();
//            if (elements>max){
//                if (elements%4==0)
//                    max = elements;
//            }
//
//            }
//        System.out.println(""+max);
//
//        int n = ...;
//
//        int magic = 0;
//        while (n > 0) {
//            n /= 10;
//            magic++;
//        }
    }
}