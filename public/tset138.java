public class tset138
{
public static void main(String args[])
{
int arr[]={8,3,6,9,2,1,4};
tset138 ts=new tset138();
ts.BubbleSort(arrS);
for(int i:arr)
{
System.out.println(i+" ");
}
}
public void Bubblesort(int arr[])
{
for(int i=0;i<arr.length-1;i++)
{
for(int j=0;j<arr.length-i-1;j++)
{
if(arr[j]>arr[j+1])
{
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
}
