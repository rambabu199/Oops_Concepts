
/*ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.*/
import java.util.*;

class Account {
  Scanner sc = new Scanner(System.in);
  String name;
  long acnum;
  private double bal;

  void details() {
    System.out.println("enter user name:");
    name = sc.next();
    System.out.println("enter Account number: ");
    acnum = sc.nextLong();
    System.out.println("enter Account bal:");
    bal = sc.nextDouble();
  }

  void deposit() {
    double diposit;
    System.out.println("enter deposit ammount: ");
    diposit = sc.nextDouble();
    bal = bal + diposit;
  }

  void withdraw() {
    double withdraw;
    System.out.println("enter withdraw ammount: ");
    withdraw = sc.nextDouble();
    bal = bal - withdraw;
  }

  void checkbal() {
    System.out.println("the account balance is: " + bal);
  }

  void display() {
    System.out.println("the Account Holder Name: " + name);
    System.out.println("the Account Number: " + acnum);
    System.out.println("the account balance is: " + bal);
  }
}

class AtmSimulator {
  public static void main(String args[]) {
    Account ram = new Account();
    ram.details();
    ram.display();
    ram.deposit();
    ram.checkbal();
    ram.withdraw();
    ram.checkbal();
    Account babu = new Account();
    babu.details();
    babu.display();
    babu.deposit();
    babu.checkbal();
    babu.withdraw();
    babu.checkbal();
  }
}
