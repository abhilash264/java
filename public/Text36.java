public class Text36
{
int data;
Text36(int x);
{
data=x;
}
public static void main(String args[])
{
Text36 tt=new Text36(107);
System.out.println(tt);
}
public String toString()
{
return String.valueof(data);
}
}