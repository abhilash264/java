import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int q=sc.nextInt();
       sc.nextLine();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
	for(int m:arr)
		System.out.print(m+" ");
	sc.nextLine();
       for(int j=1;j<=q;j++)
       {
           int l=sc.nextInt();
           int r=sc.nextInt();
	   sc.nextLine();
           int sum=0;
             for(int i=l;i<=r;i++)
                {
                 sum+=(r-i+1)*arr[i-1];
                }
                 System.out.println(sum);
            }
        }
}
