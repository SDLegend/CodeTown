import java.util.*;
public class Chess
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int ta[]=new int[t];
	int i=0,j=0,k=0,n=0;
	for(i=0;i<t;i++)
		ta[i]=1;
	for(k=0;k<t;k++)
		{
		n=sc.nextInt();
		int c[][]=new int[n][n];
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				c[i][j]=sc.nextInt();
		for(i=0;i<n;i++)
		for(j=0;j<n-1;j++)
			if (c[i][j]==c[i][j+1])
				{
				ta[k]=0;
				break;
				}
		for(i=0;i<n-1;i++)
		for(j=0;j<n;j++)
			if (c[i][j]==c[i+1][j])
				{
				ta[k]=0;
				break;
				}
		}
	for(i=0;i<t;i++)
		{
		if (ta[i]==1)
			System.out.println("Yes");
		else
			System.out.println("No");
		}
	}
}