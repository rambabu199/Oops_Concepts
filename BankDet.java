class BankAccount {
    private int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Amount: " + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Amount: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        double withdrawalFee = amount * 0.01;
        double totalAmount = amount + withdrawalFee;
        if (totalAmount <= balance) {
            balance -= totalAmount;
            System.out.println("Withdrawn Amount from Savings Account: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest Earned: " + interest);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawn Amount from Current Account: " + amount);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit!");
        }
    }
}

public class BankDet {
    public static void main(String[] args) {
        BankAccount savingsAcc = new SavingsAccount(12345, 5000, 2.5);
        BankAccount currentAcc = new CurrentAccount(67890, 10000, 2000);

        // Deposit to accounts
        savingsAcc.deposit(2000);
        currentAcc.deposit(3000);

        // Withdraw from accounts
        savingsAcc.withdraw(1000);
        currentAcc.withdraw(15000);

        // Calculate interest for SavingsAccount
        if (savingsAcc instanceof SavingsAccount) {
            SavingsAccount sa = (SavingsAccount) savingsAcc;
            sa.calculateInterest();
        }

        // Display final balances
        System.out.println("Savings Account Balance: " + savingsAcc.balance);
        System.out.println("Current Account Balance: " + currentAcc.balance);
    }
}
