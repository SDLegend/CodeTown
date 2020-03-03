import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2
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
   	for(i=0;i<n-1;i++)
		for(j=0;j<n-1-i;j++)
		{
		if (b[j]>b[j+1])
			{
			int temp=b[j];
			b[j]=b[j+1];
			b[j+1]=temp;
			}
		}
	for(i=0;i<n;i++)
		pmean+=(i+1)*b[i];
	System.out.println(pmean);
   }
}