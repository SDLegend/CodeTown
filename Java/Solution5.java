import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution5 
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int i=0;
	for(i=0;i<n;i++)
		a[i]=sc.nextInt();
	int temp=a[n-1];
	for(i=n-2;i>=0;i--)
		{
		a[i+1]=a[i];
		}
	a[0]=temp;
	int pmean=0;
	for(i=0;i<n;i++)
		{
		pmean+=(i+1)*a[i];
		}
  	System.out.println(pmean);	
    }
}