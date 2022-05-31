import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long input;
        input = scanner.nextLong();
        long factorial=1,i=1,count=0;
        for(i=1;i<=input;i++) {
        factorial=factorial*i;
            count++;
        if(factorial>input)
            break;

        }

        System.out.println(""+count+"");
    }
}





















