import java.util.*;
class Test6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	
		int pr=0;
		int i,j;
		Vector<Integer> v=new Vector<Integer>(1,1);
		for(i=0;i<n;i++)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();
			for(j=0;j<y;j++)
				v.addElement(x);
		}
		int q=sc.nextInt();
		for(i=0;i<q;i++)
		{	pr=0;
			int f=sc.nextInt();
			int t=sc.nextInt();
			for(j=f;j<t;j++)
			{
				pr+=v.elementAt(j);
			}
			System.out.println(pr*10);
		}
	}
}