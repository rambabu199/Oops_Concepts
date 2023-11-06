/*You are building an online marketplace that connects buyers and sellers. The marketplace supports various payment methods and shipping options. Use interfaces to model the payment and shipping functionalities.

Create an interface named PaymentMethod with the following methods:
processPayment(double amount): A method that processes a payment of the given amount. Return true if the payment is successful, otherwise false.
Create an interface named ShippingMethod with the following methods:
shipItem(String item, String address): A method that simulates shipping an item to the specified address. Return true if the item is successfully shipped, otherwise false.
Implement two classes representing payment methods: a) CreditCardPayment: Implement the PaymentMethod interface for credit card payments. Include a constructor that takes the credit card number and expiry date as parameters. b) PayPalPayment: Implement the PaymentMethod interface for PayPal payments. Include a constructor that takes the PayPal account email.
Implement two classes representing shipping methods: a) StandardShipping: Implement the ShippingMethod interface for standard shipping. Provide a method that calculates the shipping cost based on the item's weight. b) ExpressShipping: Implement the ShippingMethod interface for express shipping. Provide a method that calculates the shipping cost based on the item's weight and distance to the destination.
In the Main class, simulate a transaction where a buyer purchases an item and selects a payment method and a shipping method. Process the payment and initiate shipping. Display appropriate messages indicating the success or failure of the transaction*/
import java.util.*;
interface PaymentMethod
  {
    public boolean processPayment(double amount);
  }
interface ShippingMethod
  {
    public boolean shipItem(String item, String address);
  }
class CreditCardPayment implements PaymentMethod
  {
    long creditcardnumber;
    String expirydate;
    CreditCardPayment(long creditcardnumber,String expirydate)
    {
      this.creditcardnumber=creditcardnumber;
      this.expirydate=expirydate;
    }
    public boolean processPayment(double amount)
    {
     System.out.println("payment successful");
      return true;
    }
  }
class PaypalPayment implements PaymentMethod
  {
    String email;
    PaypalPayment(String email)
    {
      this.email=email;
    }
    public boolean processPayment(double amount)
    {
     System.out.println("payment successful");
      return true;
    }
  }
class StanderdShipping implements ShippingMethod
  {
    public boolean shipItem(String item, String address)
    {
       System.out.println("shipping successful");
      return true;    
    }
  }
class ExpressShipping implements ShippingMethod
  {
    public boolean shipItem(String item, String address)
    {
       System.out.println("shipping successful");
      return true;    
    }
  }

