import java.util.*;
class Student
{
    int rollno;
    double average;
    Student()
    {
        Scanner d=new Scanner(System.in);
        System.out.println("enter student rollno and  average");
        rollno=d.nextInt();
        average=d.nextDouble();

    }
    void showaverage()
    {
            System.out.println(rollno+"average is"+average);
    }

}
class BtechClass extends Student
{
    static void classAverage(double avg)
    {

        System.out.println("class average is"+avg);
    }
}

 

class SimpleInheritance1
{
    public static void main(String a[])
    {
        BtechClass bc1=new BtechClass();
        bc1.showaverage(); // inherited property


        BtechClass bc2=new BtechClass();
        bc2.showaverage(); // inherited property


 

        BtechClass bc3=new BtechClass();
        bc3.showaverage(); // inherited property



        double caverage=bc1.average+bc2.average+bc3.average;
        BtechClass.classAverage(caverage);// here we used class name becuase classAverage is static member and we are acessing out side of class BtechClass 

    }

}