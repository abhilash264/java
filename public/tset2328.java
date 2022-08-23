import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class tset2328 {
    public static void main(String args[]) throws Exception {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       for(int i=0;i<T;i++)
       {
           int N=sc.nextInt();
           int arr[]=new int[N];
           for(int j=0;j<N;j++)
           {
               arr[j]=sc.nextInt();
           }
           XYZ(arr,N);
       }
}
    
    public static void XYZ(int arr[],int N)
    {
        int max1=0;
        int sum=0;
        int power=0;
        for(int i=0;i<N;i++)
        {
            max1=Math.max(max1,arr[i]);
        }
        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
             sum+=Math.abs(arr[i]-arr[j]);

           }
       
    }
       power=sum*max1;
       System.out.println(power);
}
}