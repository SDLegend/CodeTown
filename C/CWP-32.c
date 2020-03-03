#include<stdio.h>
int main()
{
int n,i,sum=0;
printf("Enter one positive integer");
scanf("%d",&n);
if (n<=0)
    printf("Invalid data");
else
    {
    for(i=1;i<=n;i++)
        sum=sum+i;
    }
    printf("Sum is %d",sum);
}
