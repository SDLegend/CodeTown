#include<stdio.h>
void main()
{
int i,n,count=1,sum=0;
printf("Enter no of terms:");
scanf("%d",&n);
for(i=2;count<=n;i*=2)
    {
    sum=sum+i;
    count++;
    }
printf("Sum=%d",sum);
}
