import java.util.*;
class Student
{
        void writeExam()
    {
            System.out.println(" i am writing exam now");
    }

}

 

class Fauclty extends Student
{

    void testExam()
    {
            System.out.println(" i was conducted exam ");
    }

}
class college extends Fauclty
{
     void examStatus()
    {

        System.out.println("faculty conducted exam and student written exam");
    }
}

 

class Multilevel
{
    public static void main(String a[])
    {
        college c=new college();
        c.writeExam();
        c.testExam();
        c.examStatus();




    }

}