import java.util.Scanner;

class Employee {
  String name;
  int year;
  double salary;
  String address;

  Employee() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter employee name");
    name = sc.next();
    System.out.println("enter year of joining");
    year = sc.nextInt();
    System.out.println("enter employee salary");
    salary = sc.nextDouble();
    System.out.println("enter employee Address");
    address = sc.nextLine();
  }

  void display() {
    System.out.println(name);
    System.out.println(year);
    System.out.println(salary);
    System.out.println(address);
  }

}

class Sample {
  public static void main(String args[]) {

    Employee e[] = new Employee[4];
    /*
     * dynamic array size
     * 
     * Scanner sc=new Scanner(System.in);
     * System.out.println("enter number of employees");
     * int n=sc.nextInt();
     * Employee e[]=new Employee[n]
     * for(int i=0;i<n;i++){
     * e[i]=new Employee();
     * e[i].display();
     * }
     * 
     */

    for (int i = 0; i < 4; i++) {
      e[i] = new Employee(); // here all employee object will have same values
      e[i].display();
    }
    //

  }
}