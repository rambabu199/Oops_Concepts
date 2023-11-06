class First
{
    int x=10;
    void display()
    {
        System.out.println("x="+x);
    }
}
class Second extends First
{
    int x=40;
    void display()
    {
    super.display(); // ---> it will call super class display() hidden in child class
        System.out.println("x="+x);//  ---> x=40
     System.out.println("x="+super.x);//---> x=10
    }
}
class SuperExample
{
public static void main(String l[])
{
    Second s=new Second();
    s.display();  // child class display method

}
}