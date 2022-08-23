import java.util.*;
class GFG
	{
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
      		while(t-->0)
		{
		int N=sc.nextInt();
		GFGFunction g=new GFGFunction();
		g.forkJava(N);
		}
	}
  }
class GFGFunction
	{
	static void forkJava(int N)
		{
	if(N%3==0)
		{
		System.out.println("Fork");
		}
	if(N%5==0)
		{
		System.out.println("Java");
		}
	if(N%3==0 && N%5==0)
		{
		System.out.println("Fork Java");
		}
}
}