import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int i,j,p,q;
		int n=sc.nextInt();
		double a[]=new double[n];
		double d[]=new double[n];
		int x[]=new int[n];
		int y[]=new int[n];
		int temp;
		for(i=0;i<n;i++)
		{
			p=sc.nextInt();
			q=sc.nextInt();
			x[i]=p;
			y[i]=q;
			d[i]=Math.sqrt(p*p+q*q);
			if(p==0) a[i]=99999.98;
			else a[i]=Math.atan(q/p);
		}
		for(i=0;i<n;i++)
			for(j=0;j<(n-1-i);j++)
			{
				if(a[i+1]>a[i])
				{
					temp=x[i];
					x[i]=x[i+1];
					x[i+1]=temp;
					
					temp=y[i];
					y[i]=y[i+1];
					y[i+1]=temp;
				}
			}
			
		for(i=0;i<n;i++)
			for(j=0;j<(n-1-i);j++)
			{
				if(a[i+1]==a[i])
				{
					if(d[i+1]>d[i])
					{
						temp=x[i];
						x[i]=x[i+1];
						x[i+1]=temp;
					
						temp=y[i];
						y[i]=y[i+1];
						y[i+1]=temp;
					}
				}
			}
			
		for(i=0;i<n;i++)
		{
			
			System.out.println(x[i]+" "+y[i]);
		}
}
}