import java.util.*;
 
class tset8272{
 
static void printSubStrings(int arr[])
{
for(int i=0;i<arr.length;i++)
	{
	  String s1="";
	for(int j=i;j<arr.length;j++)
		{
		s1+=arr[j];
		System.out.print(s1+" "+"\n");
		}
	}
}
public static void main(String args[])
	{
	int arr[]={1,2,3,4,5};
	printSubStrings(arr);
	}
}
 
