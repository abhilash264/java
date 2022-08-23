public class Demo20
{
public static void main(String args[])
{
String s="22";
byte b1=Byte.parseByte(s);
b1++;
System.out.println(b1);
short s1=Short.parseShort(s);
s1+=5;
System.out.println(s1);
int i1=Integer.parseInt(s);
i1+=20;
System.out.println(i1);
long l1=Long.parseLong(s);
l1+=27;
System.out.println(l1);
double d1=Double.parseDouble(s);
d1+=5;
System.out.println(d1);
String s11=Byte.toString((byte)23);
s11+=1;
System.out.println(s11);
String s2=Integer.toString(45);
s2+=1;
System.out.println(s2);
String s3=Long.toString(129);
s3+=1;
System.out.println(s3);
String s4=Double.toString(12);
s4+=1;
System.out.println(s4);
}
}
