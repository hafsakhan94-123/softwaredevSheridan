/***************************************
 *
 * PROG 10082 Assignment 1
 *
 * Hafsa Khan
 * khan663
 * January 26, 2022
 *
 ****************************************/


public class Assignment1_khan663 {
    public static void main(String[] args) {
        System.out.println("***************************************************");
        System.out.println("* Welcome to Hafsa's first programming assignment *");
        System.out.println("***************************************************");


        final double runningMETS = 10d;
        final double basketballMETS = 8d;
        final double sleepingMETS = 1d;

        double weightA = 125d;
        double weightB = 170d;
        double weightC = 210d;
        weightA = weightA * .454;
        weightB = weightB * .454;
        weightC = weightC * .454;

        double timeRunning = (30.0 / 60.0);
        double timeBasketball = (40.0 / 60.0);
        double timeSleeping = 6.5;

        double caloriesPerHourRunning = 1.05 * runningMETS * weightA;
        double totalCaloriesBurnedRunning = caloriesPerHourRunning * timeRunning;

        double caloriesPerHourBasketball = 1.05 * basketballMETS * weightA;
        double totalCaloriesBurnedBasketball = caloriesPerHourBasketball * timeBasketball;

        double caloriesPerHourSleeping = 1.05 * sleepingMETS * weightA;
        double totalCaloriesBurnedSleeping = caloriesPerHourSleeping * timeSleeping;

        double totalCalories = totalCaloriesBurnedRunning + totalCaloriesBurnedBasketball + totalCaloriesBurnedSleeping;
        System.out.printf("\n 1a = %.2f", totalCalories);


        // 1b solved
        caloriesPerHourRunning = 1.05 * runningMETS * weightB;
        totalCaloriesBurnedRunning = caloriesPerHourRunning * timeRunning;

        caloriesPerHourBasketball = 1.05 * basketballMETS * weightB;
        totalCaloriesBurnedBasketball = caloriesPerHourBasketball * timeBasketball;

        caloriesPerHourSleeping = 1.05 * sleepingMETS * weightB;
        totalCaloriesBurnedSleeping = caloriesPerHourSleeping * timeSleeping;

        totalCalories = totalCaloriesBurnedRunning + totalCaloriesBurnedBasketball + totalCaloriesBurnedSleeping;
        System.out.printf("\n 1b = %.2f", totalCalories);


        // 1c solved
        caloriesPerHourRunning = 1.05 * runningMETS * weightC;
        totalCaloriesBurnedRunning = caloriesPerHourRunning * timeRunning;

        caloriesPerHourBasketball = 1.05 * basketballMETS * weightC;
        totalCaloriesBurnedBasketball = caloriesPerHourBasketball * timeBasketball;

        caloriesPerHourSleeping = 1.05 * sleepingMETS * weightC;
        totalCaloriesBurnedSleeping = caloriesPerHourSleeping * timeSleeping;

        totalCalories = totalCaloriesBurnedRunning + totalCaloriesBurnedBasketball + totalCaloriesBurnedSleeping;
        System.out.printf("\n 1c = %.2f", totalCalories);


        //Problem 2a

        double seconds = 1234567;
        double hours = (seconds / 3600);
        double days = (hours / 24);
        System.out.printf("\nProblem 2a: %.2f days", days);


        //Problem 2b
        int days1 = 3 * 24 * 3600;
        int hours1 = 17 * 3600;
        int minutes1 = 59 * 60;
        int seconds1 = 6;

        int totalSeconds = days1 + hours1 + minutes1 + seconds1;
        System.out.printf("\nProblem 2b: " + totalSeconds + " seconds");


        //Problem 2c
        double javaSeconds = 123456789;
        double javaHours = (javaSeconds / 3600);
        double javaDays = (javaHours / 24);
        double javaYear = (javaDays / 365);
        int javaYear_f = (int) (1970 + javaYear);

        System.out.printf("\nProblem 2c: " + javaYear_f);
    }
}





