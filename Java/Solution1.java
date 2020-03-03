import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n+1];
	int i=0;
	for(i=1;i<=n;i++)
		{
		a[i]=sc.nextInt();
		}
	int b[]=new int[n+1];
	for(i=0;i<=n;i++)
		b[i]=a[i];
   	int temp=b[n];
	for(i=n-1;i>=1;i--)
		{
		b[i+1]=b[i];
		} 
	b[1]=temp;
	int pmean=0;
	for(i=1;i<=n;i++)
		{
		pmean+=i*b[i];
		}
	System.out.println(pmean);
   }
}