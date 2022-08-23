public class Data
{
private static Data dd=null;
private Data()
{
System.out.println("Object is constructed");
}
public static Data getObject()
{
if(dd==null)
{
dd=new Data();
}
return dd;
}
}
