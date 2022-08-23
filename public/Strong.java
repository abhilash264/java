import java.util.Scanner;
public class Strong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt(),sum=0;
int i=num;
while(num!=0)
{
sum=sum+;
num=num/10;
}
if(i==sum)
{
System.out.println("The number is a strong number");
}
else 
{
System.out.println("The number is not a strong number");
}
}
}