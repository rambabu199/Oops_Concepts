final class FinalEx
  {
    final float pi=3.14f;
    float r=10.20f;
    void area()
    {
      float area=pi*r*r;
      System.out.println("area of circle"+area);
    }
    final void display()
    {
      System.out.println("final method ");
    }
  }
class FinalExample //extends FinalEx// we get error
  {
    public static void main(String args[])
    {
      FinalEx f=new FinalEx();
      f.area();
     
    }
    /* void display()
        {
          Syste.out.println("display");
        }
  */}