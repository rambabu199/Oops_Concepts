/*//create a class arthematic having method caluclate(display own msg) extend arthematic class by add sub mul, override calculate method to perform respective operation between two variables*/
class Art {
  void calculate(int a, int b) {
    System.out.println("its is a ART class");
  }
}

class Addition extends Art {
  void calculate(int a, int b) {
    System.out.println("Addition operation : " + (a + b));
  }
}

class Subtraction extends Art {
  void calculate(int a, int b) {
    System.out.println("Subtraction operation : " + (a - b));
  }
}

class Multiplication extends Art {
  void calculate(int a, int b) {
    System.out.println("Multiplication operation : " + (a * b));
  }
}

class Arthmetic {
  public static void main(String args[]) {
    Art a = new Art();
    a.calculate(10, 20);
    Addition a1 = new Addition();
    a1.calculate(10, 20);
    Subtraction s = new Subtraction();
    s.calculate(20, 10);
    Multiplication m = new Multiplication();
    m.calculate(10, 20);
  }
}