import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution8
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int i=0,j=0,pmean=0;
	for(i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
	int b[]=new int[n+1];
	for(i=0;i<n;i++)
		b[i]=a[i];
   	int min=b[0];
	for(i=0;i<n;i++)
	{
		if (b[i]<min)
		{
		min=b[i];
		}	
	}
	while(b[0]!=min)
		{
		int temp=b[0];
		for(i=0;i<n-1;i++)
			b[i]=b[i+1];
		b[n-1]=temp;
		}	
	for(i=0;i<n;i++)
		pmean+=(i+1)*b[i];
	System.out.println(pmean);
   }
}