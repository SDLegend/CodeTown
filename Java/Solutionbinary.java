import java.util.*;
class Solutionbinary
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,j;
		for(i=0;i<t;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			if (a==0&&b==0&&c==0&&d==0)
				System.out.println("No");
			else if (a==0&&b==0&&c==0&&d==1)
				System.out.println("Yes");
			else if (a==0&&b==0&&c==1&&d==0)
				System.out.println("Yes");
			else if (a==0&&b==0&&c==1&&d==1)
				System.out.println("No");
			else if (a==0&&b==1&&c==0&&d==0)
				System.out.println("Yes");
			else if (a==0&&b==1&&c==0&&d==1)
				System.out.println("No");
			else if (a==0&&b==1&&c==1&&d==0)
				System.out.println("Yes");
			else if (a==0&&b==1&&c==1&&d==1)
				System.out.println("Yes");
			else if (a==1&&b==0&&c==0&&d==0)
				System.out.println("Yes");
			else if (a==1&&b==0&&c==0&&d==1)
				System.out.println("Yes");
			else if (a==1&&b==0&&c==1&&d==0)
				System.out.println("No");
			else if (a==1&&b==0&&c==1&&d==1)
				System.out.println("Yes");
			else if (a==1&&b==1&&c==0&&d==0)
				System.out.println("No");
			else if (a==1&&b==1&&c==0&&d==1)
				System.out.println("Yes");
			else if (a==1&&b==1&&c==1&&d==0)
				System.out.println("Yes");
			else 
				System.out.println("No");
			
		}
	}
}