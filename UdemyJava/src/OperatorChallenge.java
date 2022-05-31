public class OperatorChallenge {
    public static void main(String[] args){
        double firstvariable = 20.00;
        double secondvariable = 80.00;
        double thirdvariable = (firstvariable+secondvariable)*100.00;
        double fourthvariable = thirdvariable%40.00;
        boolean test = (fourthvariable==0) ? true : false;

        if (test)
            System.out.println("No Remainder. Boolean value = " + test);
        else
            System.out.println("Got Remainder = "+fourthvariable+" Boolean Value = "+ test);







       //System.out.println("Operator Challenge = " + fourthvariable);
    }
}
