import java.util.Scanner;
public class Test9{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter your name");
String name=ss.nextLine();
System.out.println("Enter your roll number");
int roll=ss.nextInt();
System.out.println("Enter your fee");
double fee=ss.nextDouble(); 
System.out.println(" Name is: "+name + " Roll: "+roll + " Fee: "+fee);
}
}