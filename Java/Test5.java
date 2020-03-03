import java.util.*;
class Test5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,j;
		for(i=0;i<t;i++)
		{	int sum=0;
			int n=sc.nextInt();
			int a[]=new int[n];
			for(j=0;j<n;j++)
			{
				int temp=sc.nextInt();
				sum+=temp;
			}
			if (sum<0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
