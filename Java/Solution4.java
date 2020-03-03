import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Point
{
	int x,y;
	double t;
	Point()
	{
	x=y=1;
	}
	Point(int a,int b)
	{
	x=a;
	y=b;
	}
	double getAngle()
	{
		if (x==0&&y>0)
			return 90;
		if (x==0&&y<0)
			return 270;
		if (x!=0)
			{
			t=((double)y)/x;
			double z=(Math.atan(t)*180)/Math.PI;
			if (z<0)
				return -z;
			else
				return z;
			}	
		else return 0;
	}
	double getDistance()
	{
	return Math.sqrt(x*x+y*y);
	}
	void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
	}
	void display()
	{
	System.out.println(x+" "+y);
	}	
}
public class Solution4 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Point p[]=new Point[n];
	int i=0,j;
	for(i=0;i<n;i++)
		{
		p[i]=new Point();
		p[i].getDetails();
		}
	for(i=0;i<n-1;i++)
		for(j=0;j<n-1-i;j++)
		{
		if (p[j].getAngle()>p[j+1].getAngle())
			{
			Point temp=p[j];
			p[j]=p[j+1];
			p[j+1]=temp;
			}
		}
	for(i=0;i<n;i++)
		p[i].display();
    }	
}