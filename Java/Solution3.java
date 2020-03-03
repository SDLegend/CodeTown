import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	Scanner sc=new Scanner(System.in);
	int i=0,j=0,n,k,count=0;
	n=sc.nextInt();
	k=sc.nextInt();
	int ar[]=new int[n];
	int br[]=new int[n];
	for(i=0;i<n;i++)
		ar[i]=sc.nextInt();
	for(i=0;i<n-1;i++)
		for(j=i+1;j<n;j++)
		{
		if (((ar[i]+ar[j])%k)==0)
			count++;
		}
   System.out.println(count); 
   }
}