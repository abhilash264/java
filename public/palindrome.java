import java.util.Scanner;
public class palindrome{
public static void main(String args[])
{
Scanner pd=new Scanner(System.in);
System.out.println("Enter a number:");
int num=pd.nextInt(),rev=0;
int temp=num;
while(num!=0)
{
rev=rev*10+(num%10);
num=num/10;
}
if(rev==temp)
{
System.out.println("This number is a palindrome number");
}
else
{
System.out.println("This number is not a palindrome number");
}
}
}
