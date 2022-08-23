import java.util.Scanner;
public class Armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
int i=num,sum=0;
while(num!=0)
{
sum=sum+(num%10)*(num%10)*(num%10);
num=num/10;
}
if(i==sum){
System.out.println("The number is an Armstrong number");
}
else
{
System.out.println("The number is not an Armstrong number");
}
}
}