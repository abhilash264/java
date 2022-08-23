public class Demo2
{
 static int x;
 void call()
{
  x+=5;
  new Demo2().x++;
  System.out.println(x);
 }
public static void main(String args[])
{
 System.out.println(x);
 new Demo2().x++;
 new Demo2().call();
 x+=5;
 System.out.println(x);
}
}