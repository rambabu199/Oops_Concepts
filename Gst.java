import java.util.*;

class Demo {
  Scanner sc = new Scanner(System.in);
  static int price = 230;
  int cgst;

  void gst() {

    int sgst;
    System.out.println("enter the central gst : ");
    cgst = sc.nextInt();
    System.out.println("enter the state gst : ");
    sgst = sc.nextInt();
    int total = price + cgst + sgst;
    System.out.println("total mrp is  : " + total);

  }
}

class Gst {
  public static void main(String args[]) {
    Demo ap = new Demo();
    Demo ka = new Demo();
    Demo ts = new Demo();
    ap.gst();
    ka.gst();
    ts.gst();
  }
}