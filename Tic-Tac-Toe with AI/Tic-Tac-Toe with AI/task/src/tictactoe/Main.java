//package tictactoe;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static String[][] Board = new String[3][3];
//    public static int[] coordinate = new int[2];
//
//    public static void displayBoard() {
//        System.out.println("-------------");
//        System.out.println("| " + Board[0][0] + " | " + Board[0][1] + " | " + Board[0][2] + " |");
//        System.out.println("| " + Board[1][0] + " | " + Board[1][1] + " | " + Board[1][2] + " |");
//        System.out.println("| " + Board[2][0] + " | " + Board[2][1] + " | " + Board[2][2] + " |");
//        System.out.println("-------------");
//    }
//
//    public static int[] coordinates() {
//        Scanner input_c = new Scanner(System.in);
//        System.out.println("Enter coordinate(rxc): >");
//        coordinate[0] = input_c.nextInt();
//        coordinate[1] = input_c.nextInt();
//        return coordinate;
//
//    }
//
//    public static void setBoard() {
//        Board[0][0] = "_";
//        Board[0][1] = "X";
//        Board[0][2] = "X";
//        Board[1][0] = "O";
//        Board[1][1] = "O";
//        Board[1][2] = "X";
//        Board[2][0] = "O";
//        Board[2][1] = "O";
//        Board[2][2] = "_";
//
//    }
//
//    public static int checkwin() {
//        int flag = 0;
//        String[] line_h_1 = new String[3];
//        String[] line_h_2 = new String[3];
//        String[] line_h_3 = new String[3];
//        String[] line_v_1 = new String[3];
//        String[] line_v_2 = new String[3];
//        String[] line_v_3 = new String[3];
//        String[] diagonal = new String[3];
//        for (int j = 0; j < 3; j++) {
//            line_h_1[j] = Board[0][j];
//            line_v_1[j] = Board[j][0];
//            diagonal[0] = Board[0][0];
//        }
//        boolean Xwins_h_1 = Arrays.toString(line_h_1).equals("[X, X, X]");
//        boolean Owins_h_1 = Arrays.toString(line_h_1).equals("[O, O, O]");
//        boolean Xwins_v_1 = Arrays.toString(line_v_1).equals("[X, X, X]");
//        boolean Owins_v_1 = Arrays.toString(line_v_1).equals("[O, O, O]");
//        if (Xwins_h_1 || Xwins_v_1 || Owins_h_1 || Owins_v_1)
//            flag = 1;
//
//        for (int j = 0; j < 3; j++) {
//            line_h_2[j] = Board[1][j];
//            line_v_2[j] = Board[j][1];
//            diagonal[1] = Board[1][1];
//        }
//        boolean Xwins_h_2 = Arrays.toString(line_h_2).equals("[X, X, X]");
//        boolean Owins_h_2 = Arrays.toString(line_h_2).equals("[O, O, O]");
//        boolean Xwins_v_2 = Arrays.toString(line_v_2).equals("[X, X, X]");
//        boolean Owins_v_2 = Arrays.toString(line_v_2).equals("[O, O, O]");
//        if (Xwins_h_2 || Xwins_v_2 || Owins_h_2 || Owins_v_2)
//            flag = 1;
//
//        for (int j = 0; j < 3; j++) {
//            line_h_3[j] = Board[2][j];
//            line_v_3[j] = Board[j][2];
//            diagonal[2] = Board[2][2];
//        }
//        boolean Xwins_h_3 = Arrays.toString(line_h_3).equals("[X, X, X]");
//        boolean Owins_h_3 = Arrays.toString(line_h_3).equals("[O, O, O]");
//        boolean Xwins_v_3 = Arrays.toString(line_v_3).equals("[X, X, X]");
//        boolean Owins_v_3 = Arrays.toString(line_v_3).equals("[O, O, O]");
//        if (Xwins_h_3 || Xwins_v_3 || Owins_h_3 || Owins_v_3)
//            flag = 1;
//
//
//        return flag;
//
//    }
//
//    public static void main(String[] args) {
//        // write your code here
//        int count = 0;
//        Main obj = new Main();
//        Scanner input = new Scanner(System.in);
//        setBoard();
//        for (int i = 0; i < 3; i++) {  //change i<3 to i<count
//            displayBoard();
//            int[] coordinate = coordinates();
//            boolean isempty = Board[coordinate[0]][coordinate[1]] == "_";
//            if (isempty) {
//                System.out.println("Assuming player is X"); //give choice
//                Board[coordinate[0]][coordinate[1]] = "X";
//                checkwin();
//                if (checkwin() == 1)
//                {
//                    displayBoard();
//                    System.out.println("X wins !");
//                    break;
//                }
//
//
//
//                // }else
//                //    System.out.println("Place is occupied. Try again !");
//
//            }
//            displayBoard();
//
//
//        }
//    }
//}
package tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] state = {"Game not finished", "Draw", "X wins", "O wins", "Impossible"};
        Scanner scanner = new Scanner(System.in);
        Grid grid = new Grid();

        // Init grid
        while (true) {
            try {
                System.out.print("Enter cells: ");
                grid.set(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(grid);

        // Play game
        //do {
        while (true) {
            try {
                System.out.print("Enter the coordinates: ");
                grid.makeMove(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(grid);
        //} while (grid.state() < 1);
        System.out.println(state[grid.state()]);
    }
}





