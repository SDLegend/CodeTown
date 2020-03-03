import java.util.*;
class Solution9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,j,error=0,count=1;
		for(i=0;i<t;i++)
		{
			error=0;
			count=10;
			try{
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			while(a!=0&&b!=0)
			{
			    if (b/10==0)
			    {
			        error+=((a%10)*count);
			    	a=a/10;
			    	b=b/10;
			    	count*=10;
			    	break;
			    }
			    else if (a/10==0)
			    {
			        error+=((b%10)*count);
			    	a=a/10;
			    	b=b/10;
			    	count*=10;
			    	break;
			    }
			    else
			    {
				error+=(((a%10+b%10)/10)*count);
				a=a/10;
				b=b/10;
				count*=10;}
			}
			}
			catch(Exception e){}
			System.out.println(error);
		}
	}
}
