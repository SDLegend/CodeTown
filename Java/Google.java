import java.util.*;
class Google
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c[];
		int flag=1;
		int i=0;
		c=s.toCharArray();
		if (c[i]=='g'||c[i]=='G')
		{
			i++;
			switch(c[i])
			{
				case 'o':
				case 'O':
				case '0':i++;break;
				case '(':if (c[i+1]==')')
						i+=2;break;
				case '[':if (c[i+1]==']')
						i+=2;break;
				case '<':if (c[i+1]=='>')
						i+=2;break;
				default:flag=0;break;
			}
			switch(c[i])
			{
				case 'o':
				case 'O':
				case '0':i++;break;
				case '(':if (c[i+1]==')')
						i+=2;break;
				case '[':if (c[i+1]==']')
						i+=2;break;
				case '<':if (c[i+1]=='>')
						i+=2;break;
				default:flag=0;break;
			}
			if (c[i]=='g'||c[i]=='G')
				i++;
			else
				flag=0;
			if (c[i]=='l'||c[i]=='L'||c[i]=='|')
				i++;
			else
				flag=0;
			if (c[i]=='e'||c[i]=='E'||c[i]=='3')
				i++;
			else
				flag=0;
			try
			{
				if (c[i]=='e')
					flag=0;
			}
			catch(Exception e)
			{
			}
		}
		else
			flag=0;
		if (flag==0)
			System.out.println("False");
		else
			System.out.println("True");
	}
}