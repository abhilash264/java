import java.util.Scanner;
public class palindrome{
public static void main(String args[])
{
Scanner pd=new Scanner(System.in);
System.out.println("Enter a number:");
int num=pd.nextInt();
int i=num;
int j=0,sum=0;
while(i>0)
{
j=i%10;
sum=sum*10+j;
i/=10;
}
if(num==sum)
{
System.out.println("This number is a palindrome number");
}
else
{
System.out.println("This number is not a palindrome number");
}
}
}
