
/*. ATM Simulator: Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.*/
import java.util.*;

class Account {
  Scanner sc = new Scanner(System.in);
  int acno;
  double bal;
  String cname;

  void details() {
    System.out.println("enter the Account Holder name");
    cname = sc.nextLine();
    System.out.println("enter the Account Number");
    acno = sc.nextInt();
    System.out.println("enter Balance");
    bal = sc.nextDouble();
  }

  void deposit() {
    System.out.println("enter deposite ammount");
    int amount = sc.nextInt();
    bal = bal + amount;
    System.out.println("balance after deposite " + bal);
  }

  void withdraw() {
    System.out.println("enter withdraw amount");
    int withdraw = sc.nextInt();
    if (bal < withdraw)
      System.out.println("Insufficent balance");
    else {
      bal = bal - withdraw;
      System.out.println("the bal after withdraw " + bal);
    }

  }

  void checkbalance() {
    System.out.println("the balnce of ACCOUNT number " + acno + " is :" + bal);
  }
}

class ATMSimulator extends Account {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of accounts");
    int n = sc.nextInt();
    ATMSimulator arr[] = new ATMSimulator[n];
    for (int i = 0; i < n; i++) {
      arr[i] = new ATMSimulator();
      arr[i].details();
      arr[i].deposit();
      arr[i].checkbalance();
      arr[i].withdraw();
      arr[i].checkbalance();
    }
    ATMSimulator a = new ATMSimulator();
    a.listofaccounts(arr);
    a.addAccount(arr);
    a.removeAccount(arr);
  }

  void listofaccounts(ATMSimulator arr[]) {
    System.out.println("the list of accounts");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i].cname);
      System.out.println(arr[i].acno);
      System.out.println(arr[i].bal);
    }
  }

  void addAccount(ATMSimulator arr[]) {
    System.out.println("enter the account details do you want to enter");
    ATMSimulator newacount = new ATMSimulator();
    newacount.details();
    arr[arr.length - 1] = newacount;
    ATMSimulator a2 = new ATMSimulator();
    a2.listofaccounts(arr);

  }

  void removeAccount(ATMSimulator arr[]) {
    System.out.println("enter which ac do you want to delete");
    int pos = sc.nextInt();
    for (int i = pos; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    System.out.println("acounts after deletion");
    /*
     * for (int i = 0; i < arr.length - 1; i++) {
     * System.out.println(arr[i].details());
     */
    // ATMSimulator a1 = new ATMSimulator();
    // for(int i=0;i<arr.length-1;i++){
    // a1.listofaccounts(arr[i]);
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.println("the acount holder name :" + arr[i].cname);
      System.out.println("Account number :" + arr[i].acno);
      System.out.println("Account Balance :" + arr[i].bal);
      // a1.listofaccounts(arr);;
    }

  }

}
