class A {
  int a;

  A() {

  }

  A(int a) {
    this.a = a;
    // a=a;
  }

  A(int x, int y) {
    a = x;
  }

  void display() {
    System.out.println(a);
  }

}

class ConstructorSample {
  public static void main(String args[]) {
    A a1 = new A();// creating and calling constructor with our parameters
    a1.display();// displaying a value
    A a2 = new A(1);//// creating and calling constructor with one parameter
    a2.display();
    a1.display();// cross checking
    A a3 = new A(100, 200);//// creating and calling constructor with two parameters
    a3.display();
    a1.display();// cross checking
  }
}