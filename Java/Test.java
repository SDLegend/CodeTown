import java.util.*;
class Test
{
	public static void main(String args[])
	{
	int count=0;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=0;
	for(i=0;i<n;i++)
	{
		int a=sc.nextInt();
		int b=sc.nextInt();
		float r=((float)a)/b;
		System.out.println(r);
		if (r<=1.7&&r>=1.6)
		{
			count++;
			System.out.println("Count incremented");
		}
	}
	System.out.println(count);
	}
}
//https://www.hackerearth.com/challenge/competitive/hourstorm-5/algorithm/almost-golden-rectangular-1c9d72c0/