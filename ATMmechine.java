abstract class ATM
  {
    abstract void insertcard();
    abstract void enterpin();
    abstract void withdraw();
    abstract void checkbal();
  }
class BasicAtm extends ATM
{
  void insertcard()
  {
    System.out.println("insert card");
  }
  void enterpin()
  {
    System.out.println("enter pin");
  }
  void withdraw()
  {
    System.out.println("withdraw amount");
  }
  void checkbal()
  {
    System.out.println("balance");
  }
}
class ATMmechine
  {
    public static void main(String args[])
    {
      BasicAtm a=new BasicAtm();
      a.insertcard();
      a.enterpin();
      a.withdraw();
      a.checkbal();
    }
  }