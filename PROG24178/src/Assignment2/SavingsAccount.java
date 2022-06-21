package Assignment2;

public class SavingsAccount extends BankAccount{
    private double annualInterestRate;
    private double monthlyInterestRate;

    public SavingsAccount() {
        System.out.println("No arg constructor invoked"); //always add no arg constructor even if its not used in programme to avoid crashes.
    }

    public SavingsAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);

    }

    public double getMonthlyInterestRate(){
        monthlyInterestRate = (annualInterestRate/1200);
        return monthlyInterestRate;
    }

    public double getMonthlyInterest(){
        return super.getBalance()*getMonthlyInterestRate();
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAccount type: Savings Account";
    }
}
