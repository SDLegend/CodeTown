import java.util.*;
class TestClass101
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	int i=0,j=0,k=0,s=0;
	for(k=0;k<t;j++)
		{
		int flagh=1,flagv=1;
		int n=sc.nextInt();
		int mat[][]=new int[n][n];
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				{
				mat[i][j]=-1;
				if (sc.next().charAt(j)=='*')
					mat[i][j]=1;
				else if (sc.next().charAt(j)=='.')
					mat[i][j]=0;
				}
		if (n%2==1)
			s=(n/2)+1;
		for(i=0;i<=s;i++)
			for(j=0;j<n;j++)
				if(mat[i][j]!=mat[n-i][j])
					flagv=0;
		for(i=0;i<=n;i++)
			for(j=0;j<=s;j++)
				if(mat[i][j]!=mat[i][n-j])
					flagh=0;
		if(flagh==1&&flagv==1)
			System.out.println("BOTH");
		else if(flagh==1&&flagv==0)
			System.out.println("HORIZONTAL");
		else if(flagh==0&&flagv==1)
			System.out.println("VERTICAL");
		else 
			System.out.println("NO");
		}
	}
}