#include<stdio.h>
void main()
{
    int i=0,j=0,k=0,days=1,m=0,flag=1,t=1,n;
    int a[10000];
    scanf("%d",&t);
    for(k=0;k<t;k++)
    {
        days=1;
        scanf("%d",&n);
        for(i=0;i<n;i++)
            scanf("%d",&a[i]);
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
                while(flag!=0)
                    {
                        int s=sum;
                        int tt=sum+i-1;
                        for(m=i;m<=tt;m++)
                            sum+=a[m];
                       days++;
                       // s=sum;
                    if (sum+i>=n)
                        {
                       // days++;
                        flag=0;
                        }
                    }

            }

            printf("%d",days);

    }
}
