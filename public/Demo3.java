public class Demo3
{ 
 static int data=get();
 static int get()
 {
  System.out.println("I am in JT");
  return 105;
 }
public static void main(String args[])
{
 System.out.println("main");
 System.out.println(data);
 System.out.println("leave main");
}
}
