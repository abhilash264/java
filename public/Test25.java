interface A
{
void fun();
}
interface B
{
void fun();
}
public class Test25 implements A,B
{
@Override
public void fun()
{
System.out.println("Hello");
}
public static void main(String args[])
{
Test25 tt=new Test25();
tt.fun();
}
}