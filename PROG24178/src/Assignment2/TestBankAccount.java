package Assignment2;

public class TestBankAccount {

    public static void accountInformation(BankAccount account) {
        System.out.println(account);

    }

    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount(1001, "John P Smith", 20000);
        SavingsAccount saving = new SavingsAccount(1002, "Janet E Holland", 10000);

        checking.withdraw(2500);
        saving.deposit(3000);

        saving.setAnnualInterestRate(4.5);
        System.out.println("Monthly interest amount of savings account: " + saving.getMonthlyInterest());

        accountInformation(checking);
        accountInformation(saving);


    }
}
