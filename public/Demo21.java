import java.util.Scanner;
public class Demo21
{
public static void main(String args[])
{
Scanner ss=new Scanner(System.in);
System.out.println("Enter the size of array");
int size=ss.nextInt();
int arr[];
arr=new int[size];
System.out.println("\n see array elements after array is constructed \n");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]+"\t");
}
System.out.println("\nInitialize array elements\n");
for(int i=0;i<arr.length;i++)
{
arr[i]=ss.nextInt();
}
System.out.println("\n see array elements after array is intialized \n");
for(int x:arr)
{
System.out.println(x+"\t");
}
}
}
