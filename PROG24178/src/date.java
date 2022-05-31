import java.util.Date;
import java.util.Random;
public class date {
    public static void main(String[] args) {
//        Date date = new java.util.Date();
//        System.out.println("The time elapsed since jan 1, 1970 is" + date.getTime() + "milliseconds");
//        System.out.println(date.toString());
//
//        // To check the elapsed time of a calculation
//        long time1 = System.currentTimeMillis();
//
//        for(int i = 0; i < 65000; i++){
//            for(int j = 0; j < 65000; j++)
//                for (int k = 0; k < 65000; k++);
//        }
//        long time2 = System.currentTimeMillis();
//        long timeDifference = time2 - time1;
//        System.out.println("Time Elapsed:" + timeDifference + "milliseconds");
        Random random1 = new Random(3);
        System.out.print("From random1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random1.nextInt(1000) + " ");
        Random random2 = new Random(3);
        System.out.print("\nFrom random2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random2.nextInt(1000) + " ");
    }
}
