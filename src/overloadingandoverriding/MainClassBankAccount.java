package overloadingandoverriding;

import java.util.Scanner;

public class MainClassBankAccount {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the Bank Account Number: ");
        String accountNumber= scanner.nextLine();
        System.out.println("Enter the Bank Balance");
        double balance=scanner.nextDouble();
        scanner.nextLine();

        BankAccount bac=new BankAccount(accountNumber,balance);

        System.out.println("Enter the amount you need to Deposit: ");
        double cashDeposit=scanner.nextDouble();
        bac.deposit(cashDeposit);

        System.out.println("Enter the cheque number which the amount needs to deposit: ");
        scanner.nextLine();
        String chequeNum= scanner.nextLine();

        System.out.println("Enter the amount you need to Deposit in Cheque: "+chequeNum);
        double chequeAmount=scanner.nextDouble();
        bac.deposit(chequeNum,chequeAmount);

        System.out.println("Enter the amount you want to Withdraw: ");
        double withdrawAmount=scanner.nextDouble();
        bac.withdraw(withdrawAmount);

        System.out.println("***DISPLAYING BANK BALANCE***");
        bac.displayBalance();
        scanner.nextLine();

        System.out.println("***Savings Account***");

        System.out.println("Enter the Savings Account Number:");
        String savAccNum=scanner.nextLine();
        System.out.println("Enter the current amount in Savings account: ");
        double savAmount=scanner.nextDouble();
        System.out.println("Enter the minimum amount maintained in the Savings account:");
        double minBalSav=scanner.nextDouble();

        SavingsAccount sav= new SavingsAccount(savAccNum,savAmount,minBalSav);

        System.out.println("The amount deposited in the Savings Account: ");
        double savDeposit=scanner.nextDouble();
        sav.deposit(savDeposit);

        System.out.println("Enter amount to withdraw from Savings Account: ");
        double savWithdraw=scanner.nextDouble();
        sav.withdraw(savWithdraw);

        System.out.println("Enter another amount to withdraw from Savings Account: ");
        double savAnotherWithdraw=scanner.nextDouble();
        sav.withdraw(savAnotherWithdraw);

        System.out.println("*** Savings Account Balance after transactions ***");
        sav.displayBalance();

        System.out.println("\n*** Final Balances ***");

// Display final balance of BankAccount
        System.out.println("Final balance in BankAccount:");
        bac.displayBalance();

// Display final balance of SavingsAccount
        System.out.println("Final balance in SavingsAccount:");
        sav.displayBalance();
        scanner.close();
    }
}

