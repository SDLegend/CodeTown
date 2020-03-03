import java.util.*;
class CountPrefix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long lst[]=new long[n];
		for(int i=0;i<n;i++)
			lst[i]=sc.nextLong();
		int q=sc.nextInt();
		int count=0;
		for(int i=0;i<q;i++)
		{
			System.out.println(count);
			int l=sc.nextInt();
			int r=sc.nextInt();
			int k=sc.nextInt();
			count=0;
			for(int j=l-1;j<r;j++)
			{
				if (lst[j]%k==0){
					count+=1;
				System.out.println(count);}
				else
					break;
			}
			if (count==0)
				System.out.println("-1");
			else
				System.out.println(l-1+count);	
		}
	}

}