import java.util.*;
class TestClass
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int i,count=1;
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{	
			if (a[i]+i>n)
				break;
			count++;
		}
		System.out.println(count);
	}
}