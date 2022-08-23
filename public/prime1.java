public class prime1
{
public static void main(String args[])
{
int n=Integer.parseint(args[0]);
i=1,count=0;
while(i<=n)
{
if(n%i==0)
{
count++;
}
i++;
}
if(count==2)
{
System.out.println("This is a prime number");
}
else
{
System.out.println("This is not a prime number");
}
}
}