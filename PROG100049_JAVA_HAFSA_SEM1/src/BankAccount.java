
public class BankAccount {
    /**
     * 1. ***** Define the instance variables  *****
     * accountHolderName is a String
     * accountNumber is an int
     * balance is a double
     */
    private String accountHolderName;
    private int accountNumber;
    private double balance;


    /**
     * 2. ***** Write this method *****
     * No-argument Constructor:
     * Method Name: BankAccount
     * Return Value:  none
     * Parameters: none
     * Function: initializes the instance variables
     * accountHolderName to empty string,
     * accountNumber to -1 and balance to 0.0
     */
    public BankAccount() {
        accountHolderName = "";
        accountNumber = -1;
        balance = 0.0;
    }


    /**
     * 3. ***** Write this method *****
     * Overloaded constructor:
     * Method Name: BankAccount
     * Return Value: none
     * Parameters:  a String name,  an int acctNum, and a double bal
     * Function:
     * sets accountHolderName to name,
     * sets accountNumber to acctNum,
     * sets balance to bal
     */
    public BankAccount(String name, int accNum, double bal) {
        accountHolderName = name;
        accountNumber = accNum;
        balance = bal;
    }


    /**
     * 4. ***** Write this method *****
     * Accessor method for the firstName instance variable
     * Method Name: getAccountHolderName
     * Return Value: String
     * Parameters: none
     * Function: returns AccountHolderName
     */
    public String getAccountHolderName() {
        return accountHolderName;
    }


    /**
     * 5. ***** Write this method *****
     * Accessor method for the accountNumber instance variable
     * Method Name: getAccountNumber
     * Return Value: int
     * Parameters: none
     * Function: returns accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * 6 ***** Write this method *****
     * Accessor method for the balance instance variable
     * Method Name: getBalance
     * Return Value: double
     * Parameters: none
     * Function: returns balance
     */
    public double getBalance() {
        return balance;
    }


    /**
     * 7. ***** Write this method *****
     * Mutator method for the accountHolderName instance variable
     * Method Name: setAccountHolderName
     * Return Value: void
     * Parameters: String name
     * Function: assigns accountHolderName the value of the
     * name parameter only if name is not null
     */
    public void setAccountHolderName(String name) {
        if (name != null) {
            accountHolderName = name;
        }

    }


    /**
     * 8. ***** Write this method *****
     * Mutator method for the acountNumber instance variable
     * Method Name: setAccountNumber
     * Return Value: void
     * Parameters: int newAccountNumber
     * Function: assigns accountNumber the value of the
     * newAccountNumber parameter; checks
     * that it is a non-negative number
     */
    public void setAccountNumber(int newAccountNumber) {
        if (newAccountNumber >= 0) {
            accountNumber = newAccountNumber;
        }

    }


    /**
     * 9. ***** Write this method *****
     * Mutator method for the balance instance variable
     * Method Name: setBalance
     * Return Value: void
     * Parameters: double newBalance
     * Function: assigns balance the value of the
     * newBalance parameter only if it is non-negative
     */
    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        }
    }


    /**
     * 10. ***** Write this method *****
     * Method Name: withdraw
     * Return Value: double
     * Parameters: double amount
     * Function: deducts amount from balance only if amount > 0 and is
     * less than or equal to balance; returns new balance
     */
    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
        return balance;
    }


    /**
     * 11. ***** Write this method *****
     * Method Name: deposit
     * Return Value: double
     * Parameters: double amount
     * Function: add amount to balance only if amount > 0;
     * returns new balance
     */
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }


    /**
     * 12. ***** Write this method *****
     * method name: equals
     * return value: boolean
     * parameters: BankAccount anotherBankAccount
     * function: checks if the calling BankAccount object and anotherBankAccount are the same
     * (if the accountHolderNames are equal as well as accountNumbers)
     */
    public boolean equals(BankAccount anotherBankAccount) {
        if (this.accountHolderName.equals(anotherBankAccount.accountHolderName) && this.accountNumber == anotherBankAccount.accountNumber) {
            return true;
        }
        return false;

    }


    /**
     * 13. ***** Write this method *****
     * method name: toString
     * return value: String
     * parameters: none
     * function: returns the value of the calling BankAccount as a string in the form
     * accountHolderName accountNumber balance
     */
    public String toString() {
        return accountHolderName + " " + accountNumber + " " + balance;
    }


}
