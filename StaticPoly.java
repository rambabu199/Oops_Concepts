class RealEstate {
  void filter(int price) {
    System.out.println("price is: " + price);
  }

  void filter(double area) {
    System.out.println("area is: " + area);
  }

  void filter(String location) {
    System.out.println("location  is: " + location);
  }
}

class StaticPoly {
  public static void main(String args[]) {
    RealEstate r = new RealEstate();
    r.filter(1000000);
    r.filter(2035.55);
    r.filter("vijayawada");
  }
}