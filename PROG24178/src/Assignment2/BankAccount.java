package Assignment2;

public class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

    public BankAccount() {
        accountNumber = 1000;
        name = "";
        balance = 0;
    }

    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double withdraw){
        balance -= withdraw;
    }

    public void deposit(double deposit){
        balance += deposit;
    }

    public String toString(){
        return "Account number: " + accountNumber + "\nAccount Holder's name: " + name + "\nBalance: " + balance + "\nCreated on: " + dateCreated;
    }
}
