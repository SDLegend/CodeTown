import java.util.*;
class SimStrings
{
	static int n;
	static String a,b,c;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=sc.next();
		b=sc.next();
		c=sc.next();
		int count=1;
		int max,min,sum;
		max=calcsum();
		min=0;
		while (count>=n)
		{
			sum=calcsum();
			if (sum<min)
				min=sum;
			if (sum>max)
				max=sum;
			count++;
			a=rotate(a);
		}
		System.out.println(max+" "+min);
		
	}
	static String rotate(String original)
    	{
        	char temp[]=original.toCharArray();
        
        	char last=temp[temp.length-1];
        	for(int i=temp.length-1; i>0; i--)
        	    temp[i]=temp[i-1];
	        temp[0]=last;
        
        	return String.valueOf(temp);
  	  }

	static int mymod(int n)
	{
		if (n<0)
			return -n;
		else
			return n;
	}
	static int calcsum()
	{
		int ss=0;
		for(int i=0;i<a.length();i++)
		{
			ss+=(mymod(a.charAt(i)-b.charAt(i))+mymod(a.charAt(i)-c.charAt(i)));
		}
		return ss;
	}
}