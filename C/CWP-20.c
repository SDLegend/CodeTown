#include<stdio.h>
void main()
{
int n,i,sum=0,prod=1,rev=0;
printf("Enter one positive integer:");
scanf("%d",&n);
for(i=0;n>0;i++)
    {
    sum=sum+n%10;
    prod=prod*(n%10);
    rev=rev*10+n%10;
    n=n/10;
    }
printf("Sum of digits=%d\n",sum);
printf("Product of digits=%d\n",prod);
printf("Reversed number=%d",rev);
}
