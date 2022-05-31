package Assignment2;

public class SavingsAccount extends BankAccount{
    private static double annualInterestRate;
    private double monthlyInterestRate;

    public SavingsAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);

    }

    public double getMonthlyInterestRate(){
        monthlyInterestRate = (annualInterestRate/1200);
        return monthlyInterestRate;
    }

    public double getMonthlyInterest(){
        return super.getBalance()*monthlyInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAccount type: Savings Account";
    }
}
