import java.util.ArrayList;
public class tset109
{
public static void XYZ(int arr1[],int arr2[])
{
ArrayList<Integer> al=new ArrayList<>();
for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr2.length;j++)
{
if(arr1[i]==arr2[j])
{
al.add(arr1[i]);
}
}
}
for(int i=0;i<arr2.length;i++)
{
if(al.contains(arr2[i])==false)
{
al.add(arr2[i]);
}
}
for(int l:al)
{
System.out.println(al+" ");
break;
}
}
public static void main(String args[])
{
int arr1[]={2,1,8,3};
int arr2[]={2,1,2,5,7,1,9,3,6,8,8};
XYZ(arr1,arr2);
}
}

 