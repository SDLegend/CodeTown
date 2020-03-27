class Knapsack01
{
	public static void main(String args[])
	{
		int values[]={1,2,5,6};
		int weights[]={2,3,4,5};
		int size=8;
		int n=values.length;
		int matrix[][]=new int[n+1][size+1];
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=size;j++)
			{
				if (j>=weights[i-1])
					matrix[i][j]=Maximum.max(matrix[i-1][j],matrix[i-1][j-weights[i-1]]+values[i-1]);
				else
					matrix[i][j]=matrix[i-1][j];
			}
		}
		//Print.matrix(matrix,n+1,size+1);
		System.out.println(matrix[n][size]);
	}
}
class Maximum
{
	static int max(int a,int b)
	{
		if (a>b)
			return a;
		return b;
	}
}
class Print
{
	static void matrix(int mat[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(mat[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}