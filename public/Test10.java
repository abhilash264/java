public class Test10
{
static void m1()
{
System.out.println("class method");
}
Test10()
{
System.out.println("object is constructed");
}
static 
{
System.out.println("class block");
}
void m2()
{
System.out.println("object method");
 }
{
System.out.println("object block");
 }
public static void main(String args[])
{
System.out.println("main method");
m1();
Test10 tt=new Test10();
tt.m2();
System.out.println("leave main method");
}
}