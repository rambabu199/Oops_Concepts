
// Abstract class representing a Bank Account

abstract class BankAccount {

    private String accountNumber;

    private double balance;

 

    public BankAccount(String accountNumber, double balance) {

        this.accountNumber = accountNumber;

        this.balance = balance;

    }

 

    abstract void withdraw(double amount);

 

    void deposit(double amount) {

        balance += amount;

        System.out.println("Deposited $" + amount + ". New balance: $" + balance);

    }

 

    double getBalance() {

        return balance;

    }
  double setBalance(double amount)
  {
    return balance=balance-amount;
  }

}

 

class SavingsAccount extends BankAccount {

    private double interestRate;

 

    public SavingsAccount(String accountNumber, double balance, double interestRate) {

        super(accountNumber, balance);

        this.interestRate = interestRate;

    }

 

    void withdraw(double amount) {

        if (amount <= getBalance()) {
          //double bal=super(balance);

            double withdrawalFee = 0.05 * amount;

            double totalWithdrawal = amount + withdrawalFee;

            if (totalWithdrawal <= getBalance()) {
              //super(balance)=super(balance)-totalWithdrawal;

                super.setBalance(totalWithdrawal);
              // setBalance(getBalance() - totalWithdrawal);
              

                System.out.println("Withdrawal fee: $" + withdrawalFee);

            } else {

                System.out.println("Insufficient balance for withdrawal.");

            }

        } else {

            System.out.println("Insufficient balance for withdrawal.");

        }

    }

 

    void addInterest() {

        double interest = getBalance() * interestRate;

        deposit(interest);

        System.out.println("Interest added: $" + interest);

    }

}

 

public class Bank {

    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000, 0.05);

        System.out.println("Initial balance: $" + savingsAccount.getBalance());

 

        savingsAccount.withdraw(200.00);

        System.out.println("Current balance: $" + savingsAccount.getBalance());

 

        savingsAccount.deposit(500);

        System.out.println("Current balance: $" + savingsAccount.getBalance());

 

        savingsAccount.addInterest();

        System.out.println("Current balance after interest: $" + savingsAccount.getBalance());

    }

}