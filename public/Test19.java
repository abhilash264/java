public class Test19
{
public static void main(String args[])
{
Data d1=Data.getObject();
Data d2=Data.getObject();
if(d1==d2)
{
System.out.println("It is a singleton class");
}
else
{
System.out.println("It is not a singleton class");
}
}
}