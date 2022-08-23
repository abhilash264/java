public class tset183
{
public static void main(String args[])
{
int arr[]={1,2,4,2,4};
for(int i=0;i<arr.length;i++)
{
int count=1;
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
count+=1;
}
}
if(count%2==1)
{
System.out.println(arr[i]);
}
}
}
}