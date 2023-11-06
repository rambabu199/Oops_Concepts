/*create a class Petroleum have data members with price and quality of  Petroleum liquid. Assume starting  1 liter Petroleum liquid is Rs.20. Extend this class by India with method addGst() will add 30%gst to basic 1 liter Petroleum liquid. Further extend India class by States class have its own method call finalPrice() , this method gives final price of liter Petroleum liquid based on number of liters */
import java.util.*;
class Base
  {
    int price=20;
    int bprice;
    void baseprice()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of liters");
      int n=sc.nextInt();
      bprice=n*price;
    }
  }
class Gst extends Base
  {
    int gst;
    void gst()
    {
      gst=(bprice*30)/100;
      System.out.println("gst amount"+gst);
    }
  }
class Total extends Gst
  {
    void total()
    {
      int total=bprice+gst;
      System.out.println("total price"+total);
    }
  }
class Petrolium
  {
    public static void main(String args[])
    {
      Total t=new Total();
      t.baseprice();
      t.gst();
      t.total();
    }
  }