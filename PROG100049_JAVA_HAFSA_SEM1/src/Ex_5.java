import java.lang.String;
import java.util.Locale;
import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {

        // 1
//
//        String word1;
        Scanner scan = new Scanner(System.in);
//        word1 = scan.next();
//        System.out.println("Enter word ");
//        System.out.println(word1 + word1.toUpperCase() + word1);/
//
//
//
//        //2
//
//        double num1, num2, num3;
//        Scanner scan1 = new Scanner(System.in);
//        Scanner scan2 = new Scanner(System.in);
//        Scanner scan3 = new Scanner(System.in);
//
//        System.out.println("Enter number 1 ");
//        num1 = scan1.nextDouble();
//
//        System.out.println("Enter number 2 ");
//        num2 = scan2.nextDouble();
//
//        System.out.println("Enter number 3 ");
//        num3 = scan3.nextDouble();
//
//
//       System.out.println(Math.max(Math.max(num1,num3),num2));

//        // 3
//        double calc;
//        Scanner compute = new Scanner(System.in);
//        System.out.println("Enter number for cube root");
//        calc = compute.nextDouble();
//
//        System.out.println(Math.pow(calc, 3));

        // 4
//        String word;
//        System.out.println("Enter word");
//        word = scan.nextLine();
//        System.out.println(word.trim().replace('a','$'));

        // 5

//        double year;
//        System.out.println("Enter an year after 2000");
//        year = scan.nextDouble();
//        Double newYear = (year-2000)*0.02;
//        System.out.println(6*Math.exp(newYear));

        // 6

        String wordNew;
        wordNew = scan.nextLine();
        String substr1 = wordNew.substring(0, wordNew.length() / 2);
        String substr2 = wordNew.substring(wordNew.length() / 2, wordNew.length());

        System.out.println(substr2 + substr1);


//// 5
//        String sentence = " 4fI 1m 3ng 1 l4t f5n!h1v";
//
//        // a
//        String newSentence1 = sentence.replace('1','a');
//        String newSentence2 = sentence.replace('2','e');
//        String newSentence3 = sentence.replace('3','i');
//        String newSentence4 = sentence.replace('4','0');
//        String newSentence5 = sentence.replace('5','u');
//        sentence = newSentence1+newSentence2+newSentence3+newSentence4+newSentence5;
//
//        // b
//        sentence = sentence.substring(0,8);
//
//        // c
//        //sentence = sentence.substring(5,11);
//        System.out.println(sentence);


    }


}
