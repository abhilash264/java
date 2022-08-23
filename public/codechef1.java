/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		  int N=sc.nextInt();
		  int p[]=new int[N-1];
		  for(int j=0;j<N-1;j++)
		  {
		  p[j]=sc.nextInt();
		  }
		  
		  XYZ(p,N);
		 
		}
		  
		
	}
	public static void XYZ(int p[],int N)
	{
	    int t1=0;
	    int t2=p[p.length-1];
	    for(int i=0;i<p.length;i++)
	    {
	       t1+=p[i];
	       t2+=t1;
	    }
	  
	   System.out.println(t2);
	}
}
