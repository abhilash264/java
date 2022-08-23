public class Demo6
{
public static void main(String args[])
{
Byte bb1=new Byte((byte)104);
System.out.println(bb1);
Byte bb2=new Byte("105");
System.out.println(bb2);
byte b1=Byte.parseByte("26");
b1++;
System.out.println(b1);
String ss=Byte.toString((byte)12);
ss+=1;
System.out.println(ss);
}
}