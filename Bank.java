/*You are tasked with designing a simple banking system. The system should have the following classes: BankAccount, SavingsAccount, and CurrentAccount. Both SavingsAccount and CurrentAccount should inherit from BankAccount. Implement the classes and create a program to test their functionalities.

BankAccount class:
Attributes:
accountNumber (int): Represents the account number.
balance (double): Represents the account balance.
Methods:
deposit(double amount): Adds the given amount to the account balance.
withdraw(double amount): Deducts the given amount from the account balance.
SavingsAccount class (subclass of BankAccount):
Attributes:
interestRate (double): Represents the annual interest rate.
Methods:
Override withdraw(double amount): Deducts the given amount along with a withdrawal fee of 1% of the amount.
calculateInterest(): Calculates and returns the interest earned based on the account balance and interest rate.
CurrentAccount class (subclass of BankAccount):
Attributes:
overdraftLimit (double): Represents the overdraft limit allowed for this account.
Methods:
Override withdraw(double amount): Allows withdrawing the given amount only if the new balance after withdrawal is within the overdraft limit.

Your program should create instances of SavingsAccount and CurrentAccount, demonstrate the functionality of depositing, withdrawing, and calculating interest (for savings account). Use polymorphism to handle objects of different account types within a single list.

Implement the classes and demonstrate the functionality of the banking system with a sample program that performs the following steps:

Create a savings account with an initial balance of $500 and an interest rate of 3.5%.
Deposit $300 into the savings account.
Withdraw $200 from the savings account.
Calculate and display the interest earned by the savings account.
Create a current account with an initial balance of $1000 and an overdraft limit of $500.
Deposit $200 into the current account.
Withdraw $1500 from the current account.
Display the final balances of both accounts after all transactions.*/
public class BankAccount {
  private int accountNumber;
  protected double balence;

  public BankAccount(int accountNumber, double balence) {
    this.accountNumber = accountNumber;
    this.balence = balence;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balence = balence + amount;
      System.out.println("The Deposite Amount" + amount);
    } else {
      System.out.println("This is Invalid Amount");
    }
  }

}

class SavingsAccount extends BankAccount {
  double interestRate = (amount / 0.1) * 100;

  void withdraw(double amount) {
    double withdrawfee = (amount / 1) * 100;
    if (amount > 0) {
      balance = (balance - amount - withdrawfee);
      System.out.println("withdraw amount from savings account" + amount);
    } else {
      System.out.println("enter valid amount");
    }
  }

  void calculateinterest(double amount) {
    double finalamount = (amount + interestRate);
    System.out.println("amount after adding  interest " + finalamount);
  }
}

class CurrentAccount extends BankAccount {
  double draftlimit = 500.0;

  void withdraw(double amount) {
    if (amount > 500.0) {
      balance = (balance - amount);
      System.out.println("withdraw amount is " + amount);
    } else {
      System.out.println("amount should be more than 500 to withdraw");
    }

  }
}

public class Bank {
  public static void main(String[] args) {
    BankAccount ba = new BankAccount(123, 0.0);
    SavingsAccount sa = new SavingsAccount();
    CurrentAccount ca = new CurrentAccount();
    ba.withdraw(2000);
    sa.withdraw(2000);
    sa.calculateinterest(3000);
    ca.withdraw(4000);
  }
}
