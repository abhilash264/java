import java.util.*;
import java.lang.*;
import java.io.*;
class tset1244
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		XYZ(A,B);
	}
	public static void XYZ(int A,int B)
	{
	    while(A!=B)
	    {
	        if(A<B)
	         {
	             A=A*2;
	         }
	         else {
	             B=B*2;
	         }
	    }
	   if(A==B)
	   {
	       System.out.println("YES");
	   }
	   else{
	       System.out.println("NO");
	   }
	}
}