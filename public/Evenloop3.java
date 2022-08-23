public class Evenloop3
{
public static void main(String args[])
{
int num=6,i=1,count=0;
while(i<=num)
{
if(num%i==0)
{
count++;
}
i++;
}
if(count==2)
{
System.out.println("This is a prime number");
}
else{
System.out.println("This is not a prime number");
}
}
}