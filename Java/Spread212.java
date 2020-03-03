import java.util.Scanner;
class Spread212
{
static int a[];
public static void main (String args[])
{Scanner sc=new Scanner (System.in);
int t=sc.nextInt();
int temp=0,days=0,k,i,covered=0;
for(k=0;k<t;k++)
{
days=1;
int n=sc.nextInt();
a=new int[n];
for (i=0;i<n;i++)
          a[i]=sc.nextInt();
while(covered<n)
{
temp=add(covered);
covered+=temp;
days++;
}
System.out.println(days);
}

}
static int add(int limit)
{
int i,sum=0;
for (i=0;i<=limit;i++)
           sum+=a[i];
return sum;
}
}
