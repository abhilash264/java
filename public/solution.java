import java.util.ArrayList;
import java.util.*;

public class Solution {
	public static int teenPatti(ArrayList<Integer> arr, int n) {
        Scanner sc=new Scanner(System.in);
		int p[]=new int[arr.size()];
        for(int i=0;i<n;i++)
        {
          p[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
            for(int k=0;k<n;k++)
            {
             if((p[i]&p[j]&p[k])==0)
             {
               count+=1;
             }
            }
          }
        }
        return count;
	}
public static void main(String args[])
{
ArrayList<Integer> arr=new ArrayList<>();
arr.add(2);
arr.add(2);
arr.add(1);
int n=arr.size();
teenPatti(arr,n);
}
}