import java.util.*;
interface B
  {
    public void fact();
  }
class A
  {
    int n;
    void num()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number to find factorial");
      n=sc.nextInt();
    }
    
  }
class C extends A implements B
  {
  /*
  other approch 
  // int n;

    /*C()
    {      
      n=super.n;
     
    }*/
    public void fact()
    {
      int f=1;
      for(int i=1;i<=n;i++)
        f=f*i;
      System.out.println("factorial of given number"+f);
    }
  }
class MultipleExample
  {
    public static void main(String args[])
    {
      C c=new C();
      c.num();
      c.fact();
    }
  }