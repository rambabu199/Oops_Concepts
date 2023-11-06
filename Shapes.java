/*Create a hierarchy of shapes: Shape, Circle, and Rectangle. Each shape should have a method calculateArea() that calculates its area. Override the calculateArea() method in the subclasses to provide specific implementations for circles and rectangles.*/
import java.util.*;
class Shape
  {
    void calculateArea()
    {
      System.out.println("this is shape class method");
    }
  }
class Circle extends Shape
  {
    void calculateArea()
    {
      float pi=3.14f;
      Scanner sc=new Scanner(System.in);      
      System.out.println("Enter radius of the Circle");
      int r=sc.nextInt();
      float area=pi*r*r;
      System.out.println("the area of the circle is: "+area);
    }
  }
class Triangle extends Shape
  {
    void calculateArea()
    {
      float p=0.5f;
      Scanner sc=new Scanner(System.in);      
      System.out.println("Enter bretch of the triangle");
      int b=sc.nextInt();
      System.out.println("Enter height of the triangle");
      int h=sc.nextInt();
      float area=p*b*h;
      System.out.println("the area of the circle is: "+area);
    }
  }
class Shapes
  {
    public static void main(String args[])
    {
      Shape s=new Shape();
      s.calculateArea();
      Circle c=new Circle();
      c.calculateArea();
      Triangle t=new Triangle();
      t.calculateArea();
    }
  }