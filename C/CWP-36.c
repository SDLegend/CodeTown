#include<stdio.h>
int main()
{
int n,i;
float sum;
printf("Enter one postive integer");
scanf("%d",&n);
if (n<=0) printf("Invalid data");
else
{
    for(i=1;i<=n;i++)
        sum=sum+(float)(2*i-1)/(2*i);
    printf("Sum=%f",sum);
}
}
