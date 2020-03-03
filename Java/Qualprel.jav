import java.util.*;
class Qualprel
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int i=0,j=0,count=1;
	for(i=0;i<t;i++)
		{
		int n=sc.nextInt();
		int k=sc.nextInt();
		int s[]=new int[n];
		for(j=0;j<n;j++)
			s[j]=sc.nextInt();
		Arrays.sort(s);
		count=k;
		while (n-k>0&&s[n-k-1]==s[n-k])
			{
			count++;
			k++;
			}
		}
	Sysem.out.println(count);
	}
}