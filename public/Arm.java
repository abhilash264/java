public class Arm
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int i=n;
int j=0,sum=0;
while(i>0)
{
j=i%10;
sum+=(j*j*j);
i/=10;
}
if(n==sum)
{
System.out.println(n+" is an Armstrong number ");
}
else
{
System.out.println(n+" is not an Armstrong number ");
}
}
}
