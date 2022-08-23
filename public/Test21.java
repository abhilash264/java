import java.util.*;
interface Area
{
void area();
}
class Circle implements Area 
{
@Override
public void area()
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter the radius of the circle");
int r=ss.nextInt();
System.out.println("Area of the circle is :" +(3.14*r*r) + " units");
}
}
class Rectangle implements Area
{
@Override
public void area()
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter the length");
int length=ss.nextInt();
System.out.println("Enter the breadth");
int breadth=ss.nextInt();
System.out.println("Area of the rectangle is :"+length*breadth + " units");
}
}
class Square implements Area 
{
@Override 
public void area()
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter the length");
int length=ss.nextInt();
System.out.println("Area of the square is :"+ length*length + " units" );
}
}
class Demo
{
public static void display(Area aa)
{
aa.area();
}
}
public class Test21
{
public static void main(String args[])
{
String data=args[0];
if(data.equalsIgnoreCase("Circle"))
{
Demo.display(new Circle());
}
else if(data.equalsIgnoreCase("Square"))
{
Demo.display(new Square());
}
else if(data.equalsIgnoreCase("Rectangle"))
{
Demo.display(new Rectangle());
}
else
{
try
{
Demo.display(null);
}
catch(NullPointerException ne)
{
System.out.println("Wrong Input");
}
}
}
}