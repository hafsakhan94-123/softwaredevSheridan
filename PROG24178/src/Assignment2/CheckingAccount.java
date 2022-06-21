package Assignment2;

public class CheckingAccount extends BankAccount{
    private int overDraftLimit;

    public CheckingAccount() {
        System.out.println("No arg constructor invoked");
    }

    public CheckingAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
        overDraftLimit = 6000;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAccount Type: Checking Account";
    }
}
