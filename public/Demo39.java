import java.util.Scanner;
public class Demo39
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt(),i=1;
while(i<=num)
{
if(num%i==0)
{
System.out.println(i + " is the factor of the number");
}
i++;
}
}
}
