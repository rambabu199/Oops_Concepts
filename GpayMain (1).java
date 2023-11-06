import java.util.*;
class Gpay
{
   long mobileno;
    private int pinno;
    static int versionno;
    void billpayment()
    {
      Scanner t=new Scanner(System.in);
        int amount;
        pinno=2344;
        System.out.println("enter bill amount");
        amount=t.nextInt();
        System.out.println("paid bill amount of Rs" +amount+ " "+pinno);
    }
    void softwareupdate()
    {
        versionno=12;
        System.out.println("updating in mobile no"+mobileno);
    }
   static  void notification()
    {
        System.out.println("updated software version"+ versionno);
    }
}
public class GpayMain {
    public static void main(String args[]) 
  {
      
      Gpay user1=new Gpay();
      Gpay user2=new Gpay();
      user1.mobileno=11111111;
       user2.mobileno=22222222;
       user1.billpayment();
       user1.softwareupdate();
       Gpay.notification();
       user2.billpayment();
       user2.softwareupdate();
       Gpay.notification();
    }
}
