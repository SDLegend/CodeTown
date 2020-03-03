import java.util.*;
class Inventry
{
	static int a[];
	static int c1;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,j,k;
		for(k=0;k<t;k++)
		{
			int n=sc.nextInt();
			String temp=sc.next();
			a=new int[n];
			c1=0;
			for(i=0;i<n;i++)
			{
				if (temp.charAt(i)=='#')
				{
					a[i]=1;
					c1++;	
				}
				else
					a[i]=0;
			}
			int moves=0,count=0;
			for(i=0;i<n-1;i++)
			{
				if (a[n-1]==1)
					break;
				if (a[i]==0&&a[i+1]==1)
				{
					try{
					if (a[i+2]==0)
					{
						int tem=a[i];
						a[i]=a[i+1];
						a[i+1]=tem;
						if (i>0)
							i-=2;
						moves++;
					}
					else
					{
						j=i;
						while(a[j+2]!=0&&a[j+1]!=0)
						{
							j++;
							count++;
						}
						moves+=2*(count-1);
						if (j+count>=n)
							break;
						i--;
					}
					    }
					catch(Exception e){break;}
				}
			}
			if (check()==1)
				System.out.println(moves);
			else
				System.out.println(-1);
		}
	}
	static int check()
	{
		for(int i=0;i<c1;i++)
			if (a[i]!=1)
				return 0;
		return 1;	
	}
}