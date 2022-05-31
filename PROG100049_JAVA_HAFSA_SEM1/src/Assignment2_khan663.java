import java.util.Scanner;

public class Assignment2_khan663 {
    public static void main(String[] args) {
        int operand, operand1, result=0;
        char operation;
        char input;



        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter operand");
            operand = scan.nextInt();

            System.out.println("Enter operation");
            operation = scan.next().charAt(0);

            System.out.println("Enter another operand");
            operand1 = scan.nextInt();
            if (operand >= 0 && operand1 >= 0 && operand <= 10 && operand1 <= 10) {

                switch (operation) {
                    case '+':
                        result = operand + operand1;
                        System.out.println(operand + " plus " + operand1 + " is " + result);
                        break;
                    case '-':
                        result = operand - operand1;
                        System.out.println(operand + " minus " + operand1 + " is " + result);
                        break;
                    case '*':
                        result = operand * operand1;
                        System.out.println(operand + " times " + operand1 + " is " + result);
                        break;
                    case '/':
                        if (operand1 == 0) {
                            System.out.println("Division by zero is not allowed");
                        } else {
                            result = operand / operand1;
                            System.out.println(operand + " divided " + operand1 + " is " + result);
                        }
                        break;
                    case '^':
                        result = (int) Math.pow(operand, operand1);
                        System.out.println(operand + " to the power " + operand1 + " is " + result);
                        break;
                    default:
                        System.out.println("You have entered an invalid operation");
                        break;
                }


            } else {
                System.out.println("You have entered an invalid operand");

            }
            switch (operand) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Other");
                    break;
            }

            switch (operation) {
                case '+':
                    System.out.println("plus");
                    break;
                case '/':
                    System.out.println("divided");
                    break;
                case '-':
                    System.out.println("minus");
                    break;
                case '*':
                    System.out.println("times");
                    break;
                case '^':
                    System.out.println("to the power");
                    break;
                default:
                    System.out.println("Other");
                    break;
            }
            switch (operand1) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One is " +result);
                    break;
                case 2:
                    System.out.println("TWO is "+result);
                    break;
                case 3:
                    System.out.println("Three is "+result);
                    break;
                case 4:
                    System.out.println("Four is "+result);
                    break;
                case 5:
                    System.out.println("Five is "+result);
                    break;
                case 6:
                    System.out.println("Six is "+result);
                    break;
                case 7:
                    System.out.println("Seven is "+result);
                    break;
                case 8:
                    System.out.println("Eight is "+result);
                    break;
                case 9:
                    System.out.println("Nine is "+result);
                    break;
                default:
                    System.out.println("Other");
                    break;
            }



            System.out.println("To run again, press 'c' ");
            input = scan.next().charAt(0);

        } while (input == 'c' || input == 'C');
    }
}

