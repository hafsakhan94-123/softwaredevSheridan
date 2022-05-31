/* A client program to test BankAccount Class*/

public class BankAccountClient
{


  public static void main(String [] args )
  {
   String s = "";
   BankAccount ba = new BankAccount();
   if (!s.equals(ba.getAccountHolderName())) {
    throw new Error("No-arg constructor doesn't use the empty string for a name");
   }
   if (ba.getBalance() != 0) {
    throw new Error("No-arg constructor doesn't initialize balance properly");
   }
   if (ba.getAccountNumber() != -1) {
    throw new Error("No-arg cosntructor doesn't initialize account number properly");
   }
   BankAccount ba2 = new BankAccount("Foo Bar", 314159, 100.f);
   
   if (!ba2.getAccountHolderName().equals("Foo Bar")) {
    throw new Error("Error accessing account holder name after using parameterized constructor");
   }
   
   if (ba2.getAccountNumber() != 314159) {
    throw new Error("Error accessing account number after using parameterized constructor");
   }
   
   if (ba2.getBalance() != 100) {
    throw new Error("Error accessing account balance after using parameterized constructor");
   }
   ba2.setBalance(0);
   if (ba2.getBalance() != 0) {
    throw new Error("Can't set the balance to 0");
   }
   
   ba2.setBalance(-5);
   if (ba2.getBalance() != 0) {
    throw new Error("Successfully set the balance to a negative number.  That shouldn't be allowed.");
   }
   

   ba2.setAccountHolderName(null);
   
   if (ba2.getAccountHolderName() == null) {
    throw new Error ("Successfully set the account holder name to null.  This shouldn't be allowed");
   }
   
   ba2.setAccountHolderName("Baz");
   
   if (!ba2.getAccountHolderName().equals("Baz")) {
    throw new Error("Account holder name mutator doesn't seem to work");
   }
   
   ba2.setAccountNumber(0);
   if (ba2.getAccountNumber() != 0) {
    throw new Error ("Can't set the account number to 0");
   }
   ba2.setAccountNumber(1414);
   
   if (ba2.getAccountNumber() != 1414) {
    throw new Error("Account number mutator doesn't seem to work");
   }
   
   ba2.setAccountNumber(-57);
   if (ba2.getAccountNumber() != 1414) {
    throw new Error("Account number mutator handles negative values incorrectly");    
   }
   ba2.setBalance(999);
   
   if (ba2.getBalance() != 999) {
    throw new Error("Account balance mutator doesn't seem to work");
   }
   
   if (ba2.withdraw(-10) != 999) {
    throw new Error("Withdrawal of negative amount of money is broken");
   }
   if (ba2.withdraw(100) != 899) {
    throw new Error("Withdrawal of postive amount of money less than the account balance is broken");
   }
   
   if (ba2.withdraw(1000) != 899) {
    throw new Error("Withdrawal of postive amount of money less more than the account balance is broken");
   }
   
   if (ba2.withdraw(899) != 0) {
    throw new Error("Withdrawal of amount of money equal to the account balance is broken");
   }
   
   if (ba2.getBalance() != 0) {
    throw new Error("Accessor of balance doesn't work after withdrawals");
   }

   if (ba2.deposit(-10) != 0) {
    throw new Error("Deposit of a negative amount of money is broken");
   }

   if (ba2.deposit(10) != 10) {
    throw new Error("Deposit of a positive amount of money is broken");
   }
   s = "B";
   s += "az";
   ba = new BankAccount(s, 1414, 5);
   if (!ba.equals(ba2)) {
    throw new Error("The .equals function returns false when it should return true");
   }
   ba.setAccountHolderName("f");
   if (ba.equals(ba2)) {
    throw new Error("The .equals function returns true when it should return false");
   }
   ba.setAccountHolderName("Baz");
   ba.setAccountNumber(931);
   if (ba.equals(ba2)) {
    throw new Error("The .equals function returns true when it should return false");
   }
   ba.setAccountHolderName("Harry Bovik");
   
   System.out.println("toString returns \"" + ba + "\"\n");

   System.out.println("If the toString return value is well-formatted, then all tests pass!");

    
   }

}
