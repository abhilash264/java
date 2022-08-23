import java.util.Scanner;
public class perfect{
public static void main(String args[])
{
Scanner pr=new Scanner(System.in);
System.out.println("Enter a number");
int num=pr.nextInt() ,i=1,sum=0;
while(i<num)
{
if(num%i==0)
{
sum=sum+i;
}
i++;
}
if(sum==num)
{
System.out.println("This number is a perfect number");
}
else 
{
System.out.println("This number is not a perfect number");
}
}
}
