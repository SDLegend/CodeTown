#include<stdio.h>
#define pi 3.14
void main()
{
int i,n,x;
float sum=0.0;
int fact(int );
printf("Enter x:");
scanf("%d",&x);
x=(x*pi)/180;
printf("Enter no of terms:");
scanf("%d",&n);
for(i=1;i<=n;i++)
    {
    sum=sum-(float)x*x/(fact(2*i+1)/fact(2*i-1));
    }
printf("Sum=%f",sum);
}
int fact(int x)
{
    int i,sum=0;
    for(i=0;i<=x;i++)
        {
            sum=sum*i;
        }
    return sum;
}
