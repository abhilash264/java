public class tset435
{
public static void main(String args[])
{
int arr[]={16, 17, 4, 3, 5, 2};
int N=arr.length;
XYZ(arr,N);
}
public static void XYZ(int arr[],int N)
{

for(int i=0;i<N;i++)
{
int count=0;
for(int j=i+1;j<N;j++)
{
  if(arr[i]>arr[j])
	{
	   count+=1;
	}
}
if(count==(N-i-1))
	{
         System.out.println(arr[i]);
	}
}
}
}