public class bankAccount {
    private String  accNumber;
    private double balance;
    private String cusName;
    private String email;
    private int phoneNum;

    public bankAccount(){
        System.out.println("Empty constructor call");
    }

    public bankAccount(String accNumber, double balance, String cusName, String email, int phoneNum){
        System.out.println("Acc constructor called");
        this.accNumber = accNumber;
        this.balance = balance;
        this.cusName = cusName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public bankAccount(String cusName, String email, int phoneNum) {
        this("999",100,cusName,email,phoneNum);
        this.cusName = cusName;
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String  getAccNumber() {
        return accNumber;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccNumber(String  accNumber) {
        this.accNumber = accNumber;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public String getCusName() {
        return cusName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit amount: " + depositAmount + " Balance: " + this.balance);
    }

    public void withdraw(double withdrawAmount){
        if(this.balance > 0){
            this.balance -= withdrawAmount;
            System.out.println("Withdraw: " + withdrawAmount + " Remaining balance: " + this.balance);
        }else
            System.out.println("Insufficient balance");
    }
}
