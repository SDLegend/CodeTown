import java.util.*;
class Subset
{
	static int arr[];
	static int n,den=5;
	static int result;
	static int check()
	{
		for (int i = 0; i < n; i ++) 
		{  
			for (int j = i; j < n; j ++) 
			{ 
				result=0;
				for (int k = i; k <= j; k++) 
				{
					result+=arr[k];
					if (result%den==0)
						return 0;
				}
				if (result%den==0)
						return 0;
			} 
		}
		return 1;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		arr=new int[5];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		if (check()==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}