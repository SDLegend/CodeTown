import java.util.*;
class SPREAD2
{
	static int n=0;
	static int check[];
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int m=0,j=0,i=0,days=1,sum=0,flag=1;
	for(m=0;m<t;m++)
		{
		days=1;
		n=sc.nextInt();
		int a[]=new int[n];
		check=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<=a[0];i++)
			{
			//check[i]=1;
			sum+=a[i];
			if (a[0]>=n+1)
			{
				flag=0;
				break;
			}
			}
		while(flag!=0)
		{
			int s=sum;
			int si=sum+i;
			for(j=0;j<si;j++)
			{
				if (n-s<si)
				{
					check[j]=1;
					sum+=a[j];
					if (2*s>(i+n))
					{
						flag=0;
						break;
					}
				}
				else
				{
					flag=0;
					break;
				}
			}
			days++;
			//System.out.println(days);
		}
		System.out.println(days);
		}
	}
}