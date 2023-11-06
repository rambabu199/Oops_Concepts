//A person wants to travel from bangalore to delhi, find the travel expenses
class Expense {
  void exp(String bus, int price) {
    System.out.println("the travelling expense over a bus is" + price);
  }

  void exp(String car, float price) {
    System.out.println("the travelling expense over a car is" + price);
  }

  void exp(String train, double price) {
    System.out.println("the travelling expense over a train is" + price);
  }

  void exp(String flight, String price) {
    System.out.println("the travelling expense over a flight is" + price);
  }
  void exp(int price,String bus) {
    System.out.println("the travelling expense over a bus is" + price);
  }

}

class Traveling {
  public static void main(String args[]) {
    Expense e = new Expense();
    e.exp("bus", 20000);
    e.exp("train", 10000.0f);
    e.exp("car", 30000.23);
    e.exp("flight", "40000");
    e.exp(100, "bus");
  }
}