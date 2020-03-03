import java.util.*;
class Alice
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int i=a.length()-1;
		int flag=1;
		int min=(b.charAt(i)-a.charAt(i));
		while(i>=0)
		{
			if ((b.charAt(i)-a.charAt(i))<min)
				{
					flag=0;
					break;
				}
			else
				min=(b.charAt(i)-a.charAt(i));
			i--;
		}
		if (flag==0)
			System.out.println("NO");
		else
			System.out.println("YES");
	}
}