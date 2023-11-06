/*Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.*/
class A
  {
    String sname,Address;
    long mobile;
    int rollno;
    A(String sname,String Address,long mobile,int rollno)
    {
      this.sname=sname;
      this.Address=Address;
      this.mobile=mobile;
      this.rollno=rollno;      
    }
    void display()
    {
      System.out.println(sname);
      System.out.println(rollno);
      System.out.println(mobile);
      System.out.println(Address);
    }
  }
class Student2
  {
    public static void main(String args[])
    {
      A s1=new A("sam","4-30,rarara",989898989,102);
      s1.display();
      A s2=new A("john","1-800,iaiaia",99999999,109);
      s2.display();
    }
  }