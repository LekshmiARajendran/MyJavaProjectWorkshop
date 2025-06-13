package overloadingandoverriding;

public class SavingsAccount extends BankAccount{
    double minBalance;
    SavingsAccount(String accountNumber,double balance,double minBalance){
        super(accountNumber,balance); //calling the parent constructor
        this.minBalance=minBalance;
    }
    @Override
    void withdraw(double amount){
        if((balance-amount) >= minBalance){
            balance= balance-amount;
            System.out.println("The withdrawn amount from the account number "+accountNumber+ "is $" +amount);
        }
        else{
            System.out.println("Sorry, Your cannot withdraw from your minimum balance amount" +minBalance);
        }
    }
}
