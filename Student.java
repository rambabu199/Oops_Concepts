class A {
  // int m,c,p,avg;
  int avg;

  A(int m, int ph, int ch) {
    /*
     * this.m=m;// we can use this key word
     * p=ph;
     * c=ch;
     * avg=m+c+p/3
     */
    avg = m + ch + ph / 3;// finding avg 
  }

  void display() {
    System.out.println(avg);// we can display
  }
}

class Student {
  public static void main(String args[]) {
    A s1 = new A(90, 90, 90);
    s1.display();
    A s2 = new A(75, 55, 90);
    s2.display();
    A s3 = new A(98, 55, 69);
    s3.display();
  }
}