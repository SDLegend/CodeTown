import java.util.*;
class QABC
{
	static int a[];
	static int b[];
	static int n;
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int i=0,j=0,k=0,flag=0;
	for(i=0;i<t;i++)
		{
		n=sc.nextInt();
		a=new int[n];
		b=new int[n];
		for(j=0;j<n;j++)
			a[j]=sc.nextInt();
		for(j=0;j<n;j++)
			b[j]=sc.nextInt();
		//if (b[n-1]%3!=0)
			//flag=0;
		
			int tm=b[n-1]/3;
			for(k=0;k<tm;k++)
				{
				magicr(n-3);
				if (check()==1)
					break;
				}
			for(k=n-1;k>1;k--)
				{
				magicr(k-3);
				if (check()==1)
					break;
				}
			
		if (flag==0)
			System.out.println("TAK");
		else
			System.out.println("NIE");
		}
	}
	static void magicr(int n)
	{
		b[n]-=1;
		b[n+1]-=2;
		b[n+2]-=3;
	}
	static int check()
	{
	for(int i=0;i<n;i++)
		{
		if (a[i]!=b[i])
			return 0;
		}
	return 1;
	}
}