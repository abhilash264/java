interface A
{
int data=120;
void m1();
void m2();
}
abstract class X
{
public X()
{
System.out.println("Abstract class");
}
String name;
public abstract void setName(String name);
public abstract String getName();
}
public class Test24 extends X implements A
{
@Override
public void m1()
{
System.out.println("Hello Friends");
}
@Override 
public void m2()
{
System.out.println("I am Rashmi");
}
@Override 
public void setName(String name)
{
this.name=name;
}
@Override
public String getName()
{
return name;
}
public static void main(String args[])
{
Test24 tt=new Test24();
tt.m1();
tt.m2();
tt.setName("Java Technocrat");
System.out.println("Name is:"+tt.getName());
System.out.println("data value is:"+A.data);
}
}
