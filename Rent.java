
/*You are tasked with designing a simple vehicle rental system. The system should have the following classes: Vehicle, Car, and Bike. Both Car and Bike should inherit from Vehicle. Implement the classes and create a program to test their functionalities.

Vehicle class:
Attributes:
registrationNumber (String): Represents the registration number of the vehicle.
fuelType (String): Represents the type of fuel used by the vehicle (e.g., petrol, diesel, electric).
rentalRate (double): Represents the rental rate per day for the vehicle.
Methods:
displayInfo(): Displays the basic information of the vehicle (registration number, fuel type, and rental rate).
Car class (subclass of Vehicle):
Attributes:
numberOfDoors (int): Represents the number of doors in the car.
Methods:
Override displayInfo(): Displays the basic information of the car along with the number of doors.
Bike class (subclass of Vehicle):
Attributes:
hasCarrier (boolean): Represents whether the bike has a carrier or not.
Methods:
Override displayInfo(): Displays the basic information of the bike along with the carrier status.

Your program should create instances of Car and Bike, demonstrate the functionality of displaying their information, and calculate the total rental cost for a given number of days for both vehicles.

Implement the classes and demonstrate the functionality of the vehicle rental system with a sample program that performs the following steps:

Create a car with registration number "CAR123", fuel type "petrol", rental rate $50 per day, and 4 doors.
Create a bike with registration number "BIKE456", fuel type "electric", rental rate $30 per day, and a carrier.
Display the information of both the car and the bike.
Ask the user to enter the number of days they want to rent the car and the bike.
Calculate and display the total rental cost for both vehicles separately and the combined total cost*/
import java.util.*;

class Vehicle {
  protected String reg_num;
  protected String fuel;
  protected double rent;

  Vehicle(String reg, String fuel, double rent) {
    this.fuel = fuel;
    this.reg_num = reg;
    this.rent = rent;
  }

  void displayInfo() {
    System.out.println("display vehicle details");
  }

}

class Car extends Vehicle {
  int noofdoors = 4;
  int n;
  double totalcost;

  Car(String reg, String fuel, double rent) {
    super(reg, fuel, rent);
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the num of days do you want to rent");
    n = sc.nextInt();
    totalcost = n * rent;

  }

  void displayInfo() {
    System.out.println("the Registration number  of vehicle: " + reg_num);
    System.out.println("the fuel type of the vechile: " + fuel);
    System.out.println("the number of doors for vehicle: " + noofdoors);
    System.out.println("the total cost of rent" + totalcost);
  }
}

class Bike extends Vehicle {
  boolean hasCarrier = true;
  int n;
  double totalcost;

  Bike(String reg, String fuel, double rent) {
    super(reg, fuel, rent);
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the num of days do you want to rent");
    n = sc.nextInt();
    totalcost = n * rent;

  }

  void displayInfo() {
    System.out.println("the Registration number  of vehicle: " + reg_num);
    System.out.println("the fuel type of the vechile: " + fuel);
    System.out.println("the Bike Having Carrier: " + hasCarrier);
    System.out.println("the total cost of rent" + totalcost);
  }
}

class Rent {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("*********MENU*********");
    System.out.println("1)car Rent is 5000 Rs. per Day");
    System.out.println("2) Bike Rent is 1000 Rs. per Day");
    System.out.println("enter your choice");
    int ch = sc.nextInt();
    switch (ch) {
      case 1:
        Car c = new Car("CAR123", "Diesel", 5000);
        c.displayInfo();
        break;
      case 2:
        Bike b = new Bike("BIKE145", "Petrol", 1000);
        b.displayInfo();
        break;
      default:
        System.out.println("invalid choice");
    }
  }
}