import java.util.*;
class Finding
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int l=0,m=0,i=0,j=0,c1=1,c2=1;
	try{
	for(l=0;l<t;l++)
		{
		int n=sc.nextInt();
		int s[]=new int[n];
		for(m=0;m<n;m++)
			s[m]=sc.nextInt();
		Arrays.sort(s);
		for(i=0;i<n-1;i++)
		{
			if (s[i]==s[i+1])
			{
			j=i;
			while (j<n&&s[j]==s[j+1])
				{
				c2++;
				j++;
				}
			c1*=c2;
			i=j-1;
			
			}
		c2=1;
		}
	}
	catch ()
	finally{
		System.out.println(c1);
		}
	}
	}
}