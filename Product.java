/*Point of Sale System: Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.*/
import java.util.*;
class Sale
  {
    Scanner sc=new Scanner(System.in);
    String pname;
    double price;
    int quan;
    void details()
    {
      System.out.println("enter product name");
      pname=sc.nextLine();
      System.out.println("enter product price");
      price=sc.nextDouble();
      System.out.println("enter product quantity");
      quan=sc.nextInt();
    }
    void getName()
    {
      System.out.println("the product name"+pname);
    }
    void getPrice()
    {
      System.out.println("the product price"+price);
    }
    void getQuantity()
    {
      System.out.println("the product quantity"+quan);
    }
  }
class Product
  {
    public static void main(String args[])
    {
      Sale p1=new Sale();
      p1.details();
      p1.getName();
      p1.getPrice();
      p1.getQuantity();
      Sale p2=new Sale();
      p2.details();
      p2.getName();
      p2.getPrice();
      p2.getQuantity();
      
    }
  }
