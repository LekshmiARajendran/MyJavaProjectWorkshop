package overloadingandoverriding;
/* Scenario: Bank Transactions
Parent class: BankAccount
Child class: SavingsAccount
Overloading for deposit methods (different types of deposits).
Overriding for withdraw (different rules for SavingsAccount).*/

public class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    //Method Overloading- This method is used for depositing cash
    void deposit(double amount){
        balance=balance+amount;
        System.out.println("The Deposited Amount is $ "+amount);
    }
    //Method Overloading- This method is used for depositing cheque
    void deposit(String chequeNumber, double amount){
        balance=balance+amount;
        System.out.println("The Deposited amount in cheque # "+chequeNumber+ "is $" +amount);
    }
    //Method Overridden- Withdraw money
    void withdraw(double amount){
        if(amount <= balance){
            balance=balance-amount;
            System.out.println("The Withdrawn Amount from the account number " +accountNumber+ "is $ "+amount);
        }
        else{
            System.out.println("Sorry,Insufficient Account Balance!");
        }
    }
    void displayBalance(){
        System.out.println("The balance amount in account number " +accountNumber+ "is $" +balance);
    }
}
