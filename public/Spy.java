import java.util.Scanner;
public class Spy
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
int i=num,sum=0,product=1;
while(num!=0)
{
sum=sum+num%10;
product=product*(num%10);
num=num/10;
}
if(sum==product)
{
System.out.println("The number is a Spy number");
}
else
{
System.out.println("The number is not a Spy number");
}
}
}