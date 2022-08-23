 class Test0
{
int data;
Test0()
{
data++;
System.out.println("object is constructed");
}
{
data+=5;
System.out.println("First object block");
}
public static void main(String args[])
{
System.out.println("In main");
Test0 tt=new Test0();
System.out.println(tt.data);
 }
{
data*=5;
System.out.println("Second object block");
}
}