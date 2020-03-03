import java.util.*;
class RotationQuery
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		long lst[]=new long[n];
		for(int i=0;i<n;i++)
			lst[i]=sc.nextLong();
		for(int i=0;i<n;i++)
		{
			long x=RotationQuery.giveSum(i,lst,n,k);
			long temp=0;
			if (x==k)
				temp=0;
			else if (x==0)
				temp=k;
			else
				temp=k^x;
			lst[(int)(i+x)%n]=temp;
		}
		long tempsum=0;
		for(int i=0;i<n;i++)
			tempsum+=lst[i];
		System.out.println(tempsum);

	}
	public static long giveSum(int i,long lst[],int n,long k)
	{
		long sum=0;
		for(int j=i;j<n;j++)
		{
			if((sum+lst[j])<=k)
				sum+=lst[j];
			else
				break;
		
		}
		return sum;
	}
}