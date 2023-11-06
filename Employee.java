/*Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.*/
class A {
  String ename, Address;
  int year;
  double salary;

  A(String ename, String Address, int year, double salary) {
    this.ename = ename;
    this.Address = Address;
    this.year = year;
    this.salary = salary;
  }

  void display() {
    System.out.println(ename);
    System.out.println(year);
    System.out.println(salary);
    System.out.println(Address);
  }
}

class Employee {
  public static void main(String args[]) {
    A e1 = new A("Robert", " 64C- WallsStreat", 1994, 65820.00);
    e1.display();
    A e2 = new A("sam", "68D- WallsStreat", 2000, 1000903.00);
    e2.display();
    A e3 = new A("john", "26B- WallsStreat", 1999, 250903.00);
    e3.display();
  }
}