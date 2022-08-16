import java.util.Scanner;

// 1
public class Exercise_8A {

    public static void main(String[] args) {

        // 2
        float score1, score2, score3, score4, score5, score6;
        float smallestGrade, sum, avg;

        // 3
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter score 1");
        score1 = scan.nextFloat();

        System.out.println("Enter score 2");
        score2 = scan.nextFloat();

        System.out.println("Enter score 3");
        score3 = scan.nextFloat();

        System.out.println("Enter score 4");
        score4 = scan.nextFloat();

        System.out.println("Enter score 5");
        score5 = scan.nextFloat();

        System.out.println("Enter score 6");
        score6 = scan.nextFloat();

        // 4 & 5
        if ((score1 > score6) && (score2 > score6) && (score3 > score6) && (score4 > score6) && (score5 > score6)) {

            smallestGrade = score6;
            System.out.println("The smallest score is " + smallestGrade);
            sum = (score1 + score2 + score3 + score4 + score5 + score6) - smallestGrade;
            avg = sum / 5;
            System.out.println("Average grade = " + avg);

        } else if ((score1 >= score5) && (score2 >= score5) && (score3 >= score5) && (score4 >= score5) && (score6 >= score5)) {

            smallestGrade = score5;
            System.out.println("The smallest score is " + smallestGrade);
            sum = (score1 + score2 + score3 + score4 + score5 + score6) - smallestGrade;
            avg = sum / 5;
            System.out.println("Average grade = " + avg);

        } else if ((score1 >= score4) && (score2 >= score4) && (score3 >= score4) && (score5 >= score4) && (score6 >= score4)) {
            smallestGrade = score4;
            System.out.println("The smallest score is " + smallestGrade);
            sum = (score1 + score2 + score3 + score4 + score5 + score6) - smallestGrade;
            avg = sum / 5;
            System.out.println("Average grade = " + avg);

        } else if ((score1 >= score3) && (score2 >= score3) && (score4 >= score3) && (score5 >= score3) && (score6 >= score3)) {

            smallestGrade = score3;
            System.out.println("The smallest score is " + smallestGrade);
            sum = (score1 + score2 + score3 + score4 + score5 + score6) - smallestGrade;
            avg = sum / 5;
            System.out.println("Average grade = " + avg);

        } else if ((score1 >= score2) && (score3 >= score2) && (score4 >= score2) && (score5 >= score2) && (score6 >= score2)) {

            smallestGrade = score2;
            System.out.println("The smallest score is " + smallestGrade);
            sum = (score1 + score2 + score3 + score4 + score5 + score6) - smallestGrade;
            avg = sum / 5;
            System.out.println("Average grade = " + avg);

        } else {
            smallestGrade = score1;
            System.out.println("The smallest score is " + smallestGrade);
            sum = (score1 + score2 + score3 + score4 + score5 + score6) - smallestGrade;
            avg = sum / 5;
            System.out.println("Average grade = " + avg);
        }


    }
}
