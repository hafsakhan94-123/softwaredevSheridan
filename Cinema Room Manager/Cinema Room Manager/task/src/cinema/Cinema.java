package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    static int  row, col, book_row, book_seat, ticket;
    static int total_income, count=0;
    static Scanner input = new Scanner(System.in);
    public static void Set_cinema() {
        System.out.println("Enter the number of rows:");
        row = input.nextInt() + 1;
        System.out.println("Enter the number of seats in each row:");
        col = input.nextInt() + 1;
    }
//    public static void Sold(){
//        int total_seats = row*col;
//        boolean size60 = total_seats <= 60;
//        if (size60){
//            int ticket=10;
//            total_income = total_seats * ticket;
//        }
//        else{
//
//                int row_f = row/2;
//                int row_b = row-row_f;
//                total_income = (row_f*col*10) + (row_b*col*8);
//        }
//        System.out.println("Total income:\n$"+total_income);

//    }
           //cinema seat map
public static String[][] seat;
    public static void SeatingPlan(){
        seat = new String[row][col];
        System.out.println("Cinema:");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (i==0||j==0){
                    seat[i][j] = String.valueOf(count++);
                }
                else
                seat[i][j] = "S";

            }
            seat[i][0] = String.valueOf(i);
            seat[0][0] = " ";
            System.out.println(Arrays.toString(seat[i]).replace("[","")
                    .replace(",","").replace("]",""));
        }

    }

    public static void SeatingPlan_booking(){
        seat[book_row][book_seat] = "B";
        System.out.println("Cinema:");
        for (int i=0;i<row;i++){
            System.out.println(Arrays.toString(seat[i]).replace("[","")
                    .replace(",","").replace("]",""));
        }



        }



    public static void Tickets(){
        System.out.println("Enter a row number:");
        book_row = input.nextInt();
        System.out.println("Enter a seat number in that row:");
        book_seat = input.nextInt();
        boolean check_front = book_row<=(row-1)/2;
        boolean isEven = (row-1)%2==0;
        if (isEven){
            if (!check_front)
                ticket=8;
            else
                ticket=10;

        } else{
            if (book_row<=4)
                ticket=10;
            else
                ticket=8;
        }






        System.out.println("Ticket Price: $"+ticket);

    }

    public static void main(String[] args) {
        // Write your code here
          Set_cinema();
       SeatingPlan();
        Tickets();
        SeatingPlan_booking();

    }
}