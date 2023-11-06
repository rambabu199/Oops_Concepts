/*
 * Design a system for a vehicle rental company that offers different types of
 * vehicles: Car, Motorcycle, and Truck. Each vehicle type has a method
 * calculateRentalCost() that calculates the rental cost based on factors like
 * rental duration and vehicle type. Implement the class hierarchy and
 * demonstrate method overriding for the calculateRentalCost() method.
 */
import java.util.*;
class Vehicle
  {
    void calculateRentalCost()
    {
      System.out.println("this is  vehicle class");
    }    
  }
class Car extends Vehicle
  {
    void calculateRentalCost()
    {
      int cost=1000;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of days do you want to rent");
      int n=sc.nextInt();
      int totalcost=n*cost;
      System.out.println("the Total cost of the car rent is: "+totalcost);
    }
  }
class Bike extends Vehicle
  {
    void calculateRentalCost()
    {
      int cost=500;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of days do you want to rent");
      int n=sc.nextInt();
      int totalcost=n*cost;
      System.out.println("the Total cost of the Bike rent is: "+totalcost);
    }
  }
class Truck extends Vehicle
  {
    void calculateRentalCost()
    {
      int cost=5000;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number of days do you want to rent");
      int n=sc.nextInt();
      int totalcost=n*cost;
      System.out.println("the Total cost of the Truck rent is: "+totalcost);
    }
  }
class Rental
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("*******MENU******");
      System.out.println("Rental details for one day");
      System.out.println("1)car===1000 Rs.");
      System.out.println("2)Bike===500 Rs.");
      System.out.println("3)Truck===5000 Rs.");
      System.out.println("4)vehicle.");
      System.out.println("enter your choice");
      int choice=sc.nextInt();
      Car c=new Car();
      Truck t=new Truck();
      Bike b=new Bike();
      Vehicle v=new Vehicle();
      switch(choice)
        {
          case 1:
            c.calculateRentalCost();
            break;
          case 2:
            b.calculateRentalCost();
            break;
          case 3:
            t.calculateRentalCost();
            break;
          case 4:
            v.calculateRentalCost();
            break;
          default:
            System.out.println("Wrong choice");
        }
    }
  }