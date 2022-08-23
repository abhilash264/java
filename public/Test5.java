public class Test5
{
 public static void main(String args[])
 {
 System.out.println("in main");
}
static{
 System.out.println("In class block.");
 main(new String[0]);
 System.out.println("class block");
 }
}