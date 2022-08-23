public class tset365
	{
	public static void main(String args[])
		{
		String s1="This is a java program";
		String word="java";
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++)
			{
			if(s2[i]==word)
			{
                                 System.out.println("Yes");
			}
			else
			     System.out.println("No");
		}
	}
}