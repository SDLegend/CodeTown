import java.util.*;
class QUALPREL
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i=0,j=0;
		
                for(i=0;i<t;i++)
                    {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int count=k;
                        int s[]=new int[n];
			for(j=0;j<n;j++)
				s[j]=sc.nextInt();
			quick(s,0,n-1);
			//int temp=s[k];
                        if (k!=n)
                        while(s[k-1]==s[k])
                        {
                            k++;
                            count++;
                        }
                    System.out.println(count);
                    }
               
                
              
	}
        static void quick(int a[],int p, int r)
{
    int i,mid;
    if(p<r)
    {
        mid=partition(a,p,r);

        //printf("Pass %d: ",++pass);
       // for(i=0;i<n;i++)
            //printf("%d ",a[i]);
        //printf("\n");

        quick(a,p,mid-1);
        quick(a,mid+1,r);
    }
}
static int partition(int a[],int p, int r)
{
    int x,i,j,temp;
    x=a[r];
    i=p-1;
    for(j=p;j<=r-1;j++)
    {
        if(a[j]>=x)
        {
            i=i+1;
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
    i=i+1;
    temp=a[i];
    a[i]=a[r];
    a[r]=temp;

    return i;
}
}