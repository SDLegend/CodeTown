import java.util.*;
class SPREAD2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,j,k;
		for(k=0;k<t;k++)
		{
			int n=sc.nextInt();
			int[] a=new int[n];
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			
			int x=a[0];
			int sum=a[0];
			int days=1;
			j=0;
			n--;
			while(sum<n)
			{
				for(i=0;i<x;i++)
					sum+=a[j++];
				n-=x;
				x=sum;
				days++;
			}
			System.out.println(days);
		}
	}
}