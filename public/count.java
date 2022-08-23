public class count{
public static void main(String args[])
{
int num=1234, c=0;
while(num!=0)
{
c++;
num=num/10;
}
System.out.println("The number is "+c+" digits ");
}
} 