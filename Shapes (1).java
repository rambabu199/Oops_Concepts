/*Create an interface named Shape with the following methods:
calculateArea(): A method that calculates and returns the area of the shape.
calculatePerimeter(): A method that calculates and returns the perimeter of the shape.
Implement two classes that represent different shapes: a) Circle: Implement the Shape interface for circles. Include a constructor that takes the radius as a parameter. Implement the calculateArea and calculatePerimeter methods for circles. b) Rectangle: Implement the Shape interface for rectangles. Include a constructor that takes the length and width as parameters. Implement the calculateArea and calculatePerimeter methods for rectangles.
In the Main class, create instances of both Circle and Rectangle. Test each shape's calculation methods by calculating and printing their areas and perimeters.*/
interface Shape 
{
  public void calculateArea();
  public void calculatePerimeter();
}
class Circle implements Shape
  {
    double pi=3.14d;
    double radius;
    Circle(double radius)
    {
      this.radius=radius;
    }
    public void calculateArea()
    {
      double area=pi*radius*radius;
      System.out.println("radius of the circle is: "+area);
    }
    public void calculatePerimeter()
    {
      double perimeter=2*pi*radius;
      System.out.println("perimeter of the circle is: "+perimeter);
    }
  }

class Rectangle implements Shape
  {
    double w,l;
    double area,perimeter;
    Rectangle(double w,double l)
    {
      this.w=w;
      this.l=l;
    }
    public void calculateArea()
    {
      area=l*w;
      System.out.println("area of the rectangle is: "+area);
    }
    public void calculatePerimeter()
    {
      perimeter=(l+w)*2;
      System.out.println("the perimeter of the rectangle is: "+perimeter);
    }
  }
class Shapes
  {
    public static void main(String args[])
    {
      Circle c=new Circle(12.30);
      c.calculateArea();
      c.calculatePerimeter();
      Rectangle r=new Rectangle(10.0,10.0);
      r.calculateArea();
      r.calculatePerimeter();
        
    }
  }