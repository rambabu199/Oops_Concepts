/*. Point of Sale System: Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity. Create another class called "PointOfSale" that represents a point of sale system. The class should have a list of products, and methods such as addProduct, removeProduct, and getTotalCost.*/
import java.util.*;
class Product
{
  Scanner sc=new Scanner(System.in);
  String name;
  double price;
  int quantity;
  void details()
  {
    System.out.println("enter the product name");
    name=sc.nextLine();
    System.out.println("enter the product price");
    price=sc.nextDouble();
    System.out.println("enter the product quantity");
    quantity=sc.nextInt();
  }
  void getName()
  {
    System.out.pintln("product name: "+name);
  }
  void getPrice()
  {
    System.out.pintln("product price: "+price);
  }
  void getQuantity()
  {
    System.out.pintln("product quantity: "+quantity);
  }
}
class PointOfSale extends Product
  {
   
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      System.out.println("enter the types of products");
      int n=sc.nextInt();
      PointOfSale p[]=new PointOfSale[n];
      for(int i=0;i<n;i++)
        {
          p[i]=new PointOfSale();
          p[i].details();
        }
    }
    void list()
    {}
    void addProduct(){}
    void removeProduct(){}
    void getTotalCost(){}
  }