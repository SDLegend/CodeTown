import java.util.*;
class Spread22
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i=0,j=0,k=0,days=1,m=0,flag=1,s=0;
        for(k=0;k<t;k++)
        {
	    days=1;
            int n=sc.nextInt();
            int a[]=new int[n];
            for(i=0;i<n;i++)
                a[i]=sc.nextInt();
            if (a[0]>=n)
                flag=0;
            else
            {
                i=1;
                int sum=a[0];
                for(j=i;j<=a[0];j++)
                {
                    sum+=a[j];
                    i++;
		}
		s=sum;
                while(1+a[0]+s<=n)
                    {
                        try{
			int tt=sum+i-1;
                        for(m=i;m<=tt;m++)
				sum+=a[m];
                        days++;
			i=m;
			s=sum;
			if (sum+i>=n)
				{
				days++;
				break;
				}
			}
			catch(ArrayIndexOutOfBoundsException e)
			{}
                    }
                
            }
            System.out.println(days);
            
        }
    }
}