import java.util.*;
class Spread221
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i=0,j=0,k=0,days=1,s=0,count=0;
	for(k=0;k<t;k++)
	{
		days=1;
		int n=sc.nextInt();
                int a[]=new int[n];
                for(i=0;i<n;i++)
                	a[i]=sc.nextInt();
		int sum=a[0];
		s=sum;
		for(i=1;i<n&&i+s<n;i++)
		{
			s=sum;
			try
			{
			for(j=1;j<=s;j++)
				sum+=a[j];
			i=j-1;
			if (count==0)
				{
				count=1;
				}
			if (count!=0)
				days++;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
			//days--;
			}
		}
		System.out.println(days);
	}
    }
}