interface ClassD
  {
    public void display();
  }
class ClassA
  {
    int a=10;
  }
class ClassB extends ClassA
  {
    int b=20;
  }
class ClassC extends ClassB implements ClassD
  {
    public void display()
    {
      int c=a+b;
      System.out.println("result"+c);
    }
  }
class Hybrid
  {
    public static void main(String args[])
    {
      ClassC c=new ClassC();
      c.display();
    }
  }