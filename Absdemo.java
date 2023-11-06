import java.math.*;

abstract class Abs
  {
    abstract void calculate(int n);
  }
class Abs1 extends Abs
  {
    void calculate(int n)
    {
      System.out.println("squere of number is: "+(n*n));
    }
  }
class Abs2 extends Abs
  {
    void calculate(int n)
    {
      System.out.println("cube of number"+(n*n*n));
    }
    
  }
class Abs3 extends Abs
  {
    void calculate(int n)
    {
      System.out.println("squere root"+Math.sqrt(n));
    }
  }
class Absdemo
  {
    public static void main(String args[])
    {
      Abs1 a1=new Abs1();
      a1.calculate(10);
      Abs2 a2=new Abs2();
      a2.calculate(10);
      Abs3 a3=new Abs3();
      a3.calculate(20);
    }
  }