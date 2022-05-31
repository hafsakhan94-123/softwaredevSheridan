import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int r,c,row=0,ticket,count=1;
            r=input.nextInt();
            c=input.nextInt();
        int[][] arr = new int[r][c];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=input.nextInt();


            }
        }
        ticket = input.nextInt();
//        System.out.println(arr.length);
//        System.out.println(arr[2].length);
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length-1;j++){
                if (arr[i][j]==0){
                    int j_iterate = j;
                    if (arr[i][j_iterate+1]==0){
                        row=i;
                        count++;
                        //break;
                    }
                }
            }
        }
        if (ticket==count)
        System.out.println(row);
        else
            System.out.println("0");
    }
}
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        int[][] matrix = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                matrix[i][j] = scanner.nextInt();
//            }
//        }
//        int t = scanner.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (matrix[i][j] == 0) {
//                    boolean found = true;
//                    for (int k = 0; k < t; k++) {
//                        if (j + k >= m || matrix[i][j + k] != 0) {
//                            found = false;
//                            break;
//                        }
//                    }
//                    if (found) {
//                        System.out.println(i + 1);
//                        return;
//                    }
//                }
//            }
//        }
//        System.out.println(0);
//    }
//}