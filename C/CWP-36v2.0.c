#include<stdio.h>
void main()
{
int i,n,count=1;
float sum=0;
printf("Enter no of terms:");
scanf("%d",&n);
for(i=1;count<=n;i+=2)
    {
    sum=sum+ (float)i/(i+1);
    count++;
    }
printf("Sum=%f",sum);
}
