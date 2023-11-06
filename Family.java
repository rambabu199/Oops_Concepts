class Mother {
  void prepareFood() {
    System.out.println("prapare food for lunch");
  }
}

class Daughter extends Mother {
  void prepareFood() {
    System.out.println("i am preparing Dal");
  }

}

class Son extends Mother {
  void prepareFood() {
    System.out.println("i am preparing rice");
  }

}

class Family {
  public static void main(String l[]) {
    Mother m = new Mother();
    m.prepareFood();
    Daughter d = new Daughter();
    d.prepareFood();
    Son s = new Son();
    s.prepareFood();
  }
}