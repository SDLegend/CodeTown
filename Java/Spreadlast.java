import java.util.*;
class Spreadlast
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,j,k,days,sum,s,flag=1,n;
		for(k=0;k<t;k++)
		{
			days=1;
			flag=1;
			n=sc.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++)
				a[i]=sc.nextInt();
			sum=a[0];
			s=sum;
			i=0;
			j=0;
			while(flag!=0&&a[0]<n)
			{
				try{
				for(j=i+1;j<=s;j++)
					sum+=a[j];
				i=j-1;
				s=sum+i;
				days++;
				if (j<n)
					flag=0;
				    }
				catch(ArrayIndexOutOfBoundsException e)
				{}
			}
			System.out.println(days);
		}
	}
}