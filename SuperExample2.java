class First {
  int x = 10;

  First() {
    System.out.println("i am super class constructor");
  }

  void display() {
    System.out.println("x=" + x);
  }
}

class Second extends First {
  int x = 40;

  Second() {
    super(); // call super class conctructor in side the constructor only
  }

  void display() {

    super.display(); // calling super class method
    System.out.println("x=" + x);
    System.out.println("x=" + super.x);
  }
}

class SuperExample2 {
  public static void main(String l[]) {
    Second s = new Second();
    s.display();

  }
}