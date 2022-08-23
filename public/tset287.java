import java.util.Arrays;
public class tset287
{
public static void main(String args[])
{
int arr[]={1,2,2,3,4,4};
SumDistinct(arr,arr.length);
}
public static void SumDistinct(int[] arr, int size) {
int sum = 0;
Arrays.sort(arr);
for (int i = 0; i < (size - 1); i++) {
if (arr[i] != arr[i + 1])
sum += arr[i];
}
sum += arr[size - 1];
System.out.println(sum);
}
}
