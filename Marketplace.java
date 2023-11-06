/*You are building an online marketplace that connects buyers and sellers. The marketplace supports various payment methods and shipping options. Use interfaces to model the payment and shipping functionalities.

Create an interface named PaymentMethod with the following methods:

processPayment(double amount): A method that processes a payment of the given amount. Return true if the payment is successful, otherwise false.
Create an interface named ShippingMethod with the following methods:

shipItem(String item, String address): A method that simulates shipping an item to the specified address. Return true if the item is successfully shipped, otherwise false.
Implement two classes representing payment methods: a) CreditCardPayment: Implement the PaymentMethod interface for credit card payments. Include a constructor that takes the credit card number and expiry date as parameters. b) PayPalPayment: Implement the PaymentMethod interface for PayPal payments. Include a constructor that takes the PayPal account email.
Implement two classes representing shipping methods: a) StandardShipping: Implement the ShippingMethod interface for standard shipping. Provide a method that calculates the shipping cost based on the item's weight. b) ExpressShipping: Implement the ShippingMethod interface for express shipping. Provide a method that calculates the shipping cost based on the item's weight and distance to the destination.
In the Main class, simulate a transaction where a buyer purchases an item and selects a payment method and a shipping method. Process the payment and initiate shipping. Display appropriate messages indicating the success or failure of the transaction.*/
import java.util.Scanner;
interface paymentMethod{
  public  boolean processPayment(double amount); 
}
interface shippingMethod{
  public boolean shipItem(String item, String address);
}
class CreditCardPayment implements paymentMethod{

  CreditCardPayment(String Creditcardno,String expirydate){
   // this.Creditcardno=CreditCradno;
   // this.expirydate=expirydate;
    System.out.println("your creditcardno is"+ Creditcardno+"expiry date is "+expirydate);
  }
 
  public boolean processPayment(double amount){
     boolean paymentstatus=false;
    if (amount>0){
     
       paymentstatus=true;
      return paymentstatus;
    }
    else 
      return paymentstatus;
  }
}
class PayPalPayment  implements paymentMethod{
  PayPalPayment(String paypalname, String email){
   // super.ProcessPayment();
  }
  public boolean processPayment(double amount){
     boolean paymentstatus=false;
    if (amount>0){
      paymentstatus=true;
      return paymentstatus;
    }
  else
      return paymentstatus;
}
}
class StanaradShipping implements shippingMethod{
  StanaradShipping(double itemwieght){
    double shippingcost=(itemwieght*5);
    System.out.println("total standard shipping cost is "+shippingcost);
    
  }
  public  boolean shipItem(String item, String address){
    
    System.out.println("your item is "+item+"your adress is "+address);
    return true;
    
  }
  
}
class ExpressShipping  implements shippingMethod{
  ExpressShipping(int distance,double wieght){
    double totalcost=(distance*wieght*5);
    System.out.println("the total express shipping cost is"+totalcost);
  }
  public  boolean shipItem(String item, String address){
    System.out.println("your item is "+item+"your adress is "+address);
    return true;
  }
  //super.ShipItem();
}
public class Marketplace{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the payment method 1.CreditCardPayment "+'\n'+"2.PayPalPayment");
    int n=sc.nextInt();
    switch(n){
 case 1:
    CreditCardPayment cp=new CreditCardPayment("cred123","29/2025");
    cp.processPayment(2000);
        break;
      case 2:
         PayPalPayment pp=new  PayPalPayment("abulpaypal","abul123");
        pp.processPayment(3000);
        break;
      }
    System.out.println("enter the Shipping option "+'\n'+"1.Standard Shipping"+'\n'+"2.Express shipping");
    int n1=sc.nextInt();
    switch (n1){
      case 1:
        StanaradShipping sp=new StanaradShipping(23.5);
        sp.shipItem("phone","1/123");
        break;
      case 2:
        ExpressShipping ep=new ExpressShipping(100,24.6);
        ep.shipItem("tablet","1/423");
        break;
    }
  }
}