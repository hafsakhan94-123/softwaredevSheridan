import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input=0,max=0,test=0;
        do {
            input = scanner.nextInt();
            if(input>max)
            max = input;

        }while(input!=0);
        System.out.println(""+max+"");

        }
    }
