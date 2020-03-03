import java.util.*;
class TestClass1
{
	public static void main(String args[])
	{	Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c[]=new char[s.length()];
		c=s.toCharArray();
		int i,count=0;
		for(i=0;i<c.length;i++)
		{
			if (c[i]=='l')
				count=1;
			if (count==1)
				if (c[i]=='o')
					count=2;
			if (count==2)
				if (c[i]=='v')
					count=3;
			if (count==3)
				if (c[i]=='e')
					count=4;
		}
		if (count==4)
			System.out.println("I love you, too!");
		else
			System.out.println("Let us breakup!");
	}
}