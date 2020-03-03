import java.util.*;
class Solution6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,j,l;
		for(i=0;i<t;i++)
		{
			String a=sc.next();
			String b=sc.next();
			l=(a.length()>b.length())?a.length():b.length();
			char ans[]=new char[l];
			for(j=0;j<l;j++)
			{
				if (a.length()-j>=0&&b.length()-j>=0)
					ans[j]=(char)(Integer.parseInt(a.substring(a.length()-j,a.length()-j+1))+Integer.parseInt(b.substring(b.length()-j,b.length()-j)));
				else if (b.length()-j<0)
					ans[j]=(char)(Integer.parseInt(a.substring(a.length()-j,a.length()-j+1)));
				else if (a.length()-j<0)
					ans[j]=(char)(Integer.parseInt(b.substring(b.length()-j,b.length()-j+1)));
			}
			for(j=0;j<l;j++)
				System.out.print(ans[j]);
		}
	}
}