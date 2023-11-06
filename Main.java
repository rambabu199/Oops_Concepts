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
class BankAccount
{
    private int accountNumber;
    protected double balence;

    public BankAccount(int accountNumber)
    {
        this.accountNumber=accountNumber;
        this.balence=0.0;
    }

    public void deposit(double amount)
    {
        if(amount>0)
        {
         balence=balence+amount;
         System.out.println("The Deposite Amount"+amount); 
        }
        else
        {
            System.out.println("This is Invalid Amount"); 
        }
    }
   public void withdraw(double amount)
    {
        if(amount>0 && amount<=balence)
        {
         balence=balence-amount;
         System.out.println("The Withdrawn Amount"+amount); 
        }
        else
        {
            System.out.println("Insuffician balence"); 
        }
    }
}
class SavingsAccount extends BankAccount
{
    private double intrest;

    public SavingsAccount(int accountNumber,double intrestrate)
    {
      super(accountNumber);
      this.intrest=intrestrate;
    }

 

    public void withdraw(double amount)
    {
        double withdrawfee=amount*0.01;
        double totalamount=amount+withdrawfee;

        if(totalamount<=balence)
        {
           balence=balence-totalamount;
           System.out.println("The Withdraw amount is:"+amount);
           //return true;
        }
        else
        {
            System.out.println("Insufficiant Balence");
            // false;
        }

    }
    public double calculateIntrest()
    {
        return balence*intrest/100;
    }

}
class CurrentAccount extends BankAccount
{
    private double overdraftLimit;

    public CurrentAccount(int accountNumber,double overdraftLimit)
    {
      super(accountNumber);
      this.overdraftLimit=overdraftLimit;
    }

 

    public void withdraw(double amount)
    {
        //double withdrawfee=amount*0.01;
        //double totalamount=amount+withdrawfee;

        if(amount<=overdraftLimit)
        {
          overdraftLimit=overdraftLimit-amount;
           balence=balence-amount;
           System.out.println("The Withdraw amount is:"+amount);
           //return true;
        }
        else
        {
            System.out.println("Insufficiant Balence");
            // false;
        }

    }
}

class Main
{
    public static void main (String[] args) {
     SavingsAccount sa=new SavingsAccount(1234,1.5);
     sa.deposit(500);
     sa.withdraw(200);
     double intrestFinal=sa.calculateIntrest();
     System.out.println("The intrestFinal amount is:"+intrestFinal);
     System.out.println("The Final amount balance is:"+sa.balence);
      CurrentAccount c=new CurrentAccount(1245,500.0);
      c.deposit(1000);
      c.withdraw(200);
      System.out.println("the remainig balance is: "+c.balence);
      //System.out.println("the remaining limit is: "+c.overdraftLimit);
    }


}